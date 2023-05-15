package com.Springpro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Springpro.Entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
