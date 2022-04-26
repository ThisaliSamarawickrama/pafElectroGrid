package net.codejava.ws;
 
 
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/bonjour")
public class Main_resource {
 
	PowercutDAO  powercutDao = new PowercutDAO();
	
    
    @GET
    @Path("/retrieveAllPowerCutPlans")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Powercutmodel>  getUser() throws SQLException {
		 return powercutDao.getUser();
		
	}
	
	@Path("/insertionPowerCutPlans")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Powercutmodel addUser(Powercutmodel cutplan) {
		 return powercutDao.insertPlan(cutplan);
		
	}
	
	@Path("/deletePlanById/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public int deleteUser(@PathParam("id") int id) {
		return powercutDao.deletetPlan(id);
		
	}
	
	
	@Path("/retrieveById/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Powercutmodel>  getUser(@PathParam("id") int id) throws SQLException {
		return powercutDao.getPlanById(id);
		
	}
	
	
	@Path("/updatePlan")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Powercutmodel updateUser(Powercutmodel cutplan) {
		 return powercutDao.updatetpowercut(cutplan);
		
	}
}