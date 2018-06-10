package com.example.administrator.yikezhong.my;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.yikezhong.R;
import com.facebook.drawee.view.SimpleDraweeView;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener {

    private JCVideoPlayerStandard jcVideoPlayerStandard;
    private ImageView img01;
    private ImageView img02;
    private ImageView mImg01;
    private ImageView mImg02;
    private int tag1;
    private int tag2;
    private ImageView mImg03;
    private SimpleDraweeView mImg04;
    /**
     * 15963万次播放  今天19:23
     */
    private TextView mText2;
    private ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        initView();

        Intent intent = getIntent();
        String dizhi = intent.getStringExtra("dizhi");

        jcVideoPlayerStandard = findViewById(R.id.videoplayer);


        jcVideoPlayerStandard.setUp(dizhi
                , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL, "嫂子闭眼睛");
        Glide.with(VideoActivity.this).load("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640")
                .into(jcVideoPlayerStandard.thumbImageView);
        Uri uri = Uri.parse("res://drawable/" + R.drawable.a);
        mImg04.setImageURI(uri);


        img01.setTag(1);
        img02.setTag(1);


    }

    private void initView() {
        img01 = findViewById(R.id.img01);
        img02 = findViewById(R.id.img02);
        img01.setOnClickListener(this);
        img02.setOnClickListener(this);
        mImg03 = (ImageView) findViewById(R.id.img03);
        mImg03.setOnClickListener(this);
        mImg04 = (SimpleDraweeView) findViewById(R.id.img04);
        mImg04.setOnClickListener(this);
        mText2 = (TextView) findViewById(R.id.text2);
        mImg = (ImageView) findViewById(R.id.img);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.img01:
                tag1 = (int) img01.getTag();
                if (tag2 == 1) {
                    return;
                } else {
                    if (tag1 == 1) {
                        img01.setBackgroundResource(R.drawable.t1);
                        img01.setTag(2);
                    } else {
                        img01.setBackgroundResource(R.drawable.xin);
                        img01.setTag(1);
                    }
                }
                break;
            case R.id.img02:
                tag2 = (int) img02.getTag();
                if (tag1 == 1) {
                    return;
                } else {
                    if (tag2 == 1) {
                        img02.setBackgroundResource(R.drawable.t2);
                        img02.setTag(2);
                    } else {

                        img02.setBackgroundResource(R.drawable.lie);
                        img02.setTag(1);
                    }
                }
                break;
            case R.id.img03:
                finish();
                break;
            case R.id.img04:
                break;
        }
    }
}
