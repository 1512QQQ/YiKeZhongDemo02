package com.example.administrator.yikezhong.net;

import com.example.administrator.yikezhong.bean.AddFavoriteBean;
import com.example.administrator.yikezhong.bean.VideosBean;

import io.reactivex.Completable;
import io.reactivex.Observable;

public class AddFavoriteApi {
    private static AddFavoriteApi addFavoriteApi;
    private AddFavoriteApiService addFavoriteApiService;

    public AddFavoriteApi(AddFavoriteApiService addFavoriteApiService) {
        this.addFavoriteApiService = addFavoriteApiService;
    }

    public static AddFavoriteApi getAddFavoriteApi(AddFavoriteApiService addFavoriteApiService){
        if (addFavoriteApi==null){
            addFavoriteApi=new AddFavoriteApi(addFavoriteApiService);
        }
        return addFavoriteApi;
    }
    public Observable<AddFavoriteBean> getAddFavorites(String token, String uid, String wid ){
        return addFavoriteApiService.getAddFavorite(token,uid,wid);
    }


}
