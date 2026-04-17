package com.Oops;

class Item {
	private String title;
	private int id;

	public Item(String title,int id){
		this.title=title;
		setId(id);

	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		}
		else {
			System.out.println("Invalid Id");
		}
	}








	public void showDetails() {
		System.out.println("Title:" + title);
		System.out.println("Id:" + id);
	}
}

class Book extends Item {
	 String author;
	 Book(String title,int id,String author){
			super(title,id);
			this.author=author;
	/*	}
	 public String getAuthor() {
			return author;
		}
	 public void setAuthor(String author) {
			this.author = author;
		}*/

	 }



	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Author:"+author);
	}

}
class Ebook extends Book{
	private double filesizeMB;
    Ebook(String title,int id,String author,double filesizeMB){
    	super( title, id, author);
    	setFilesizeMB(filesizeMB);
    }
    public double getFilesizeMB() {
		return filesizeMB;
	}
    public void setFilesizeMB(double filesizeMB) {
		if(filesizeMB<500) {
		this.filesizeMB = filesizeMB;
	}
		else {
			System.out.println("size is more than expected");
		}
	}



	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("filesizeMB:"+filesizeMB);
	}

}
public class Library {

	public static void main(String[] args) {
         Book b=new Book("social",-1,"vinay");
         Ebook e=new Ebook("social",-1,"vinay",500);
          b.showDetails();
          e.showDetails();
          System.out.println("====================");
          b.setId(100);
          e.setId(202);
          e.setFilesizeMB(400);
          System.out.println("=================");
          b.showDetails();
          System.out.println();
          e.showDetails();
	}

}
