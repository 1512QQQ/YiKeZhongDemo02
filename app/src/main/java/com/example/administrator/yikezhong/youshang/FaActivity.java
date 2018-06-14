package com.example.administrator.yikezhong.youshang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.yikezhong.MainActivity;
import com.example.administrator.yikezhong.R;
import com.facebook.drawee.view.SimpleDraweeView;

public class FaActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 返回
     */
    private TextView mBtn;
    private ImageView mText1;
    /**
     * 发表成功快分享给好友捧场！
     */
    private TextView mText2;
    private LinearLayout mText3;
    /**
     * 前去看看
     */
    private Button mText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fa);
        initView();
    }

    private void initView() {
        mBtn = (TextView) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);
        mText1 = (ImageView) findViewById(R.id.text1);
        mText1.setOnClickListener(this);
        mText2 = (TextView) findViewById(R.id.text2);
        mText2.setOnClickListener(this);
        mText3 = (LinearLayout) findViewById(R.id.text3);
        mText3.setOnClickListener(this);
        mText4 = (Button) findViewById(R.id.text4);
        mText4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn:
                Intent intent = new Intent(FaActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.text1:

                break;
            case R.id.text2:
                break;
            case R.id.text3:
                break;
            case R.id.text4:
                break;
        }
    }
}
