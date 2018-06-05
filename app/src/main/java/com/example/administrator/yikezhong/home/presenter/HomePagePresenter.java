package com.example.administrator.yikezhong.home.presenter;

import com.example.administrator.yikezhong.base.BasePresenter;
import com.example.administrator.yikezhong.bean.AdBean;
import com.example.administrator.yikezhong.home.contract.HomPageContract;
import com.example.administrator.yikezhong.net.AdApi;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HomePagePresenter extends BasePresenter<HomPageContract.View> implements HomPageContract.Presenter {
    private AdApi adApi;

    @Inject
    public HomePagePresenter(AdApi adApi) {
        this.adApi = adApi;
    }

    @Override
    public void getAd() {
        adApi.getAd()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<AdBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AdBean adBean) {
                        if (mView != null) {
                            mView.getAdSuccess(adBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
