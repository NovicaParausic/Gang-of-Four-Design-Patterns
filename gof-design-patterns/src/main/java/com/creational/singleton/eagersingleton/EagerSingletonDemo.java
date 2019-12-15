package com.creational.singleton.eagersingleton;

public class EagerSingletonDemo {

	public static void main(String[] args) {
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
		System.out.println(eagerSingleton1);
		System.out.println(eagerSingleton2);
	}
}
