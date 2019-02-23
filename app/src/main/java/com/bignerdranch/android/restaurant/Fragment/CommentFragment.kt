package com.bignerdranch.android.restaurant.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bignerdranch.android.restaurant.Adapter.CommentAdapter
import com.bignerdranch.android.restaurant.Model.Comment
import com.bignerdranch.android.restaurant.R
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class CommentFragment : Fragment() {

    private var mList = ArrayList<Comment>()
    lateinit var recy:RecyclerView

    fun newInstance(): CommentFragment {

        val args = Bundle()

        val fragment = CommentFragment()
        fragment.setArguments(args)
        return fragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        EventBus.getDefault().register(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v=inflater.inflate(R.layout.fragment_menu,container,false)

        recy=v.findViewById(R.id.menu_recy) as RecyclerView
        recy.layoutManager= LinearLayoutManager(context)
        recy.adapter= CommentAdapter(mList)

        return v
    }

    fun init(){
        var comment1=Comment()
        comment1.username="带带大师兄"
        comment1.comment="萨德覅偶金额外地生，没空每个人都进口红酒发达国家很可观的撒娇很可观的萨接口的撒娇看打蛮简单，打广告，费大幅度， 费大幅度，房东给对方"
        comment1.time="2018年6月1日 22:45"
        mList.add(comment1)

        var comment2=Comment()
        comment2.username="我都想笑了"
        comment2.comment="去我认为秋日我去柔情我日我强迫人防，的态度是公认的又热又同行业图样图哈哈"
        comment2.time="2012年7月15日 15:30"
        mList.add(comment2)

        var comment3=Comment()
        comment3.username="nigger"
        comment3.comment="行政村，啥打开两个第三方为空楼梯间额任务人"
        comment3.time="2129年4月6日 05:45"
        mList.add(comment3)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun getComment(bundle: Bundle)
    {
        var comment=Comment()
        comment.username=bundle.getInt("id").toString()
        comment.comment=bundle.getString("comment")
        comment.time=bundle.getString("time")
        mList.add(comment)
        recy.adapter.notifyDataSetChanged()
    }

    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }
}