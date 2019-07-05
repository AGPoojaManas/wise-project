package com.ts.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ts.dto.Employee;
import com.ts.dto.Trainer;
@Path("TrainerResource")
public class TrainerResource {
	@Path("getTrainerByUserId/{userId}")
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
	 public Trainer getTrainerByUserId(@PathParam("userId") String userId) {
			Trainer trainer = new Trainer("101","shami","shami@talentsprint.com","12345");
			Trainer trainer1 = new Trainer("102","virat","virat@talentsprint.com","12345");
			Trainer trainer2 = new Trainer("103","dhoni","dhoni@talentsprint.com","12345");
			List<Trainer> tnrList = new ArrayList<Trainer>();
			tnrList.add(trainer);
			tnrList.add(trainer1);
			tnrList.add(trainer2);
			for(Trainer tnr: tnrList) {
				if(tnr.getTnrEmail()==userId) {
					return tnr;
				}
			}
	        return null;
	    }

}
