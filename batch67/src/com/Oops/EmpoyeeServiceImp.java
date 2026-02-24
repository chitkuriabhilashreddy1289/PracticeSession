package com.Oops;

import java.util.ArrayList;
import java.util.List;

public class EmpoyeeServiceImp implements EmployeeService {

	List<Employee1> empList = new ArrayList<>();

	@Override
	public void addEmpolyee(Employee1 emp) {
		empList.add(emp);

	}

	@Override
	public void showEmployees() {
       for(Employee1 e:empList) {
    	   System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
       }
	}

	@Override
	public Employee1 getSalaryById(int id) {
		for(Employee1 e:empList) {
			if(e.getId()==id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public void updateSalary(int id, double salary) {
		Employee1 emp =(Employee1) empList.stream()
				.filter(e->e.getId()==id)
				.findFirst()
				.orElse(null);
		if (emp==null) {
			throw new RuntimeException("employee not found");
		}
		emp.setSalary(salary);
	}

}
