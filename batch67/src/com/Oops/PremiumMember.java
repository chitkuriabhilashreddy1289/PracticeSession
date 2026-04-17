package com.Oops;

public class PremiumMember extends LibraryMember {
	@Override
	 public double calculatefee()  {
      	  return getBooksborrowed()*5;
        }


}
