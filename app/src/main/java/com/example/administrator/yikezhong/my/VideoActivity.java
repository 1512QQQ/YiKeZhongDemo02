package com.example.administrator.yikezhong.my;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.administrator.yikezhong.MainActivity;
import com.example.administrator.yikezhong.R;
import com.facebook.drawee.view.SimpleDraweeView;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.editorpage.ShareActivity;
import com.umeng.socialize.media.UMWeb;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener {

    private JCVideoPlayerStandard jcVideoPlayerStandard;
    private ImageView img01;
    private ImageView img02;
    private ImageView mImg01;
    private ImageView mImg02;

    private ImageView mImg03;
    private SimpleDraweeView mImg04;
    private ImageView mImg05;
    /**
     * 15963万次播放  今天19:23
     */
    private TextView mText2;
    private ImageView mImg;
    private int one=1;
    private int two=2;

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





    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
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

        mImg05 = (ImageView) findViewById(R.id.img05);
        mImg05.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.img01:
                if (two == 1) {
                    return;
                } else {
                    if (one == 1) {
                        img01.setBackgroundResource(R.drawable.t1);
                        one=2;
                    } else {
                        img01.setBackgroundResource(R.drawable.xin);
                        one=1;

                    }
                }
                break;
            case R.id.img02:
                if (one == 2) {
                    return;
                } else {
                    if (two == 2) {
                        img02.setBackgroundResource(R.drawable.t2);
                        two=1;
                    } else {

                        img02.setBackgroundResource(R.drawable.lie);
                        two=2;
                    }
                }
                break;
            case R.id.img03:
                finish();
                break;
            case R.id.img04:
                break;

            case R.id.img05:
                UMWeb url = new UMWeb("https://123.sogou.com/?71175-1172");
                new ShareAction(VideoActivity.this).withMedia(url).setDisplayList(SHARE_MEDIA.SINA,SHARE_MEDIA.QQ,SHARE_MEDIA.WEIXIN,SHARE_MEDIA.QZONE)
                        .setCallback(shareListener).open();
                break;
        }
    }

    private UMShareListener shareListener = new UMShareListener() {
        /**
         * @descrption 分享开始的回调
         * @param platform 平台类型
         */
        @Override
        public void onStart(SHARE_MEDIA platform) {

        }

        /**
         * @descrption 分享成功的回调
         * @param platform 平台类型
         */
        @Override
        public void onResult(SHARE_MEDIA platform) {
            Toast.makeText(VideoActivity.this,"成功                                        了",Toast.LENGTH_LONG).show();
        }

        /**
         * @descrption 分享失败的回调
         * @param platform 平台类型
         * @param t 错误原因
         */
        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(VideoActivity.this,"失                                            败"+t.getMessage(),Toast.LENGTH_LONG).show();
        }

        /**
         * @descrption 分享取消的回调
         * @param platform 平台类型
         */
        @Override
        public void onCancel(SHARE_MEDIA platform) {
            Toast.makeText(VideoActivity.this,"取消                                          了",Toast.LENGTH_LONG).show();

        }
    };
}
