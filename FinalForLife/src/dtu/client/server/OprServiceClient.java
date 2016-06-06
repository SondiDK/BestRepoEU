package dtu.client.server;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class OprServiceClient {

	
	private IOprServiceAsync service;
	
	private OprServiceClient(String url){
	
		this.service = GWT.create(IOprService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
		endpoint.setServiceEntryPoint(url);
		
		
	}
}
