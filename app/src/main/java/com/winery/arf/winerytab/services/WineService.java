package com.winery.arf.winerytab.services;

import com.winery.arf.winerytab.models.Wine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arodriguez on 3/11/15.
 */
public class WineService {


    private static WineService service = null;
    public List<Wine> wineList;

    public static WineService getInstace(){


        if (service == null){
            service = new WineService();
        }
        return service;

    }


    public WineService(){

        wineList = new ArrayList<Wine>();

        wineList.add(new Wine("alejandro"));
        wineList.add(new Wine("Feli"));
        wineList.add(new Wine("Moni"));
    }



}
