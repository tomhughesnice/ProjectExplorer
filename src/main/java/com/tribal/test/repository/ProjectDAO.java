package com.tribal.test.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tribal.test.domain.Project;
import com.tribal.test.enums.ProjectPhaseEnum;

/**
 * Manages all persistence and retrieval operations to an underlying persistence store. For this demo, I am just
 * persisting to an in memory ArrayList so this will be reinitialised each time this application is restarted.
 * 
 * @author thomash
 */
@Repository
public class ProjectDAO {

	private List<Project> projects = new ArrayList<Project>();
	int identitySeed = 0;

	public ProjectDAO() {
		//Initialise the Projects array with some values;
		Project project = new Project();
		project.setId(identitySeed++);
		project.setCode("TH123");
		project.setName("Test Project 1");
		project.setDeliveryDate(new Date());
		project.setPhase(ProjectPhaseEnum.BRIEFING);
		project.setPriority(1);
		projects.add(project);
		project = new Project();
		project.setId(identitySeed++);
		project.setCode("TH456");
		project.setName("Test Project 2");
		project.setDeliveryDate(new Date());
		project.setPhase(ProjectPhaseEnum.DEVELOPMENT);
		project.setPriority(2);
		projects.add(project);
		project = new Project();
		project.setId(identitySeed++);
		project.setCode("TH789");
		project.setName("Test Project 3");
		project.setDeliveryDate(new Date());
		project.setPhase(ProjectPhaseEnum.DEVELOPMENT);
		project.setPriority(3);
		projects.add(project);
	}

	/**
	 * Reads all project records
	 * @param id
	 * @return
	 */
	public List<Project> readAll() {
		return this.projects;
	}

	/**
	 * Creates a new Project record and returns the id
	 * @param project {@link Project}
	 * @return
	 */
	public int create(Project project) {
		project.setId(identitySeed++);
		this.projects.add(project);
		return project.getId();
	}

	/**
	 * Reads a Project record for the provided Id;
	 * @param id
	 * @return
	 */
	public Project read(int id) {
		for (Project project : projects) {
			if (project.getId() == id) {
				return project;
			}
		}
		return null;
	}

	/**
	 * Updates an existing Project record.
	 * For this crude example I simply delete the previous record and insert a new one.
	 * @param projectUpdate
	 */
	public void update(Project projectUpdate) {
		for (Project project : projects) {
			if (project.getId() == projectUpdate.getId()) {
				projects.remove(project);
				projects.add(projectUpdate);
				break;
			}
		}
	}

	/**
	 * Deletes a record by id
	 * @param id
	 */
	public void delete(int id) {
		for (Project project : projects) {
			if (project.getId() == id) {
				projects.remove(project);
				break;
			}
		}
	}

}
