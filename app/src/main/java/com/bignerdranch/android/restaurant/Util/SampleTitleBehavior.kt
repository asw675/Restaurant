package com.bignerdranch.android.restaurant.Util

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.util.AttributeSet
import android.view.View
import android.widget.Toolbar


class SampleTitleBehavior : CoordinatorLayout.Behavior<View> {
    constructor() : super()
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    private var mStartY: Float = 0F

    override fun layoutDependsOn(parent: CoordinatorLayout?, child: View?, dependency: View?): Boolean {
        return dependency is Toolbar
    }
    override fun onDependentViewChanged(parent: CoordinatorLayout?, child: View?, dependency: View?): Boolean {
        //记录开始的Y坐标  也就是toolbar起始Y坐标
        if (mStartY == 0F) {
            mStartY = dependency!!.getY()
        }

        //计算toolbar从开始移动到最后的百分比
        val percent = dependency!!.getY() - mStartY

        //改变child的坐标(从消失，到可见)

        child?.alpha=(percent+150)/150

        return true
    }
}