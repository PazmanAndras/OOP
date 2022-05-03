package homework.bookhierachy;


import java.util.HashSet;

public class Book extends Product {
	private String author;
	private String title;
	private int yearOfPublication;
	private int pages = 0;
	private  String style;
	private int taxPercent;
	private static int number;
	
	
	
	
	//Konstruktorok
	public Book( String author, String title, int price,int pages, String style){
		super("book", price, 5);
		this.author = author;
		this.title = title;
		this.yearOfPublication = java.time.LocalDate.now().getYear();
		this.style = style;
		
		
		if(price < 0) {
			 super.setPrice(0);
		}else{
			super.setPrice(price);
		}
				
		
		if(pages > 0) {
			this.pages = pages;
		}else {
			 this.pages = 0;
		}
			
		number++;
		
	}
	
	public Book(String author, String title, String style ){
		this( author, title,2500, 100, style);
		
		
		
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
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	public int getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(int taxPercent) {
		
		if(taxPercent > 0)
			this.taxPercent = taxPercent;
	}
	
	
	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Book.number = number;
	}
	
	
	
	//Methods
	
	

	

	

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", yearOfPublication=" + yearOfPublication + ", pages="
				+ pages + ", style=" + style + ", getUnitPrice()=" + getUnitPrice() + ", getPrice()=" + getPrice()
				+ "]";
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
	
	//-------------------------------------------------------------------------------------------//
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
		int db = 0;
		for (int i = 0; i < book.length; i++) {
			if(book[i].hasEvenPages()==true) {
				maxBook = book[i];
				db++;
			}
		}
		
		for (int i = 0; i < book.length; i++) {
			if(book[i].hasEvenPages()==true && book[i].pages > maxBook.pages ) {
				maxBook = book[i];			
			}
			
		}
		
		if(db != 0) 
			return maxBook;
	    return maxBook = null;
	}
	
	
	//-------------------------------------------------------------------//
	/*7.homework-methods*/
	
	@Override
	public void decreasePrice(int percent) {
		
		if(this.style.equalsIgnoreCase("children")) {			
			super.decreasePrice(percent+7); 
		}else if(this.style.equalsIgnoreCase("guide")) {		
			super.decreasePrice(percent+5); 
		}else {
			super.decreasePrice(percent);
		}
			
		 
	}
	
	public static int countStyles(Book[] books) {		
		int count = 1;
		for (int i = 1; i < books.length; i++) {
			
			int j = 0;
			for (j = 0; j < i; j++) {
				
				if(books[i].style.equalsIgnoreCase(books[j].style))
				{
					break;
				}				
			}
				
			if(i == j)
			{
				count++;
			}					
		}		
		return count;			
		
	}
	
	
	public static void discountBooks(Book[] books, String style) {
		
		for (int i = 0; i < books.length; i++) {
			if(books[i].style.equalsIgnoreCase(style)) {
				
				books[i].decreasePrice(10);				
				 
			}
		}
	}
	
	public static int listBooksWithStyle(Book[] books, String style) {
		int count = 0;
		
		for (int i = 0; i < books.length; i++) {
			if(books[i].style.equalsIgnoreCase(style)) {
				System.out.println(books[i].toString());	
				count++;
			}
		}
		return count;
		
	}
	
	public static int avgPrice(Book[] books, String style) {
		
		int sum = 0, db = 0, avg;
		
		for (int i = 0; i < books.length; i++) {
			
			if (books[i].style.equalsIgnoreCase(style)) {
				db++;
				sum += books[i].getPrice();			
				
			}
		}
		if(db == 0)
		{
			return 0;
		}else
		{
			return avg = sum / db;
		}		
		
	}
	
	//-------------------------------------------------------------------------//
	/* 8. (heti) hw */
	
	public int getUnitPrice() {
		return (int) Math.round(getTaxedValue() / pages);
		
	}
	
	public static String[] selectAuthors(Book[] books, int unitPrice) {
			
		HashSet<String> authors = new HashSet<String>();
		
		for (int i = 0; i < books.length; i++) {
			
			if(books[i].getUnitPrice()  > unitPrice) {
				
				authors.add(books[i].author);
				
			}
		}
		String[] a = new String[authors.size()];
		authors.toArray(a);	
		
		
		//String[] a = (String[]) authors.toArray(); 
		/*ez inthez jo*/
		
		
		return a;
		
		
	}
	
	public static int sumGrossPrice(Book[] books) {
		
		int sum = 0;
		
		for (int i = 0; i < books.length; i++) {
			//sum += books[i].getUnitPrice();
			sum += books[i].getTaxedValue();
			
			
			//sum += (books[i].getPrice() * 0.05) + books[i].getPrice();
			//sum += (int)Math.round(((books[i].getPrice() * 0.05) + books[i].getPrice() ) / books[i].pages);
			
		}
		
		return sum;
	}
	
	
	 //--------------------------------------------------------------------------------------------------//
	 /* 9. hw- uccso- */
	
	public enum BookStyle{
		
		CHILDREN, GUIDE, CRIME, COOK, OTHER
	
		
	}
	
	
	
	
	
	
	
}










