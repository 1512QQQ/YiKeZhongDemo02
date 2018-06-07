package com.example.administrator.yikezhong.net;

import com.example.administrator.yikezhong.bean.VideosBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface VideosApiService {
    @FormUrlEncoded
    @POST("quarter/getHotVideos")
    Observable<VideosBean> getVideo(@Field("page") String page,
                                    @Field("token") String token
                                    );
}
