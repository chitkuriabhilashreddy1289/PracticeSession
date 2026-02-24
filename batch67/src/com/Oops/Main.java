package com.Oops;
class Device{
	private boolean power;
	
	void turnOn() {
		power =true;
		System.out.println("power is turned On");
	}
	void turnOff() {
		power = false;
		System.out.println("power is turned Off");
	}
	public boolean isPoweron() {
		return power;
	}
}
     class SmartDevice extends Device{
    	 public void useDevice() {
    		 if(isPoweron()) {
    			System.out.println("Device is working"); 
    		 }
    		 else {
    			 System.out.println("please turn on the Device");
    		 }
    	 }
     }
public class Main {

	public static void main(String[] args) {
          SmartDevice s1=new  SmartDevice();
           s1.useDevice();
           s1.turnOn();
           s1.useDevice();
           s1.turnOff();
	}

}
