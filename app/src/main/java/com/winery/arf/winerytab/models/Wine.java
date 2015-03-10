package com.winery.arf.winerytab.models;


import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by alejandrorodriguez on 3/9/15.
 */
public  class Wine implements Serializable{



    private String name;


    public Wine(String mName){
        name = mName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
