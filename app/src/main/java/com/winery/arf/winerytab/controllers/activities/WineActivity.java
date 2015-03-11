package com.winery.arf.winerytab.controllers.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.winery.arf.winerytab.R;
import com.winery.arf.winerytab.controllers.fragments.FragmentContainerActivity;
import com.winery.arf.winerytab.controllers.fragments.WineFragment;
import com.winery.arf.winerytab.models.Wine;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class WineActivity extends FragmentContainerActivity {

    public static final String EXTRA_WINE = "activity.wine";





    @Override
    public Fragment createFragment() {


        Bundle arguments = new Bundle();
        arguments.putSerializable(WineFragment.ARG_WINE, getIntent().getSerializableExtra(EXTRA_WINE));

        WineFragment fragment = new WineFragment();
        fragment.setArguments(arguments);
        return fragment;
    }
}
