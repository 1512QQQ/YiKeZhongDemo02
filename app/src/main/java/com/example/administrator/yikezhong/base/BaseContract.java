package com.example.administrator.yikezhong.base;

public interface BaseContract {
    //抽取所有presenter的共性，例如绑定、解绑
    interface BasePresenter<T extends BaseView>{
        void attchView(T view);
        void detachView();
    }
    interface BaseView{

    }
}
