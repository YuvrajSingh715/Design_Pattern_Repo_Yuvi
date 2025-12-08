package com.yuvi.singleton.design.pattern;

public class Test {

    public static void main(String[] args) {

        Idli i1 = Idli.getIdli();
        Idli i2 = Idli.getIdli();

        System.out.println("hashcode of i1 = "+i1.hashCode());
        System.out.println("hashcode of i2 = "+i2.hashCode());
        System.out.println("++++++++++++++++++++++++++++++");

        Dosa d1 = Dosa.getDosa();
        Dosa d2 = Dosa.getDosa();

        System.out.println("hashcode of dosa1 = "+ d1.hashCode());
        System.out.println("hashcode of dosa2 = "+ d2.hashCode());

    }
}
