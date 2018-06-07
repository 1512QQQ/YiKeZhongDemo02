package com.example.administrator.yikezhong.my.pressenter;



import com.example.administrator.yikezhong.base.BasePresenter;
import com.example.administrator.yikezhong.bean.AdBean;
import com.example.administrator.yikezhong.bean.VideosBean;
import com.example.administrator.yikezhong.home.contract.HomPageContract;
import com.example.administrator.yikezhong.my.contract.VideoContract;
import com.example.administrator.yikezhong.net.VideosApi;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class VideoPresenter extends BasePresenter<VideoContract.View> implements VideoContract.Presenter {

    private VideosApi videosApi;
    @Inject
    public VideoPresenter(VideosApi videosApi) {
        this.videosApi = videosApi;
    }

    @Override
    public void getVideo(String page, String token) {
        videosApi.getVideos(page, token)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<VideosBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(VideosBean videosBean) {
                        if (mView != null) {
                            mView.videoSuccess(videosBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
