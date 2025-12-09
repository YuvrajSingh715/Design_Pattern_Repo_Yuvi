package com.yuvi.singletondesignpattern;


public class Dosa {

	// Eager way of creating singleton object
    private static Dosa dosa = new Dosa();

    public static Dosa getDosa(){
        return dosa;
    }
}
