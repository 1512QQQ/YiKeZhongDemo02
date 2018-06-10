package com.example.administrator.yikezhong.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.administrator.yikezhong.R;

public class CustomerView2 extends RelativeLayout {
    public CustomerView2(Context context) {
        super(context);
    }

    public CustomerView2(Context context, AttributeSet attrs) {
        super(context, attrs);
        View view = LayoutInflater.from(context).inflate(R.layout.customer2, this, false);
    }

    public CustomerView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
