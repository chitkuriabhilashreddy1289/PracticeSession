package com.Assignment;

public class Vehicle {

	String vehiclenumber;
	String type;
	int passcode;

	Vehicle(String vehiclenumber,String type,int passcode){
		this.vehiclenumber=vehiclenumber;
		this.type=type;
		this.passcode=passcode;

	}

	boolean isVip(){
		if(isPrime()) {
			return true;

		}
		return false;
	}

	 boolean isPrime() {
		 int n= passcode;
		 if(n<=1) {
			return false;
		 }
			 for(int i=2;i<=n/2;i++) {
				 if(n%i==0) {
					return false;
				 }


	 }
		return true;
	}

}
class ParkingLot{

	int totalAmount=0;

	void parkVehicle(Vehicle v) {
		if(v.isVip()) {
			System.out.println("0 fee you got free parking for:"+v.type +"  "+"\nVehiclenumber:"+v.vehiclenumber);
		}
		else if(v.type.equals("car")) {
			System.out.println("parking type:car");
			System.out.println("Amount in Rs:"+50);
			totalAmount+=50;
	}
		else if(v.type.equals("bike")) {
			System.out.println("parking type:bike");
			System.out.println("Amount in Rs:"+20);
			totalAmount+=20;
	}
		else if(v.type.equals("truck")) {
			System.out.println("parking type:truck");
			System.out.println("Amount in Rs:"+100);
			totalAmount+=100;
	}


}
	void showcollection() {
		System.out.println("\nTotalAmount:"+totalAmount);
	}
}