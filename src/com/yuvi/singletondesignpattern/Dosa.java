package com.yuvi.singletondesignpattern;

public class Dosa {

    private static Dosa dosa = new Dosa();

    public static Dosa getDosa(){
        return dosa;
    }
}
