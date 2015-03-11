package com.winery.arf.winerytab.controllers.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.winery.arf.winerytab.R;
import com.winery.arf.winerytab.controllers.adapters.WineryPagerAdapter;
import com.winery.arf.winerytab.models.Wine;

/**
 * Created by alejandrorodriguez on 3/10/15.
 */
public class WineryFragment extends Fragment{

    private ViewPager mPager = null;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_winery,container,false);

        mPager =(ViewPager)root.findViewById(R.id.viewPager);
        mPager.setAdapter(new WineryPagerAdapter(getFragmentManager()));


        return root;
    }
}
