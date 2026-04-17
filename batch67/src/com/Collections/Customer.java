package com.Collections;

public class Customer {
  int cusid;
  String cusname;
  int cage;
  public Customer(int cusid, String cusname, int cage) {
	super();
	this.cusid = cusid;
	this.cusname = cusname;
	this.cage = cage;
  }
  @Override
  public String toString() {
	return "Customer [cusid=" + cusid + ", cusname=" + cusname + ", cage=" + cage + "]";
  }

}
