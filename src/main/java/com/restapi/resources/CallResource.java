package com.restapi.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restapi.models.Calls;

@Path("/callservice")
public class CallResource{
	
	@GET
	@Path("/calls")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Calls> getCalls(){
		List<Calls> callList = new ArrayList<Calls>();
		
		Calls calls = new Calls();
		calls.setCallId("01");
		calls.setCallName("Super Calls 1");
		calls.setTimestamp(""+System.currentTimeMillis());
		
		callList.add(calls);
		
		return callList;
		
	}
}
