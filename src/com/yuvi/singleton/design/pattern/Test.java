package com.yuvi.singleton.design.pattern;

public class Test {

    public static void main(String[] args) {

        Idli idli1 = Idli.getIdli();
        Idli idli2 = Idli.getIdli();

        System.out.println("hashcode of idli1 = "+idli1.hashCode());
        System.out.println("hashcode of idli2 = "+idli2.hashCode());
        System.out.println("++++++++++++++++++++++++++++++");

        Dosa dosa1 = Dosa.getDosa();
        Dosa dosa2 = Dosa.getDosa();

        System.out.println("hashcode of dosa1 = "+ dosa1.hashCode());
        System.out.println("hashcode of dosa2 = "+ dosa2.hashCode());



    }
}
