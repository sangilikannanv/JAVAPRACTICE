package com.study;
import org.apache.catalina.core.ApplicationContext;
import org.apache.naming.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(IocApplication.class, args);
		
		
	
		
		Student stud1= context.getBean(Student.class);
		stud1.setName("first");
		Department depts = new Department();
		depts.setDeptName("MECH");
		stud1.setDept(depts);
		
		System.out.println(stud1);
		
		Student stud2= context.getBean(Student.class);
		System.out.println(stud2.getName());
		Student stud3= context.getBean(Student.class);
		System.out.println(stud3);
		
		System.out.println(stud3.getDept().getDeptName());
		
		
		//Student sy= new Student();
		
		
	}
	
	
}
