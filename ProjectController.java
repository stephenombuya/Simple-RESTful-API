package com.Springpro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Springpro.Entity.Project;
import com.Springpro.Service.ProjectService;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	private SessionFactory sessionFactory;

	@Autowired
	public ProjectController(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
	}
	
	@PostMapping("/addProject")
	public Project postDetails(@RequestBody String json) {
		// Open a Hibernate session
		Session session = sessionFactory.openSession();

		try {
		    // Begin a transaction
		    Transaction transaction = session.beginTransaction();

		    // Convert the JSON string to a Project object
		    ObjectMapper mapper = new ObjectMapper();
		    Project project = mapper.readValue(json, Project.class);

		    // Perform the insertion
		    session.save(project);

		    // Commit the transaction
		    transaction.commit();

		    // Return the saved project
		    return project;
		} catch (Exception e) {
		    // Handle any exceptions or rollback the transaction if needed
		    if (session.getTransaction() != null) {
		        session.getTransaction().rollback();
		    }
		    e.printStackTrace();

		    // Return null or throw an exception to indicate the failure
		    return null;
		} finally {
		    // Close the session
		    session.close();
		}
	}
	
	@GetMapping("/getProject")
	public List<Project> getDetails(){
		return projectService.getAllDetails();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
