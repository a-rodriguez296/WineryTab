package com.winery.arf.winerytab.controllers.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.winery.arf.winerytab.R;
import com.winery.arf.winerytab.models.Wine;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class WineActivity extends ActionBarActivity {

    public static final String ARG_WINE = "activity.wine";

@InjectView(R.id.textHola) TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine);
        ButterKnife.inject(this);

        Wine wine = (Wine) getIntent().getSerializableExtra(ARG_WINE);
        txt.setText(wine.getName());

        //
    }
}
