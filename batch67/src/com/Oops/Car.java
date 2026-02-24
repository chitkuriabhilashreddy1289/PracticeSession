package com.Oops;

public class Car implements CarInterface{
    String brand;
    int speed;
	Car(String brand,int speed){
		this.brand=brand;
		this.speed=speed;
		
	}

	@Override
	public void accelerate() {
        if( speed+10>=100) {
        	speed+=10;
        	System.out.println("You have reached max speed limit");
        }  else {
        	speed+=10;
        }
        
        display();
	}

	@Override
	public void Break() {
		
		if(speed-10<0) {
		    speed= 0;
		}
		else {
			speed-=10;
		}
		display();
	}

	
	@Override
	public void display() {
		System.out.println("Speed:"+speed+"km/h");
	}
	public static void main(String[] args) {
          Car c=new Car("toyota Hilux",90);
          System.out.println("Car brand:"+c.brand);
          c.accelerate();
          c.accelerate();
          c.Break();
	}

}
