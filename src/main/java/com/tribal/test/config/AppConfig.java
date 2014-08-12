package com.tribal.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Configuration class for this application.
 * A place to configure bean definitions, database connections and the like.
 * @author thomash
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.tribal.test.repository", "com.tribal.test.service"})
public class AppConfig {
	
}
