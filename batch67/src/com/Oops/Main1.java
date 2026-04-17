package com.Oops;



public class Main1 extends Salary{

	public static void main(String[] args) {
		Developer dev=new Developer();
		dev.Office();
		dev.work();
         Salary s=new Main1();

         s.setAmount(50000);
        System.out.println("Salary:"+s.getAmount());
	}

}
