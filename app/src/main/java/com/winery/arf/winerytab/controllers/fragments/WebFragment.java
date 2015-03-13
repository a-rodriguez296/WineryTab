package com.winery.arf.winerytab.controllers.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.winery.arf.winerytab.R;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class WebFragment extends Fragment {

    public static final String TEXT = "text";

    @InjectView(R.id.webText) TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.activity_web,container,false);


        String tArg = getArguments().getString(TEXT);

        ButterKnife.inject(this,root);
        textView.setText(textView.getText() +" " + tArg);


        return root;
    }
}
