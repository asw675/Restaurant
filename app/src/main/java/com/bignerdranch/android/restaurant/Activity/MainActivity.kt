package com.bignerdranch.android.restaurant.Activity

 import android.content.Intent
 import android.icu.text.SimpleDateFormat
 import android.os.Bundle
 import android.support.annotation.Nullable
 import android.support.v4.app.Fragment
 import android.support.v4.app.FragmentStatePagerAdapter
 import android.support.v7.app.AppCompatActivity
 import android.view.Gravity
 import android.view.Menu
 import android.view.MenuItem
 import com.bignerdranch.android.restaurant.Dialog.CommentDialog
 import com.bignerdranch.android.restaurant.Fragment.CommentFragment
 import com.bignerdranch.android.restaurant.Fragment.MenuFragment
 import com.bignerdranch.android.restaurant.Model.show
 import com.bignerdranch.android.restaurant.R
 import kotlinx.android.synthetic.main.activity_main.*
 import org.greenrobot.eventbus.EventBus
 import java.util.*


class MainActivity : AppCompatActivity() {

    val title:Array<String> = arrayOf("菜单","发现")
    var showList=ArrayList<show>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        initView()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings ->
            {   ToUser()
                true}
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun ToUser(){
        val i=Intent()
        i.setClass(this,UserAcitivity::class.java)
        startActivity(i)
    }

    fun initView(){
        tab.setupWithViewPager(type)
        val fragmentManager = supportFragmentManager
        type.adapter=(object : FragmentStatePagerAdapter(fragmentManager) {
            override fun getItem(i: Int): Fragment {
                when(i){
                    1-> return CommentFragment().newInstance()
                }
                return MenuFragment().newInstance()
            }

            override fun getCount(): Int {
                return title.size
            }

            @Nullable
            override fun getPageTitle(position: Int): CharSequence? {
                return title[position]
            }
        })

        cart.setOnClickListener {
            if(type.currentItem==0)
            {
                val frag = type
                        .getAdapter()
                        ?.instantiateItem(type, type.getCurrentItem()) as MenuFragment
                frag.showBottomSheetDialog()
            }
            else if (type.currentItem==2)
            {
                val dialog=CommentDialog(this,object :CommentDialog.ReCommentListener{
                       override fun ReComment(string: String){
                            NewComment(1,string)
                    }
                })
                dialog.show()
                val screenWidth = this.getWindowManager().getDefaultDisplay().getWidth(); // 屏幕宽
                val screenHeight = this.getWindowManager().getDefaultDisplay().getHeight(); // 屏幕高
                val lp = dialog.getWindow().getAttributes();
                lp.gravity= Gravity.CENTER
                lp.width = (screenWidth * 0.9).toInt() // 宽度
                lp.height = (screenHeight * 0.7).toInt()
                dialog.getWindow().setAttributes(lp)
            }
        }
    }

    fun NewComment(id:Int,comment:String){
        val simpleDateFormat = SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss")// HH:mm:ss
        val date = Date(System.currentTimeMillis())
        val timeStr=simpleDateFormat.format(date)
        var bundle=Bundle()
        bundle.putSerializable("id",id)
        bundle.putSerializable("comment",comment)
        bundle.putSerializable("time",timeStr)
        EventBus.getDefault().post(bundle)
    }

}
