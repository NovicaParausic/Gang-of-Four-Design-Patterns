package com.structural.proxy.example1;

public class ProxyDemo1 {

	public static void main(String[] args) {
		final Image IMAGE1 = new ProxyImage("HiRes_photo1");
		final Image IMAGE2 = new ProxyImage("HiRes_photo2");
		
		IMAGE1.displayImage(); //
		IMAGE1.displayImage();
		IMAGE2.displayImage();
		IMAGE2.displayImage();
		IMAGE1.displayImage();
	}
}
