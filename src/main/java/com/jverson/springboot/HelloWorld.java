package com.jverson.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication 
public class HelloWorld {

	private static Logger logger = LoggerFactory.getLogger("com.jverson.springboot.HelloWorld");
	
	public static void main(String[] args) {
//		SpringApplication.run(HelloWorld.class, args);
//		SpringApplication app = new SpringApplication(HelloWorld.class);
//		app.setBannerMode(Banner.Mode.OFF);
//		app.run(args);
		ApplicationContext ctx = new SpringApplicationBuilder().sources(HelloWorld.class)
		    .bannerMode(Banner.Mode.LOG).run(args);
		String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
		for (String string : activeProfiles) {
			logger.warn("the active profile is: " + string);
		}
	}
	
}
