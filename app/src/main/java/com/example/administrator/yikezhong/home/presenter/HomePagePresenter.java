package com.example.administrator.yikezhong.home.presenter;

import com.example.administrator.yikezhong.base.BasePresenter;
import com.example.administrator.yikezhong.bean.AdBean;
import com.example.administrator.yikezhong.bean.AddFavoriteBean;
import com.example.administrator.yikezhong.bean.JokesBean;
import com.example.administrator.yikezhong.home.contract.HomPageContract;
import com.example.administrator.yikezhong.net.AdApi;
import com.example.administrator.yikezhong.net.AddFavoriteApi;
import com.example.administrator.yikezhong.net.JokesApi;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class HomePagePresenter extends BasePresenter<HomPageContract.View> implements HomPageContract.Presenter {
    private AdApi adApi;

    private JokesApi jokesApi;

    private AddFavoriteApi addFavoriteApi;


    @Inject
    public HomePagePresenter(AdApi adApi,JokesApi jokesApi,AddFavoriteApi addFavoriteApi) {
        this.adApi = adApi;
        this.jokesApi=jokesApi;
        this.addFavoriteApi=addFavoriteApi;
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

    @Override
    public void getJokes(String page) {
        jokesApi.getJokes(page)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<JokesBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(JokesBean jokesBean) {
                        mView.jokesSuccess(jokesBean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getaddfavorit(String token, String uid, String wid) {
        addFavoriteApi.getAddFavorites(token,uid,wid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Function<AddFavoriteBean, String>() {
                    @Override
                    public String apply(AddFavoriteBean addFavoriteBean) throws Exception {
                        return addFavoriteBean.getMsg();
                    }
                }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                if (mView != null) {
                    mView.addfavoriteSuccess(s);
                }
            }
        });
    }
}
