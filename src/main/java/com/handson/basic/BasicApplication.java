package com.handson.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}

}

//cd ~/work/harely-basicSpring
//		docker-compose up -d
// docker-compose -f docker-compose-ci.yml up --force-recreate
// docker exec harely-basicspring_newman_1 newman run STUDENTS_TEST.postman_collection.json --reporters cli,junit,htmlextra --reporter-junit-export "newman/report.xml" --reporter-htmlextra-export "newman/report.html"

// Bearer
