package com.spcontact.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spcontact"})
public class SpringRootConfig {
// Things will get Added : Services , DAO, DataSource, Email Sender or some other business layer beands
	
	
}
