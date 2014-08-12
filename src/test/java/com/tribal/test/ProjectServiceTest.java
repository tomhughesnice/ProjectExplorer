package com.tribal.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.tribal.test.config.AppConfig;
import com.tribal.test.domain.Project;
import com.tribal.test.enums.ProjectPhaseEnum;
import com.tribal.test.service.ProjectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class ProjectServiceTest {
	
	@Autowired
	private ProjectService projectService;
	
	@Test
	public void saveTest() {
		Project project = new Project();
		project.setCode("GH12");
		project.setId(1);
		project.setName("Test Project");
		project.setPhase(ProjectPhaseEnum.DEVELOPMENT);
		try {
			projectService.create(project);
		} catch(Exception e) {
			Assert.fail();
		}
	}

}
