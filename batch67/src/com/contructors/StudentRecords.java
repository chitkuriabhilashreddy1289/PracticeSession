package com.contructors;

public class StudentRecords {
	  String name;
      int id;
      char section;
      
      StudentRecords(String name,int id,char section){
    	  this.name=name;
    	  this.id=id;
    	  this.section=section;
      }
      
      StudentRecords(StudentRecords s1){
    	  this.name=s1.name;
    	  this.id=s1.id;
    	  this.section=s1.section;
      }
    	
      
      void display() {
    	  System.out.println(name);
    	  System.out.println(id);
    	  System.out.println(section);
      }

	public static void main(String[] args) {
		StudentRecords s=new StudentRecords("abhi",105,'A');
		StudentRecords s1=new StudentRecords(s);
		s1.section='B';
		s.display();
		s1.display();
	}

}
