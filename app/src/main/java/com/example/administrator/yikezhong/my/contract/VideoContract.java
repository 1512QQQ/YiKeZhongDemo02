package com.example.administrator.yikezhong.my.contract;

import com.example.administrator.yikezhong.base.BaseContract;

import com.example.administrator.yikezhong.bean.VideosBean;

public interface VideoContract {
    interface View extends BaseContract.BaseView {

        void videoSuccess(VideosBean videosBean);



    }

    interface Presenter extends BaseContract.BasePresenter<VideoContract.View> {

        void getVideo(String page,String token);



    }
}
