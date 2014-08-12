package com.tribal.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tribal.test.domain.Project;
import com.tribal.test.repository.ProjectDAO;

/**
 * Holds all Business logic related to domain operations.
 * @author thomash
 *
 */
@Service
public class ProjectService {
	
	@Autowired
	private ProjectDAO projectDAO;
	
	public ProjectService() {
		
	}
	
	public int create(Project project) {
		return projectDAO.create(project);
	}
	
	public Project read(int id) {
		return projectDAO.read(id);
	}
	
	public List<Project> readAll() {
		return projectDAO.readAll();
	}
	
	public void update(Project project) {
		projectDAO.update(project);
	}
	
	public void delete(int id) {
		projectDAO.delete(id);
	}

}
