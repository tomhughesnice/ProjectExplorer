package com.tribal.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tribal.test.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class ProjectControllerTest {
	
	@Test
	public void emptyTest() {
		// Possibly could call the controllers here using Mock MVC?
	}

}
