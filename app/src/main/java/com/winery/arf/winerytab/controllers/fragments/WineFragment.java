package com.winery.arf.winerytab.controllers.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.winery.arf.winerytab.R;
import com.winery.arf.winerytab.models.Wine;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by alejandrorodriguez on 3/10/15.
 */
public class WineFragment extends Fragment {

    @InjectView(R.id.textHola) TextView txt;

    public static final String ARG_WINE = "fragment.wine";

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.activity_wine, container, false);

        ButterKnife.inject(this, root);

        Wine wine = (Wine) getArguments().getSerializable(ARG_WINE);
        txt.setText(wine.getName());
        return root;
    }
}
