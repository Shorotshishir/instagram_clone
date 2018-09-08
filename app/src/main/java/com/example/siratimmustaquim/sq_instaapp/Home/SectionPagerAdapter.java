package com.example.siratimmustaquim.sq_instaapp.Home;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * class for storing fragments for tabs
 */
public class SectionPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "SectionPagerAdapter";
    private final List<Fragment> mFragmentList = new ArrayList<>(); //storing the fragments
    private final List<String> mFragmentTitleList = new ArrayList<>(); //storing the fragments
    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String string){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(string);
    }

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        if(position==1){
//            return mFragmentTitleList.get(position);
//        }else{
//            return null;
//        }
//    }
}
