package com.bignerdranch.android.restaurant.Fragment

import android.os.Bundle
import android.support.design.widget.BottomSheetDialog
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.bignerdranch.android.restaurant.Adapter.MenuAdapter
import com.bignerdranch.android.restaurant.Adapter.ShowAdapter
import com.bignerdranch.android.restaurant.MenuInterface
import com.bignerdranch.android.restaurant.Model.Menu
import com.bignerdranch.android.restaurant.Model.show
import com.bignerdranch.android.restaurant.R
import com.bignerdranch.android.restaurant.Util.RecyclerViewItemTouchListener
import kotlinx.android.synthetic.main.item_menu.view.*
import kotlinx.android.synthetic.main.item_show.view.*
import kotlinx.android.synthetic.main.share_layout.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.*

class MenuFragment : Fragment(){


    private var mList = ArrayList<Menu.ResultsBean>()
    var showList=ArrayList<show>()

    fun newInstance(): MenuFragment {
        val args = Bundle()
        val fragment = MenuFragment()
        fragment.setArguments(args)
        return fragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v=inflater.inflate(R.layout.fragment_menu,container,false)

        val recy= v.findViewById(R.id.menu_recy) as RecyclerView
        recy.layoutManager= GridLayoutManager(context,3)
        recy.adapter= MenuAdapter(mList)

        recy.addOnItemTouchListener(RecyclerViewItemTouchListener(recy, object : RecyclerViewItemTouchListener.OnItemClickListener {
            override fun onItemClick(view: View) {
                view.add.setOnClickListener {
                    val position = recy.getChildAdapterPosition(view)
                    showList[position].dishes_amount++ }
            }
            override fun onItemLongClick(view: View) {
            }
        }))

        return v
    }

    fun init(){
        val retrofit=Retrofit.Builder()
                .baseUrl("http://120.78.174.70:8000/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()

        val retrofitInterface=retrofit.create(MenuInterface::class.java)

        retrofitInterface.getMenu()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    result->
                        for (i in 0..result.results.size-1)
                        {
                            var dish=Menu.ResultsBean()
                            dish.dishes_cursine=result.results[i].dishes_cursine
                            dish.dishes_healthy=result.results[i].dishes_healthy
                            dish.dishes_hot=result.results[i].dishes_hot
                            dish.dishes_name=result.results[i].dishes_name
                            dish.dishes_number=result.results[i].dishes_number
                            dish.dishes_price=result.results[i].dishes_price
                            dish.dishes_taste=result.results[i].dishes_taste
                            var img=("http://120.78.174.70:8000/static/"+(i+1)+".jpg")
                            dish.dishes_img=img
                            mList.add(dish)
                        }
                    for (i in 0..mList.size-1){
                        var show=show()
                        show.dishes_number=mList[i].dishes_number
                        show.dishes_name=mList[i].dishes_name
                        show.dishes_price=mList[i].dishes_price
                        show.dishes_amount=0
                        showList.add(show)
                    }

                },
                        {error->
                            Log.d("Kotlin1",error.toString())
                        }
        )


    }

    fun showBottomSheetDialog() {
        var bsDialog = BottomSheetDialog(context!!)
        //默认Cancelable和CanceledOnTouchOutside均为true
        //bsDialog.setCancelable(true);
        //bsDialog.setCanceledOnTouchOutside(true);
        //为Dialog设置布局

        bsDialog.setContentView(R.layout.share_layout)
        bsDialog.show_recy.layoutManager= LinearLayoutManager(context)
        bsDialog.show_recy.adapter= ShowAdapter(showList)
        bsDialog.show_recy.addOnItemTouchListener(RecyclerViewItemTouchListener(bsDialog.show_recy, object : RecyclerViewItemTouchListener.OnItemClickListener {
            override fun onItemClick(view: View) {
                view.jian.setOnClickListener {
                    val position =  bsDialog.show_recy.getChildAdapterPosition(view)
                    showList[position].dishes_amount++
                    view.amount.text=showList[position].dishes_amount.toString()
                }
                view.jia.setOnClickListener {
                    val position =  bsDialog.show_recy.getChildAdapterPosition(view)
                    showList[position].dishes_amount--

                    if (showList[position].dishes_amount==0)
                    {
                        var param  = view.getLayoutParams()
                        view.setVisibility(View.GONE)
                        param.height = 0
                        param.width = 0
                    }
                    else
                    {
                        var param  = view.getLayoutParams()
                        param.height = LinearLayout.LayoutParams.WRAP_CONTENT
                        param.width = LinearLayout.LayoutParams.MATCH_PARENT
                        view.setVisibility(View.VISIBLE)
                    }

                    view.amount.text=showList[position].dishes_amount.toString()
                }
            }
            override fun onItemLongClick(view: View) {
            }
        }))

        bsDialog.show()
    }

}