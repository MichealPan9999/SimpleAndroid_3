package com.example.eventintercept.adapters;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class BaseViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> mFragments = new ArrayList<>();

    String[] mtitles;
    public BaseViewPagerAdapter(FragmentManager fm,List<Fragment> fragments) {
        this(fm,fragments,null);
    }
    public BaseViewPagerAdapter(FragmentManager fm, List<Fragment> fragments,String[] mtitles) {
        super(fm);
        this.mFragments = fragments;
        this.mtitles=mtitles;
    }

    @Override
    public Fragment getItem(int i) {
        return mFragments.get(i);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mtitles[position];
    }
}
