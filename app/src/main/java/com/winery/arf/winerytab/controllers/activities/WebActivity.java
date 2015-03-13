package com.winery.arf.winerytab.controllers.activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;

import com.winery.arf.winerytab.R;
import com.winery.arf.winerytab.controllers.fragments.FragmentContainerActivity;
import com.winery.arf.winerytab.controllers.fragments.WebFragment;

public class WebActivity extends ActionBarActivity {


    public Fragment createFragment(){

        Bundle arguments = new Bundle();
        arguments.putString(WebFragment.TEXT,"alejsdf");
        WebFragment wFragment = new WebFragment();
        wFragment.setArguments(arguments);
        return wFragment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);

        Fragment f = createFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, f).commit();
    }
}