package com.tanzl.chain;

public class ServiceHandler extends RequestHandler{
	ServiceHandler(RequestHandler handler) {
		super(handler);
	}

	@Override
	void handRequest(Request req) {
		if(req.getRequestType()==2){
			System.out.println("service hand");
		}else{
		super.handRequest(req);
		}
	}

	
}
