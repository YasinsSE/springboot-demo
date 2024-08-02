package com.project.rest_demo;

import com.project.rest_demo.entity.StoreInformation;
import com.project.rest_demo.repository.StoreInformationRepository;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;

import java.lang.annotation.Annotation;

@SpringBootApplication
public class RestDemoApplication{
// localhost:8080/v3/api-docs
// http://localhost:8080/swagger-ui/index.html
 	@Autowired
	StoreInformationRepository storeInformationRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}



	// For swagger-ui
	//@Bean
	//public GroupedOpenApi publicApi() {
	//	return GroupedOpenApi.builder()
	//			.group("cloudvendor")
	//			.pathsToMatch("/public/**")
	//			.build();
	//}

}
