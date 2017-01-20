package com.tanzl.chain;

public class SafeHandler extends RequestHandler{
	SafeHandler(RequestHandler handler) {
		super(handler);
	}

	@Override
	void handRequest(Request req) {
		if(req.getRequestType()==1){
			System.out.println(" safe hand");
		}else{
			super.handRequest(req);
		}
		
	}

}
