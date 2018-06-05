package com.example.administrator.yikezhong.component;

import com.example.administrator.yikezhong.MainActivity;
import com.example.administrator.yikezhong.home.HomePageFragment;
import com.example.administrator.yikezhong.module.HttpModule;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {

    void inject(HomePageFragment homePageFragment);
}
