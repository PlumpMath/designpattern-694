package com.tanzl.chain;

public class App {
 public static void main(String[] args) {
   RequestHandler reqhandler=new SafeHandler(new ServiceHandler(new ResponseHandler(null)));
   Request req=new Request();
   req.setRequestType(2);
   reqhandler.handRequest(req);
}
}
