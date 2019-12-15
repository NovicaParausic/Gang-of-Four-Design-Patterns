package com.behavioral.chainofresponsibiltiy.example1;

public class CEO extends Handler {

	@Override
	void hadlerRequest(Request request) {
		System.out.println("CEOs can approve anything they want");
	}

}
