package com.constructors;

public class Movie {
	
		String title;
		String director;
		double rating;
	   //no arg constructer
		Movie(){
			this("bahubali");
			System.out.println( "no arg constructer");
		
			}
			
			  //one arg constructer
			Movie (String title ){
				this(title,"rajamouli");
				System.out.println( "one arg constructer called");
			
			
		}
			  //two  arg constructer
			Movie (String title,String director){
				this(title,director,5.0);
				System.out.println( "two arg constructer called");
				
				}
			Movie (String title,String director,double rating){
				System.out.println( "three arg constructer called");
				this.title=title;
				this.director=director; 
				this.rating=rating;
				}
                  void showdetails() {
                	  System.out.println("Title Name:"+title);
                	  System.out.println("Director:"+director);
                	  System.out.println("Rating:"+rating);
                	  
                  }
		public static void main(String[] args) {
			System.out.println("main method started ");
			Movie c1 = new Movie();
			c1.showdetails();
			Movie c2=new Movie("kramp");
			c2.showdetails();	
			Movie c3=new Movie("kramp","Trivikram");
			c3.showdetails();
			Movie c5=new Movie("kramp","Trivikram");
			c5.showdetails();
			Movie c4=new Movie("pushpa","sukumar",2.5);
			c4.showdetails();
            
			}
			
		}

	


	

