package com.example.administrator.yikezhong.net;

import com.example.administrator.yikezhong.bean.AddFavoriteBean;


import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AddFavoriteApiService {
    @FormUrlEncoded
    @POST("quarter/addFavorite")
    Observable<AddFavoriteBean> getAddFavorite(@Field("token") String token,
                                         @Field("uid") String uid,
                                         @Field("wid") String wid
                                         );

}
