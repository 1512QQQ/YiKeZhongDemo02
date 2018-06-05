package com.example.administrator.yikezhong.home.contract;

import com.example.administrator.yikezhong.base.BaseContract;
import com.example.administrator.yikezhong.bean.AdBean;

public interface HomPageContract {
    interface View extends BaseContract.BaseView {
        void getAdSuccess(AdBean adBean);


    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getAd();


    }
}
