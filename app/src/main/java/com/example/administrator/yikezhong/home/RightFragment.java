package com.example.administrator.yikezhong.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.administrator.yikezhong.GlideImageLoader;
import com.example.administrator.yikezhong.R;
import com.example.administrator.yikezhong.base.BaseFragment;
import com.example.administrator.yikezhong.bean.AdBean;
import com.example.administrator.yikezhong.bean.AddFavoriteBean;
import com.example.administrator.yikezhong.bean.JokesBean;
import com.example.administrator.yikezhong.component.DaggerHttpComponent;
import com.example.administrator.yikezhong.home.adapter.RvAdapter;
import com.example.administrator.yikezhong.home.contract.HomPageContract;
import com.example.administrator.yikezhong.home.presenter.HomePagePresenter;
import com.example.administrator.yikezhong.module.HttpModule;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class RightFragment extends BaseFragment<HomePagePresenter> implements HomPageContract.View {


    private ImageView banner;
    private RecyclerView rcv;

    @Override
    public int getContentLayout() {
        return R.layout.right_fragment;

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
        rcv = view.findViewById(R.id.rcv);
        rcv.setLayoutManager(new LinearLayoutManager(getContext()));
        banner.setBackgroundResource(R.drawable.ic_launcher_background);


        mPresenter.getJokes("6");
    }

    @Override
    public void getAdSuccess(AdBean adBean) {


    }

    @Override
    public void jokesSuccess(JokesBean jokesBean) {
        final List<JokesBean.DataBean> data = jokesBean.getData();

        final RvAdapter rvAdapter = new RvAdapter(data, getContext(),mPresenter);

        rcv.setAdapter(rvAdapter);

    }

    @Override
    public void addfavoriteSuccess(String str) {

    }


}
