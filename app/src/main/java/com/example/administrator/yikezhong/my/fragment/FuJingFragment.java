package com.example.administrator.yikezhong.my.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.yikezhong.R;
import com.example.administrator.yikezhong.base.BaseFragment;
import com.example.administrator.yikezhong.bean.VideosBean;
import com.example.administrator.yikezhong.component.DaggerHttpComponent;
import com.example.administrator.yikezhong.module.HttpModule;
import com.example.administrator.yikezhong.my.adapter.VideoAdapter;
import com.example.administrator.yikezhong.my.contract.VideoContract;
import com.example.administrator.yikezhong.my.pressenter.VideoPresenter;

import java.util.List;

public class FuJingFragment extends BaseFragment<VideoPresenter> implements VideoContract.View{

    private RecyclerView rcv;

    @Override
    public int getContentLayout() {
        return R.layout.fujing_fragment;
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
        rcv = view.findViewById(R.id.rcv);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, RecyclerView.VERTICAL, false);
        rcv.setLayoutManager(gridLayoutManager);

        mPresenter.getVideo("1","B418A52FCD7198F21D19CB63011CE354");

    }

    @Override
    public void videoSuccess(VideosBean videosBean) {
        List<VideosBean.DataBean> data = videosBean.getData();
        VideoAdapter videoAdapter = new VideoAdapter(data,getContext());
        rcv.setAdapter(videoAdapter);


    }
}
