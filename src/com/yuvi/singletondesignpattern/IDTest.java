package com.yuvi.singletondesignpattern;

// Test class for IdliA and IdliB and Dosa 

public class IDTest {

    public static void main(String[] args) {

        IdliA i1 = IdliA.getIdli();
        IdliA i2 = IdliA.getIdli();

        System.out.println("hashcode of i1 = "+i1.hashCode());
        System.out.println("hashcode of i2 = "+i2.hashCode());
        System.out.println("++++++++++++++++++++++++++++++");
        
        
        IdliB i3 = IdliB.getIdli();
        IdliB i4 = IdliB.getIdli();

        System.out.println("hashcode of i3 = "+i3.hashCode());
        System.out.println("hashcode of i4 = "+i4.hashCode());
        System.out.println("++++++++++++++++++++++++++++++");


        Dosa d1 = Dosa.getDosa();
        Dosa d2 = Dosa.getDosa();

        System.out.println("hashcode of dosa1 = "+ d1.hashCode());
        System.out.println("hashcode of dosa2 = "+ d2.hashCode());

	}
}
