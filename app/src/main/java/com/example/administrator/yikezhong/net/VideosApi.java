package com.example.administrator.yikezhong.net;

import com.example.administrator.yikezhong.bean.JokesBean;
import com.example.administrator.yikezhong.bean.VideosBean;

import io.reactivex.Observable;

public class VideosApi {
    private static VideosApi videosApi;
    private VideosApiService videosApiService;

    public VideosApi(VideosApiService videosApiService) {
        this.videosApiService = videosApiService;
    }

    public static VideosApi getVideosApi(VideosApiService videosApiService){
        if (videosApi==null){
            videosApi=new VideosApi(videosApiService);
        }
        return videosApi;
    }
    public Observable<VideosBean> getVideos(String page,String token){
        return videosApiService.getVideo(page,token);
    }

}
