package com.winery.arf.winerytab.controllers.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;

import com.winery.arf.winerytab.R;
import com.winery.arf.winerytab.controllers.fragments.WineryFragment;

public class WineryActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new WineryFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
