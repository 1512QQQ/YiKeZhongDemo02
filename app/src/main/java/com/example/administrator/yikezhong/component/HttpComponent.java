package com.example.administrator.yikezhong.component;

import com.example.administrator.yikezhong.MainActivity;
import com.example.administrator.yikezhong.home.HomePageFragment;
import com.example.administrator.yikezhong.home.RightFragment;
import com.example.administrator.yikezhong.module.HttpModule;
import com.example.administrator.yikezhong.slass.ClassifyFragment;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {

    void inject(HomePageFragment homePageFragment);

    void inject(RightFragment rightFragment);

    void inject(ClassifyFragment classifyFragment);
}
