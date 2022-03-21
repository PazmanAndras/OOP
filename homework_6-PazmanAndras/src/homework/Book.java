package homework;

import java.time.LocalDate;
import java.util.Iterator;

public class Book {
	private String author;
	private String title;
	private int yearOfPublication;
	private int price = 0;
	private int pages = 0;
	
	
	//Konstruktorok
	public Book(String author, String title, int price, int pages){
		this.author = author;
		this.title = title;
		this.yearOfPublication = java.time.LocalDate.now().getYear();
		
		if(price < 0) {
			this.price = 0;
		}else{
			this.price = price;
		}
		
		
		
		if(pages > 0) {
			this.pages = pages;
		}else {
			 this.pages = 0;
		}
		
		
		
	
	
		
		
		
	}
	
	public Book(String author, String title){
		this.author = author;
		this.title = title;
		this.price = 2500;
		this.pages = 100;
		
	}
	
	//Getters&Setters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if(pages > 0) 
			this.pages = pages;
	
		
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 1000)
			this.price = price;
		else
			this.price = 1000;
	}

	
	//Methods
	
	public void increasePrice(int percentage) {
		if (percentage > 0) {
			price += Math.round(price*(float)percentage/100);
		}	
	}
	
	

	@Override
	public  String toString() {
		return author + ": " + title + ", " + yearOfPublication + ". Price: " + price + " Ft";
	}

	

	public void setYearOfPublication(int yearOfPublication) {
		if (yearOfPublication >= 1950 && yearOfPublication <= 2021)
			this.yearOfPublication = yearOfPublication;
		else 
			this.yearOfPublication = 2021;
	}

	
	public static int comparePublicationDate(Book book1, Book book2) {
		if(book1.yearOfPublication > book2.yearOfPublication ) {
			return 1;
		}else if(book1.yearOfPublication < book2.yearOfPublication) {
			return 2;
		}else {
			return 0;
		}
	}
	
	
	/*6.homework methods*/
	
	public static Book getLonger(Book b1, Book b2){
		if(b1.pages >= b2.pages ) 
			return b1;
		return b2;	
		
	}
	
	public boolean hasEvenPages() {
		if((pages % 2 )!= 0) 
			return false;
		return true;
	}
	
	public static void listBookArray(Book[] book) {
		for(Book item : book) {
			System.out.println(item);
		}
	}
	
	public static Book getLongestBook(Book[] book) {
		Book max = book[0];
		for (int i = 0; i < book.length; i++) {
			if(book[i].pages > max.pages) {
				max = book[i];
			}					
		}
		return max;
	}
	
	public static Book getLongestEvenPagesBook(Book[] book) {
		
		Book maxBook = book[0];
		
		for (int i = 0; i < book.length; i++) {
			if(book[i].hasEvenPages()==true) {
				maxBook = book[i];
			}else {
				
				
			}
		}
		for (int i = 0; i < book.length; i++) {
			if(book[i].hasEvenPages()==true && book[i].pages > maxBook.pages ) {
				maxBook = book[i];		
			}
		}
		return maxBook;
		
		
	
	}
	
	public static void authorStatistics(Book[] books) {
		
		for (int i = 0; i < books.length; i++) {
			if(books[i+1].author == books[i].author) {
				
			}
		}
		
	}
	

	
}

