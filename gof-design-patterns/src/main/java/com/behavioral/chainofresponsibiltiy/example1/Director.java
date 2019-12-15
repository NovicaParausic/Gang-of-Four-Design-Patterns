package com.behavioral.chainofresponsibiltiy.example1;

public class Director extends Handler {

	@Override
	void hadlerRequest(Request request) {
		if (request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Directors can apprve conference");
		} else {
			successor.hadlerRequest(request);
		}
	}

}
