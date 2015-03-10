package com.winery.arf.winerytab.controllers.activities;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import com.winery.arf.winerytab.R;
import com.winery.arf.winerytab.models.Wine;

public class WineryActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winery);


        Wine wine1 = new Wine("Alejandro");
        Wine wine2 = new Wine("Feli");


        TabHost tabHost = getTabHost();
        Intent intent = new Intent(this, WineActivity.class);
        intent.putExtra(WineActivity.ARG_WINE,wine1);
        TabHost.TabSpec spec = tabHost.newTabSpec("1");
        spec.setIndicator("11");
        spec.setContent(intent);
        tabHost.addTab(spec);

        tabHost = getTabHost();
        intent = new Intent(this, WineActivity.class);
        intent.putExtra(WineActivity.ARG_WINE,wine2);
        spec = tabHost.newTabSpec("2");
        spec.setIndicator("2");
        spec.setContent(intent);
        tabHost.addTab(spec);


    }

}
