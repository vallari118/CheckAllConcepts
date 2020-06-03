package com.basic.check.CheckAllConcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CheckAllConceptsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CheckAllConceptsApplication.class, args);
//		Employee emp = context.getBean(Employee.class);
//		emp.setEid(100);
//		emp.setEname("Vallari");
//		emp.showEployeeDetails();

		FarmerService farmer = context.getBean(FarmerService.class);
		System.out.println("Field Area:"+ farmer.getFieldArea());
	}

}
