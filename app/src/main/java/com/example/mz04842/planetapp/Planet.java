package com.example.mz04842.planetapp;

import java.io.Serializable;
/**
 * Created by mz04842 on 3/7/2018.
 */

public class Planet implements Serializable{
    boolean isgas;
    int numberOfMoons;
    String name;

    public Planet(int numuberOfMoons, boolean isgas, String name ) {

        this.numberOfMoons = numuberOfMoons;
        this.isgas = isgas;
        this.name = name;

    }
    public boolean isgas() {
        return this.isgas;
    }

    public int getNumberOfMoons(){
        return this.numberOfMoons;
    }

    public String getName() {
        return this.name;
    }

    public void setIsgas( boolean b   ){

        this.isgas= b;


    }
}
