package com.contructors;

public class CopyConstructer {
	int id;
	String Name;
	

	CopyConstructer(int i, String n) {
		id = i;
		Name = n;

	}

	@Override
	public String toString() {
		return "CopyConstructer [id=" + id + ", Name=" + Name + "]";
	}

	CopyConstructer(CopyConstructer c) {
		id = c.id;
		Name = c.Name;
	}

	void display() {
		System.out.println("Id:" + id);
		System.out.println("Name:" + Name);

	}

	public static void main(String[] args) {
		CopyConstructer c1 = new CopyConstructer(100, "Vinay");
		CopyConstructer c2 = new CopyConstructer(c1);
		c1.display();
		c2.display();
	}

}
