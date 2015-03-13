package com.winery.arf.winerytab.controllers.activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.winery.arf.winerytab.controllers.fragments.FragmentContainerActivity;
import com.winery.arf.winerytab.controllers.fragments.WebFragment;

public class WebActivity extends FragmentContainerActivity {


    public Fragment createFragment(){

        Bundle arguments = new Bundle();
        arguments.putString(WebFragment.TEXT,"alejsdf");
        WebFragment wFragment = new WebFragment();
        wFragment.setArguments(arguments);
        return wFragment;
    }
}