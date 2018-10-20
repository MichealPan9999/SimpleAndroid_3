package com.example.animationtest1.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class OnTouchView extends View {
    int mLastX = 0;
    int mLastY = 0;
    public OnTouchView(Context context) {
        super(context);
    }

    public OnTouchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public OnTouchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public OnTouchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();
        //Log.d("panzqww","x = "+x+" , y = "+y);
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                int deltaX = x - mLastX;
                int deltaY = y - mLastY;

                int trabslationX = (int) (getTranslationX()+deltaX);
                int trabslationY = (int) (getTranslationY()+deltaY);
                setTranslationX(trabslationX);
                setTranslationY(trabslationY);
                break;
        }
        mLastX = x;
        mLastY = y;
        return true;
    }
}
