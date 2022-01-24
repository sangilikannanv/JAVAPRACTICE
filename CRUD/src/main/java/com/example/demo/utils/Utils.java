package com.example.demo.utils;

import org.springframework.stereotype.Component;

import com.example.demo.exception.InvalidCertException;
import com.example.demo.model.Student;

@Component
public class Utils {

	public boolean validateStudent(Student student) throws InvalidCertException {

		if (("YES").equalsIgnoreCase(student.getCertificate())) {
			return true;
		} else {
			throw new InvalidCertException("No certificate");
		}

	}
}
