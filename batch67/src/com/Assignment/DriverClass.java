package com.Assignment;

public class DriverClass {

	public static void main(String[] args) {
           Vehicle v=new Vehicle("TS31G4416","car",13);
           Vehicle v1=new Vehicle("TS31G4461","bike",17);
           Vehicle v2=new Vehicle("TS31G4753","truck",9);


           ParkingLot p=new ParkingLot();
           p.parkVehicle(v);
           p.parkVehicle(v1);
           p.parkVehicle(v2);
           p.showcollection();

	}

}
