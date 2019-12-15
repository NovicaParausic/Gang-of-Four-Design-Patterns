package com.behavioral.chainofresponsibiltiy.example1;

public class VP extends Handler {

	@Override
	void hadlerRequest(Request request) {
		if (request.getRequestType() == RequestType.PURCHASE) {
			if (request.getAmount() < 1500) {
				System.out.println("VPs can approve purchase below 1500");
			} else {
				successor.hadlerRequest(request);
			}
		}
	}

}
