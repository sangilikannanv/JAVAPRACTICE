package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exception.InvalidCertException;
import com.example.demo.model.Department;
import com.example.demo.model.Student;
import com.example.demo.model.StudentRequest;
import com.example.demo.model.StudentResponse;
import com.example.demo.repository.DepartmentRepo;
import com.example.demo.repository.StudentRepo;
import com.example.demo.utils.Utils;

@Service
public class StudentService implements Consumer<String> {

	@Autowired
	private StudentRepo repo;

	@Autowired
	private DepartmentRepo deptRepo;

	@Autowired
	private Utils utils;

	public List<Student> addUser(Student stuObj) {
		repo.save(stuObj);
		return repo.findAll();
	}
	
	public List<Student> getAllusers() {
		return repo.findAll();
	}

	public Student getUser(String name) {
		return repo.findByName(name);
	}

	public Student getUserId(int id) {
		return repo.findById(id).orElse(new Student());

	}

	public Student updateUser(Student obj) {
		Student rec = repo.findById(obj.getId()).orElse(new Student());
		rec.setName(obj.getName());
		rec.setPassword(obj.getPassword());

		return repo.save(rec);

	}

	public String deleteUser(Student obj) {
		repo.deleteById(obj.getId());
		return "deleted";

		// return repo.findById(obj.getId()) != null ? "Failed" : "Sucesss";
	}

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);

	}

	public static void main(String[] args) {

		List<String> cars = new ArrayList<String>();

		cars.add("Swift");

		cars.add("BMW");
		cars.add("Sjhgwift");

		// cars.stream().filter(item -> item.startsWith("S")).forEach(t -> new
		// StudentService().accept(t));
		cars.stream().filter(item -> item.startsWith("S")).forEach(t -> System.out.println(t));
		System.out.println("----------------------");
		cars.stream().forEach(t -> System.out.println(t));

	}

	@Transactional
	public StudentResponse addStudent(StudentRequest request) throws InvalidCertException {
		StudentResponse response = null;

		response = new StudentResponse();

		Department department = request.getDept();

		Student student = repo.save(request.getStudent());

		boolean sign = utils.validateStudent(student);

		if (sign) {
			department.setDeptNo(student.getId());
			deptRepo.save(department);
			response.setStudent(student);
			response.setDept(department);
			response.setStatus("Successfully registered :)");
		}

		return response;
	}
}
