package com.restapi.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test")
public class TestParamsResource{

	@PathParam("pathParam") private String pathParam;
	@QueryParam("queryparam") private String queryParam;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		return "Ping Ok ! Paramètre de route :"+pathParam+". Pramètres de requête :"+queryParam;
	}
}
