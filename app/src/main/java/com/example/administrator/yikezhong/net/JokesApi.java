package com.example.administrator.yikezhong.net;

import com.example.administrator.yikezhong.bean.JokesBean;

import io.reactivex.Observable;

public class JokesApi {
    private static JokesApi jokesApi;
    private JokesApiService jokesApiService;
    public JokesApi(JokesApiService jokesApiService) {
        this.jokesApiService=jokesApiService;
    }
    public static JokesApi getJokesApi(JokesApiService jokesApiService){
        if (jokesApi==null){
            jokesApi=new JokesApi(jokesApiService);
        }
        return jokesApi;
    }
    public Observable<JokesBean> getJokes(String page){
        return jokesApiService.getJokes(page);
    }
}
