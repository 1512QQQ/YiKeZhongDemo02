package com.example.administrator.yikezhong.jokes;

import com.example.administrator.yikezhong.base.BasePresenter;
import com.example.administrator.yikezhong.bean.JokesBean;
import com.example.administrator.yikezhong.net.JokesApi;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class JokesPresenter extends BasePresenter<JokesContract.View> implements JokesContract.presenter {
    private JokesApi jokesApi;
    @Inject
    public JokesPresenter(JokesApi jokesApi) {
        this.jokesApi=jokesApi;
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
                        mTiew.jokesSuccess(jokesBean);
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
