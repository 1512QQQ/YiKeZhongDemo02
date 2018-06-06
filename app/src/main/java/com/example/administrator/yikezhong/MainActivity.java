package com.example.administrator.yikezhong;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.administrator.yikezhong.base.BaseActivity;
import com.example.administrator.yikezhong.home.HomePageFragment;
import com.example.administrator.yikezhong.home.LeftFragment;
import com.example.administrator.yikezhong.my.MyFragment;
import com.example.administrator.yikezhong.net.API;
import com.example.administrator.yikezhong.slass.ClassifyFragment;
import com.example.administrator.yikezhong.slass.leftactivity.HeadPic;
import com.example.administrator.yikezhong.utils.BottomBar;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends BaseActivity {


    private SlidingMenu menu;

    private FrameLayout mFl;
    private RadioButton mRbHomepage;
    private RadioButton mRbClass;
    private RadioButton mRbFind;

    private RadioGroup mRg;
    private FrameLayout mFlContent;
    private FragmentManager fragmentManager;
    private MyFragment myFragment;
    private int currentIndex = 1;
    private ClassifyFragment classifyFragment;
    private LeftFragment leftFragment;

    private TextView takecare;
    private TextView collection;
    private TextView friend;
    private TextView messages;
    private SimpleDraweeView myImageView;
    private TextView night;
    private TextView myDirectory;
    private TextView settings;
    SimpleDraweeView touxiang;
    private SimpleDraweeView touxiang1;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       initPic();

        Request request = new Request.Builder()
                .url(API.BASEURL)
                .build();
        new OkHttpClient().newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }
        });

        mFlContent = (FrameLayout) findViewById(R.id.fl_container);
        BottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(LeftFragment.class,
                        "推荐",
                        R.drawable.tuijian1,
                        R.drawable.tuijian2)
                .addItem(ClassifyFragment.class,
                        "段子",
                        R.drawable.duanzi1,
                        R.drawable.duanzi2)
                .addItem(MyFragment.class,
                        "视频",
                        R.drawable.shipin1,
                        R.drawable.shipin2)
                .build();





    }

    private void initPic() {
        takecare = findViewById(R.id.takecare);
        collection = findViewById(R.id.collection);
        friend = findViewById(R.id.friend);
        messages = findViewById(R.id.messages);
        touxiang = findViewById(R.id.touxiang);
        myImageView = findViewById(R.id.my_image_view);
        night = findViewById(R.id.night);
        myDirectory = findViewById(R.id.my_directory);
        settings = findViewById(R.id.settings);


        //new出SlidingMenu对象
        menu = new SlidingMenu(this);
        //设置侧滑的方向.左侧
        menu.setMode(SlidingMenu.LEFT);
        // 设置触摸屏幕的模式
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        // 设置滑动完剩余的宽度
        menu.setBehindOffset(210);
        // 设置渐入渐出效果的值
        menu.setFadeDegree(0.35f);
        //绑定
        menu.attachToActivity(this, SlidingMenu.SLIDING_WINDOW);
        //为侧滑菜单设置布局
        View lview = LayoutInflater.from(this).inflate(R.layout.sliding_left, null);
        menu.setMenu(lview);
        touxiang1 = menu.findViewById(R.id.my_image_view);
        touxiang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HeadPic.class);
                startActivity(intent);
            }
        });
        ButterKnife.bind(this);
        //设置侧滑页面的头像展示
        Uri uri = Uri.parse("https://imgsa.baidu.com/forum/pic/item/3bc79f3df8dcd1000ac6c4fa798b4710b8122f96.jpg");
        SimpleDraweeView imageTouXiang = (SimpleDraweeView) findViewById(R.id.my_image_view);
        imageTouXiang.setImageURI(uri);

        this.touxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.showMenu();
            }
        });
    }







    @Override
    public int getContentLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void inject() {

    }
}
