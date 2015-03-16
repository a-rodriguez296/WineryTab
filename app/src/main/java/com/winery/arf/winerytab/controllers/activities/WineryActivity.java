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

        //Primero se llama el actividad y luego el fragment.
        super.onCreate(savedInstanceState);

        //Container con nada adentro
        setContentView(R.layout.activity_fragment_container);

        FragmentManager fm = getSupportFragmentManager();
        //Busca para ver si tiene algo andentro
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new WineryFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
