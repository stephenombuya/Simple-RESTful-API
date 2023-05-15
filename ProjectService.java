package com.Springpro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springpro.Entity.Project;
import com.Springpro.Repository.ProjectRepo;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepo projectRepo;
	
	public Project saveDetails(Project project) {
	
		return projectRepo.save(project);
}
	
	public List<Project> getAllDetails(){
		
	   return projectRepo.findAll();
	}
}
