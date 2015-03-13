package com.winery.arf.winerytab.controllers.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;

import com.winery.arf.winerytab.R;

/**
 * Created by alejandrorodriguez on 3/10/15.
 */
public abstract class FragmentContainerActivity extends ActionBarActivity {


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
