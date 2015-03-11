package com.winery.arf.winerytab.controllers.activities;

import android.support.v4.app.Fragment;

import com.winery.arf.winerytab.controllers.fragments.FragmentContainerActivity;
import com.winery.arf.winerytab.controllers.fragments.WineryFragment;

public class WineryActivity extends FragmentContainerActivity {


    @Override
    public Fragment createFragment() {

        WineryFragment fragment = new WineryFragment();
        return fragment;

    }
}
