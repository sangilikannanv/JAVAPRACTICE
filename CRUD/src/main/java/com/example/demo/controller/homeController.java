package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.model.StudentRequest;
import com.example.demo.model.StudentResponse;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/User/v1")
public class homeController {

	@Autowired
	private StudentService service;

	// @RequestMapping(path="/addUser", method = RequestMethod.POST)
	@PostMapping("/addUser")
	public List<Student> addUser(@RequestBody Student req/* , @PathVariable String name */) {
		// @pathvariable()
		return service.addUser(req);
	}

	@GetMapping("/getUsername/{name}")
	public Student getUsername(@PathVariable String name) {
		return service.getUser(name);
	}
	
	@GetMapping("/getAllusers")
	public List<Student> getAllusers() {
		return (service.getAllusers());
	}

	@PostMapping("/getUserFull")
	public Student getUserfull(@RequestBody Student req) {
		return service.getUser(req.getName());
	}

	@PutMapping("/updateUser")
	public Student updateUser(@RequestBody Student obj) {
		return service.updateUser(obj);
	}

	@DeleteMapping("/deleteUser")
	public String deleteeUser(@RequestBody Student obj) {
		return service.deleteUser(obj);
	}

	@PostMapping(path = "/addStudent")
	public StudentResponse addStudent(@RequestBody StudentRequest request) {
		StudentResponse studentResponse = null;
		try {
			studentResponse= service.addStudent(request);
		}catch(Exception e) {
			System.out.print("No Certificate "+e);
			studentResponse = new StudentResponse();
			studentResponse.setStudent(request.getStudent());
			studentResponse.setDept(request.getDept());
			studentResponse.setStatus("Failed to register");
		}
		return studentResponse;
	}

}
