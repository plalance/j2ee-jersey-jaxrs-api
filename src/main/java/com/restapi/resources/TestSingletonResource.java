package com.restapi.resources;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test-singleton")
 @Singleton
public class TestSingletonResource{
	
	private int count;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		count++;
		return "Test Singleton ! (actualiser pour incrémenter) Méthode appelée :"+count+"fois.";
	}
}
