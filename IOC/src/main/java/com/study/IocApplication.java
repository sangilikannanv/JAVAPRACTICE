package com.study;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IocApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(IocApplication.class, args);
		
		Student stud1= context.getBean(Student.class);
		stud1.setName("first");
		
		System.out.println(stud1);
		
		Student stud2= context.getBean(Student.class);
		System.out.println(stud2);
		Student stud3= context.getBean(Student.class);
		System.out.println(stud3);
		
		System.out.println(stud3.getDept().getDeptName());
		
		
		//Student sy= new Student();
		
		
	}
	
	
}
