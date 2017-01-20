package com.tanzl.chain;

public abstract class RequestHandler {
    RequestHandler nextHandler;
	RequestHandler(RequestHandler handler){
		this.nextHandler=handler;
	}
	
	void handRequest(Request req){
		if(nextHandler!=null){
			nextHandler.handRequest(req);
		}
	}
	
}
