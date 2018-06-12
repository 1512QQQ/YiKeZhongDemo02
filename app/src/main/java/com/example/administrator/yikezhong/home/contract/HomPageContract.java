package com.example.administrator.yikezhong.home.contract;

import com.example.administrator.yikezhong.base.BaseContract;
import com.example.administrator.yikezhong.bean.AdBean;
import com.example.administrator.yikezhong.bean.AddFavoriteBean;
import com.example.administrator.yikezhong.bean.JokesBean;

public interface HomPageContract {
    interface View extends BaseContract.BaseView {
        void getAdSuccess(AdBean adBean);

        void jokesSuccess(JokesBean jokesBean);

        void addfavoriteSuccess(String str);



    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getAd();

        void getJokes(String page);

        void getaddfavorit(String token,String uid,String wid);

    }
}
