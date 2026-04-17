package com.Inheritance;

public class HospitalBill {

	public static void main(String[] args) {
		HospitalManagement h= new HospitalManagement();
	    h.setpatientid(6);
	    h.setName("Praveen");
	    h.setDaysadmitted(3);
	    h.setDailyCharges(1500);
	    h.setMedicineCharges(10000.0);
	    h.displayBill();

	}

}
