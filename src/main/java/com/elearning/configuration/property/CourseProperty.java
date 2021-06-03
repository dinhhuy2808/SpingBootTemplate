package com.elearning.configuration.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Configuration
@PropertySource("classpath:application-${spring.profiles.active}.properties")
@ConfigurationProperties(prefix = "course")
@Getter @Setter
public class CourseProperty {
	private String path;
	private String inputPath;
}
