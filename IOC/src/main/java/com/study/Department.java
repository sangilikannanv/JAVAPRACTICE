package com.study;

import org.springframework.stereotype.Component;

@Component
public class Department {

	private  String deptName;
	
	public Department() {

	}

	public String getDeptName() {
		return deptName;
	}

	
	  public void setDeptName(String deptName) { this.deptName = deptName; }
	

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + "]";
	}

}
