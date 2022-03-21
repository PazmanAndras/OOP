package homework;

import java.util.Scanner;

public class Homework {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		Book book = new Book("J.K. Rowling", "Harry Potter", 30, 102);
		
		
		int n = readInt();
		
		
		Book[] bookArray = new Book[n];
		
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println((i+1)+". szerzo");
			String author = input.nextLine();
			
			System.out.println((i+1)+".cim");
			String title = input.nextLine();
			
			System.out.println((i+1)+".ar");
			String p = input.nextLine();
			int price = Integer.parseInt(p);
			
			System.out.println((i+1)+".oldalak");
			String pg = input.nextLine();
			int pages = Integer.parseInt(pg);
			
			bookArray[i] = new Book(author, title, price, pages);
		}
		
		Book.listBookArray(bookArray);
		
		/*
		// Test with invalid values
		book.setYearOfPublication(2025);
		book.setPrice(0);
		System.out.println(book.displayInfo());
		book.increasePrice(-10);
		System.out.println(book.displayInfo());
		
		// Test with valid values
		book.setYearOfPublication(2008);
		book.setPrice(3500);
		System.out.println(book.displayInfo());
		book.increasePrice(10);
		System.out.println(book.displayInfo()); 
		*/
		
		Book book1 = new Book("Harari", "Sapiens", 2021, 4500);
		Book book2 = new Book("Denkinger Géza", "Analizis");
		
	   System.out.println(book1.toString());
	   System.out.println(book2.toString());
	   
		
	   System.out.println(Book.comparePublicationDate(book1, book2));
	   System.out.println(Book.getLongestBook(bookArray));
	   

	}
	
	public static int readInt() {
		int n;
		Scanner input = new Scanner(System.in);
		
		do {
			
			//ez elleonri hogy int-e lehet e konvertalni
			while(!input.hasNextInt()) {
				System.out.println("nem szam"); //ha nem lehet kiirjuk hogy nem lehet konvertalni, hiba van
				input.nextLine();
			}
			//ha sikerult akkor fog sikerulni a konverzio, az n fel tudja venni a konvertalt erteket
			n = input.nextInt();
			
		}while(n < 0 || n > 10);
		
		return n;
	}
	
	
	
}
