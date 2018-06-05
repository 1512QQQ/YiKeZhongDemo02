package com.example.administrator.yikezhong.net;

import com.example.administrator.yikezhong.bean.JokesBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public  interface JokesApiService {
    @FormUrlEncoded
    @POST("quarter/getJokes ")
    Observable<JokesBean> getJokes(@Field("page") String page);
}
