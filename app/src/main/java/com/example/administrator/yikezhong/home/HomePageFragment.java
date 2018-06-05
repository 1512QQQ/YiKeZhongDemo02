package com.example.administrator.yikezhong.home;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.administrator.yikezhong.GlideImageLoader;
import com.example.administrator.yikezhong.R;
import com.example.administrator.yikezhong.base.BaseActivity;
import com.example.administrator.yikezhong.base.BaseFragment;
import com.example.administrator.yikezhong.bean.AdBean;
import com.example.administrator.yikezhong.component.DaggerHttpComponent;
import com.example.administrator.yikezhong.home.contract.HomPageContract;
import com.example.administrator.yikezhong.home.presenter.HomePagePresenter;
import com.example.administrator.yikezhong.module.HttpModule;
import com.example.administrator.yikezhong.my.MyFragment;
import com.example.administrator.yikezhong.net.API;
import com.example.administrator.yikezhong.slass.ClassifyFragment;
import com.youth.banner.Banner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HomePageFragment extends BaseFragment<HomePagePresenter> implements HomPageContract.View {


    private Banner banner;

    @Override
    public int getContentLayout() {
        return R.layout.home_fragment;
        //sasjsajkkjs
    }

    @Override
    public void inject() {
        DaggerHttpComponent.builder()
                .httpModule(new HttpModule())
                .build()
                .inject(this);

    }

    @Override
    public void initView(View view) {
        banner = view.findViewById(R.id.banner);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());

        mPresenter.getAd();
    }

    @Override
    public void getAdSuccess(AdBean adBean) {
        List<AdBean.DataBean> data = adBean.getData();
        List<String> images = new ArrayList<>();
        for (int i=0;i<data.size(); i++){
            images.add(data.get(i).getIcon());
        }
        //设置图片集合
        banner.setImages(images);
        //banner设置方法全部调用完毕时最后调用
        banner.start();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        banner.stopAutoPlay();
    }
}
