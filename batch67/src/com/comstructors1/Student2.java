package com.comstructors1;

public class Student2 {
	int id;
	String name;
	String section;
	// parameterized contructor
  Student2(int id,String name,String section){
	  this.id =  id;
	  this.name =  name;
	  this.section =  section;
	  
  }
  //copy constructor
  Student2( Student2 original1,String section){
	  this.id =  original1.id;
	  this.name =  original1.name;
	  this.section =  section;
	  }
  void show() {
	  System.out.println("Student Id:"+id);
	  System.out.println("Student Name:"+name);
	  System.out.println("Student Section:"+section);
  }
  
  

	public static void main(String[] args) {
		Student2 original1 = new Student2(23,"abhi","d");
		Student2 original2 = new Student2(original1,"c");
         original1.show();
         original2.show();
	}

}
