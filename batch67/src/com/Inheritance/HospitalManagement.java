package com.Inheritance;

public class HospitalManagement {
	private int patientid;
	private String Name;
	private int Daysadmitted;
	private double DailyCharges;
	private double MedicineCharges;

	public int getpatientid() {
		return patientid;
	}

	public void setpatientid(int patientid) {
		this.patientid = patientid;

	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getDaysadmitted() {
		return Daysadmitted;
	}

	public void setDaysadmitted(int daysadmitted) {
		Daysadmitted = daysadmitted;
	}

	public double getDailyCharges() {
		return DailyCharges;
	}

	public void setDailyCharges(double dailyCharges) {
		this.DailyCharges = dailyCharges;
	}

	public double getMedicineCharges() {
		return MedicineCharges;
	}

	public void setMedicineCharges(double medicineCharges) {
		this.MedicineCharges = medicineCharges;
	}
	 public double calculateBill() {
		 return (Daysadmitted*DailyCharges)+MedicineCharges;


	 }


	  double calculateDiscount() {
		  if(Daysadmitted>=10) {
			  return calculateBill()*0.10;

			 }
		  else if(Daysadmitted>=5) {
			  return calculateBill()*0.05;
		  }
		  else{
			  return 0;
		  }
	  }
	    public void displayBill() {
	    	double total= calculateBill() ;
	    	double discountprice=calculateDiscount();
	    	double Finalprice= total-discountprice;
	    	System.out.println("patientid:"+patientid);
	    	System.out.println("patientName:"+Name);
	    	System.out.println("Daysadmitted:"+Daysadmitted);
	    	System.out.println("DailyCharges:"+DailyCharges);
	    	System.out.println("MedicineCharges:"+MedicineCharges);
	    	System.out.println("total:"+total);
	        System.out.println("discountprice:"+discountprice);
            System.out.println("Finalprice:"+Finalprice);

	    }


	public static void main(String[] args) {
		HospitalManagement h= new HospitalManagement();
	    h.setpatientid(6);
	    h.setName("Praveen");
	    h.setDaysadmitted(7);
	    h.setDailyCharges(1500);
	    h.setMedicineCharges(10000.0);
	    h.displayBill();

	}

}
