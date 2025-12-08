package com.yuvi.singletondesignpattern;

public class Idli {

	private static Idli idli;

    //constructor
    private Idli(){
    	
    }

//    public static Idli getIdli() {
//        //object of this class
//        if (idli == null) {
//            idli = new Idli();
//        }
//        return idli;
//    }

	public static Idli getIdli() {

		System.out.println("Thread can access this sysout");

		synchronized (Idli.class) {
			if (idli == null) {
				idli = new Idli();
			}
			return idli;
		}
	}
}
