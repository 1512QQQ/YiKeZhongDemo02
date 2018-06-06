package com.example.administrator.yikezhong.home;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.yikezhong.MainActivity;
import com.example.administrator.yikezhong.R;
import com.example.administrator.yikezhong.slass.leftactivity.HeadPic;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LeftFragment  extends Fragment {

    private View view;
    private TabLayout tab_layout;
    private ViewPager vp;
    private List<String> myTabs=new ArrayList<>();
    private List<Fragment> list_frag;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.left_fragment, container, false);
        initView(view);
        return view;
    }


    public void initView(View view) {
        tab_layout = (TabLayout) view.findViewById(R.id.tab_layout);
        vp = (ViewPager) view.findViewById(R.id.vp);
        initData();
    }

    private void initData() {
        myTabs.add("热门");
        myTabs.add("关注");
        list_frag = new ArrayList<>();
        HomePageFragment homePageFragment = new HomePageFragment();
        RightFragment rightFragment = new RightFragment();
        list_frag.add(homePageFragment);
        list_frag.add(rightFragment);
        vp.setAdapter(new MyVpAdapter(getChildFragmentManager()));
        tab_layout.setupWithViewPager(vp);
    }

    class MyVpAdapter extends FragmentPagerAdapter {

        public MyVpAdapter(FragmentManager fm) {
            super(fm);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return myTabs.get(position);
        }

        @Override
        public Fragment getItem(int position) {
            return list_frag.get(position);
        }

        @Override
        public int getCount() {
            return myTabs.size();
        }
    }

}
