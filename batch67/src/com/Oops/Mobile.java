package com.Oops;


public class Mobile {
	private int mobileid;
	private String brand;
	private String model;
	private double price;
	private int stock;
// to get variable
	public int getMobileid() {
		return mobileid;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
//constructor created to assign fields when object is created
	Mobile(int mobileid, String brand, String model, double price, int stock) {
		this.mobileid = mobileid;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.stock = stock;
	}
	public void addstock(int quantity) {
		stock=stock+quantity;
	}
 //method to calculate price 
	double sellPhone(int quantity) {
		if (stock >= quantity) {
			stock -= quantity;
		} else {
			System.out.println("Stock is not sufficient");
		}
		return quantity * price;
	}
    //display fields
	void Display() {
		System.out.println("mobileid:" + mobileid);
		System.out.println("brand:" + brand);
		System.out.println("model:" + model);
		System.out.println("price:" + price);
		System.out.println("stock:" + stock);
	}

	public static void main(String[] args) {
		Mobile m = new Mobile(1, "Real Me", "6 pro", 16000, 500);
		Mobile m1 = new Mobile(2, "Red Me", "8pro", 25500, 500);
		m.addstock(700);
		m.Display();
		System.out.println("Total price:"+m.sellPhone(50));
		m.Display();
		m1.Display();
		System.out.println("Total price:"+m1.sellPhone(70));
		m1.Display();
		m.addstock(700);

	}

}