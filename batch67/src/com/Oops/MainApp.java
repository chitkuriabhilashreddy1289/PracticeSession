package com.Oops;

public class MainApp {

	public static void main(String[] args) {
		   EmployeeService service=new EmpoyeeServiceImp();
		   service.addEmpolyee(new Employee1(1,"vinay",50000));
		   service.addEmpolyee(new Employee1(2,"hanmanth",80000));
		   service.addEmpolyee(new Employee1(3,"abhi",60000));
		   service.addEmpolyee(new Employee1(4,"sai",70000));
		   
		   System.out.println("All employees");
		   service.showEmployees();
		   try {
		   service.updateSalary(2,90000);
		   }catch(Exception e) {
			   System.out.println(e.getMessage());
		   }
		   System.out.println("\nEmployees with salary > 70000");
		  (( EmpoyeeServiceImp)service).empList.stream()
                               .filter(e->e.getSalary()>=70000)
                               .forEach(e->System.out.println(e.getName()));
		  BackEnd task=new BackEnd();
		  task.start();
	}

}
