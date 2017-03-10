package com.example.zhou.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * 功能：com.example.zhou.customview
 * 创建者：周广亚
 * 创建日期：2016/12/9 2:18
 */

public class ViewGroupDemo extends ViewGroup
{
    public ViewGroupDemo(Context context)
    {
        super(context);
    }

    public ViewGroupDemo(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public ViewGroupDemo(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }


    /**
     * 在viewGroup中是抽象类，在View中是
     * Called from layout when this view should
     * assign a size and position to each of its children.
     *
     * Derived classes with children should override
     * this method and call layout on each of
     * their children.
     * @param changed This is a new size or position for this view
     * @param left Left position, relative to parent
     * @param top Top position, relative to parent
     * @param right Right position, relative to parent
     * @param bottom Bottom position, relative to parent
     */
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom)
    {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++)
        {
            View childView  = getChildAt(i);
            childView.layout(childView.getMeasuredWidth(),0,(i+1)*childView.getMeasuredWidth(), childView.getMeasuredHeight());
        }


    }

    /**
     *
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++)
        {
            View childView  = getChildAt(i);

            measureChild(childView,widthMeasureSpec,heightMeasureSpec);
            measureChildren(widthMeasureSpec,heightMeasureSpec);
        }




    }
}
