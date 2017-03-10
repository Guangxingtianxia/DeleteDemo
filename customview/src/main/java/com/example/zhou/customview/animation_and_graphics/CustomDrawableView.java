package com.example.zhou.customview.animation_and_graphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

/**
 * Created by Mr_Zhou on 2017/2/5.
 */

public class CustomDrawableView extends View
{

    private ShapeDrawable mDrawable;


    /**
     * Simple constructor to use when creating a view from code.
     *
     * @param context The Context the view is running in, through which it can
     *                access the current theme, resources, etc.
     */
    public CustomDrawableView(Context context)
    {
        super(context);

        int x = 1;
        int y = 10;
        int width = 300;
        int height = 50;
        mDrawable = new ShapeDrawable(new OvalShape());
        mDrawable.getPaint().setColor(0xff74ac23);
        mDrawable.setBounds(x, y, x + width, y + height);

    }


    @Override
    protected void onDraw(Canvas canvas)
    {
        mDrawable.draw(canvas);
    }
}
