package com.winery.arf.winerytab.controllers.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.winery.arf.winerytab.R;
import com.winery.arf.winerytab.controllers.adapters.WineryPagerAdapter;
import com.winery.arf.winerytab.models.Wine;
import com.winery.arf.winerytab.services.WineService;

/**
 * Created by alejandrorodriguez on 3/10/15.
 */
public class WineryFragment extends Fragment implements ViewPager.OnPageChangeListener, ActionBar.TabListener {

    /**
     * Constantes
     */
    private static final int MENU_NEXT = 1;
    private static final int MENU_PREVIOUS = 2;


    /**
     * Atributos
     */
    private ViewPager mPager = null;
    private ActionBar mActionBar = null;
    private WineService mWineService = null;
    private MenuItem nextItem = null;
    private MenuItem previousItem = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        nextItem = menu.add(Menu.NONE, MENU_NEXT,1,R.string.next);
        MenuItemCompat.setShowAsAction(nextItem,MenuItemCompat.SHOW_AS_ACTION_ALWAYS);

        previousItem = menu.add(Menu.NONE, MENU_PREVIOUS,0,R.string.previous);
        MenuItemCompat.setShowAsAction(previousItem,MenuItemCompat.SHOW_AS_ACTION_ALWAYS);

        int index = mPager.getCurrentItem();
        nextItem.setEnabled(index < mWineService.wineList.size() - 1);
        previousItem.setEnabled(index > 0);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()== MENU_NEXT){
            if (mPager.getCurrentItem() < mWineService.wineList.size()-1){
                mPager.setCurrentItem(mPager.getCurrentItem() +1);
            }
            return true;
        }
        else if(item.getItemId() == MENU_PREVIOUS)
        {
            if (mPager.getCurrentItem()>0){
                mPager.setCurrentItem(mPager.getCurrentItem() -1);
            }

            return true;
        }
        else
            return super.onOptionsItemSelected(item);


    }



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_winery, container, false);


        mPager = (ViewPager) root.findViewById(R.id.viewPager);
        mPager.setAdapter(new WineryPagerAdapter(getFragmentManager()));
        mPager.setOnPageChangeListener(this);

        mWineService = WineService.getInstace();

        mActionBar = (ActionBar) ((ActionBarActivity) getActivity()).getSupportActionBar();
        mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        for (int i = 0; i < mWineService.wineList.size(); i++) {
            mActionBar.addTab(mActionBar.newTab().setText(mWineService.wineList.get(i).getName()).setTabListener(this));
        }


        updateActionBar(0);

        return root;
    }

    public void updateMenuItems(int index){
        if (index>=0 && index<mWineService.wineList.size()-1){
            nextItem.setEnabled(true);
        }
        else{
            nextItem.setEnabled(false);
        }
        if (index>0){
            previousItem.setEnabled(true);
        }
        else
        {
           previousItem.setEnabled(false);
        }
    }


    private void updateActionBar(int index) {
        Wine currentWine = mWineService.wineList.get(index);
        mActionBar.setTitle(currentWine.getName());
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        updateActionBar(position);
        mActionBar.setSelectedNavigationItem(position);
        updateMenuItems(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        mPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
