package com.example.administrator.yikezhong.jokes;

import com.example.administrator.yikezhong.base.BaseContract;
import com.example.administrator.yikezhong.bean.JokesBean;

public interface JokesContract {
    interface View extends BaseContract.BaseView{
        void jokesSuccess(JokesBean jokesBean);
    }
    interface presenter extends BaseContract.BasePresenter<View>{
        void getJokes(String page);
    }
}
