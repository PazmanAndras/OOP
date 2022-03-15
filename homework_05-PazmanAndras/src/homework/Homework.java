package homework;

public class Homework {
	
	public static void main(String[] args)  {
		
		
		Book book = new Book("J.K. Rowling", "Harry Potter", 30, 102);
		
		
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

	}
}
