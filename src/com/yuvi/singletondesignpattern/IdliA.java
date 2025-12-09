package com.yuvi.singletondesignpattern;

public class IdliA {

	private static IdliA idli;

    //constructor
    private IdliA(){
    	
    }

 // Lazy way of creating singleton object
    public static IdliA getIdli() {
        //object of this class
        if (idli == null) {
            idli = new IdliA();
        }
        return idli;
    }

}
