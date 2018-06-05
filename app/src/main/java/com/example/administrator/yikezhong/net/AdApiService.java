package com.example.administrator.yikezhong.net;

import com.example.administrator.yikezhong.bean.AdBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface AdApiService {
    @GET("quarter/getAd")
    Observable<AdBean> getAd();
}
