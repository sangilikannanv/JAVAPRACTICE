package com.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.basic.entity.Paint;
import com.basic.entity.Student;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@PropertySource("classpath:manualProp.properties")
@Slf4j
public class SpringBasicsApplication implements CommandLineRunner{

	@Autowired
	private Student student;
	
	@Autowired
	@Qualifier("blueX")
	private Paint paint;
	
	@Value("${ragu.mobile.number}")
	private String mobNumber;
	
	@Value("16383")
	private int rollNum;
	
	@Value("${name}")
	private String regNum;
	
	
//	@Autowired
//	public SpringBasicsApplication(Student student) {
//		this.student=student;
//	}
//	
//	@Autowired
//	public void setSpringBasicApplication(Student student) {
//		this.student=student;
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBasicsApplication.class, args);
	}

	
	@PostConstruct
	public void postConstruct()
	{
		System.out.println("First Call");
	}
	
	@PreDestroy
	public void preDestroy()
	{
		System.out.println("last");
	}
	
@Override
public void run(String... args) throws Exception {
	paint.color();
	
	System.out.println(mobNumber);
	System.out.println(rollNum+" "+regNum);
}
	

@Bean
public void BeanCreation()
{
	System.out.println("Bean created");
}
	
//	SpringBasicsApplication()
//	{
//		student.setId(45);
//		System.out.println(student.getId());
//	}
}







