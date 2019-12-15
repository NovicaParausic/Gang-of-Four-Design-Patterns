package com.behavioral.chainofresponsibiltiy.example1;

public class ChainOfResponsibilityDemo1 {

	public static void main(String[] args) {
		Director bryan = new Director();
		VP crystal = new VP();
		CEO jeff = new CEO();
		
		bryan.setSuccessor(crystal);
		crystal.setSuccessor(jeff);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		bryan.hadlerRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		bryan.hadlerRequest(request);
		
		request = new Request(RequestType.PURCHASE, 2000);
		bryan.hadlerRequest(request);
	}

}
