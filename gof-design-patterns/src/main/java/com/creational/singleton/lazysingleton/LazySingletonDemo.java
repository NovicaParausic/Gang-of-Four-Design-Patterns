package com.creational.singleton.lazysingleton;

public class LazySingletonDemo {

	public static void main(String[] args) {
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println(lazySingleton1);
		System.out.println(lazySingleton2);
	}
}
