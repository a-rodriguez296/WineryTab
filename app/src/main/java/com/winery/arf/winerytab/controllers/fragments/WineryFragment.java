package com.winery.arf.winerytab.controllers.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.winery.arf.winerytab.R;
import com.winery.arf.winerytab.models.Wine;

/**
 * Created by alejandrorodriguez on 3/10/15.
 */
public class WineryFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_winery,container,false);

        Wine wine1 = new Wine("Alejandro");
        Wine wine2 = new Wine("Feli");



        FragmentTabHost tabHost =(FragmentTabHost) root.findViewById(android.R.id.tabhost);
        tabHost.setup(getActivity(),getActivity().getSupportFragmentManager(),android.R.id.tabcontent);

        Bundle arguments = new Bundle();
        arguments.putSerializable(WineFragment.ARG_WINE, wine1);
        tabHost.addTab(tabHost.newTabSpec(wine1.getName()).setIndicator(wine1.getName()),WineFragment.class,arguments);


        arguments = new Bundle();
        arguments.putSerializable(WineFragment.ARG_WINE, wine2);
        tabHost.addTab(tabHost.newTabSpec(wine2.getName()).setIndicator(wine2.getName()),WineFragment.class,arguments);

        return root;
    }
}
