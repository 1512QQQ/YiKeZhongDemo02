package com.example.administrator.yikezhong.base;

public class BasePresenter <T extends BaseContract.BaseView> implements BaseContract.BasePresenter<T> {
    protected T mTiew;
    @Override
    public void attchView(T view) {
        this.mTiew=view;
    }

    @Override
    public void detachView() {
        if (mTiew!=null){
            mTiew=null;
        }
    }
}
