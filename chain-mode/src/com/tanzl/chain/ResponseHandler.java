package com.tanzl.chain;

public class ResponseHandler extends RequestHandler{

	ResponseHandler(RequestHandler handler) {
		super(handler);
	}

	@Override
	void handRequest(Request req) {
		if(req.getRequestType()==3){
			System.out.println("response hand");
		}else{
		super.handRequest(req);
		}
		}

	
}
