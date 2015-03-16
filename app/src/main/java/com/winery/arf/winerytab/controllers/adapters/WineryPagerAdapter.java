package com.winery.arf.winerytab.controllers.adapters;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.winery.arf.winerytab.controllers.fragments.WineFragment;
import com.winery.arf.winerytab.models.Wine;
import com.winery.arf.winerytab.services.WineService;

/**
 * Created by arodriguez on 3/11/15.
 */
public class WineryPagerAdapter extends FragmentPagerAdapter {


   private WineService mWineService = null;





   public WineryPagerAdapter(FragmentManager manager){

       super(manager);
       mWineService = WineService.getInstace();
   }

    @Override
    public Fragment getItem(int i) {
        Wine wine = mWineService.wineList.get(i);

        WineFragment wineFragment = new WineFragment();
        Bundle arguments = new Bundle();
        arguments.putSerializable(WineFragment.ARG_WINE,wine);
        wineFragment.setArguments(arguments);
        return wineFragment;
    }


    @Override
    public int getCount() {
        return mWineService.wineList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Wine wine = mWineService.wineList.get(position);
        return wine.getName();
    }
}
