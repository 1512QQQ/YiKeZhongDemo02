package com.example.administrator.yikezhong.module;

import com.example.administrator.yikezhong.component.MyInterceptor;
import com.example.administrator.yikezhong.net.API;
import com.example.administrator.yikezhong.net.AdApi;
import com.example.administrator.yikezhong.net.AdApiService;
import com.example.administrator.yikezhong.net.JokesApi;
import com.example.administrator.yikezhong.net.JokesApiService;
import com.example.administrator.yikezhong.net.VideosApi;
import com.example.administrator.yikezhong.net.VideosApiService;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
@Module
public class HttpModule {
    @Provides
    OkHttpClient.Builder provideOkHttpClientBuilder() {
        return new OkHttpClient.Builder()
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS);
    }


    @Provides
    JokesApi provideJokesApi(OkHttpClient.Builder builder){

        builder.addInterceptor(new MyInterceptor());
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        JokesApiService jokesApiService = retrofit.create(JokesApiService.class);
        return JokesApi.getJokesApi(jokesApiService);
    }

    @Provides
    AdApi provideAdApi(OkHttpClient.Builder builder) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        AdApiService adApiService = retrofit.create(AdApiService.class);
        return AdApi.getAdApi(adApiService);
    }

    @Provides
    VideosApi provideVideosApi(OkHttpClient.Builder builder){

        builder.addInterceptor(new MyInterceptor());
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        VideosApiService videosApiService = retrofit.create(VideosApiService.class);
        return VideosApi.getVideosApi(videosApiService);
    }
}
