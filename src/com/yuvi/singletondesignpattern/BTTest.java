package com.yuvi.singletondesignpattern;

import java.lang.reflect.Constructor;

public class BTTest {

//------------------Break the singleton Design Pattern for Tea enum class--------------------\\

		public static void main(String[] args) throws Exception {

			HTea t1 = HTea.INSTANCE;
			System.out.println("hashCode of t1 = " + t1.hashCode());
			t1.m1();

			Constructor<HTea> constructor = HTea.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			HTea t2 = constructor.newInstance();
			System.out.println("hashCode of c2 = " + t2.hashCode());

//--------------------------Break the singleton Design Pattern----------------------------\\
   
	}
}
