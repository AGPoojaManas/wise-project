package com.ts.rest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ts.dao.JdbcDao;
import com.ts.dto.Employee;
import com.ts.dto.Student;

@Path("StudentResource")
public class StudentResource {
	@Path("getStudentByUserId/{userId}")
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
	 public Student getStudentByUserId(@PathParam("userId") String userId) {
		Student student = new Student("101","sachin","sachin@bvrith.edu.in","12345");
		Student student1 = new Student("102","rohith","rohith@bvrith.edu.in","12345");
		Student student2 = new Student("103","kohli","kohli@bvrith.edu.in","12345");
			List<Student> studList = new ArrayList<Student>();
			studList.add(student);
			studList.add(student1);
			studList.add(student2);
			for(Student stud: studList) {
				if(stud.getEmail()==userId) {
					return stud;
				}
			}
	        return null;
	    }

}
