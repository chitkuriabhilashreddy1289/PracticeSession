package com.langfundamentals;

public class Book {
	
	   void  calculatedetails() {
	   
	int bookid = 5 ;
	String title = "mahabaratham";
	String author = "vinay";
	double price = 40 ;
	double discountpercentage= 20;
    double Discountprice = price * 0.20;
    double finalprice = price - Discountprice; 		
		System.out.println("BookId:"+bookid);
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		System.out.println("Discountpercentage:"+discountpercentage);
	    System.out.println("DiscountPrice:"+ Discountprice);	
	    System.out.println("Finalprice:"+finalprice);
		
	
	
}
      
	   
	   public static void main(String[]args) {
            Book b= new Book();
            b.calculatedetails();
   }
}