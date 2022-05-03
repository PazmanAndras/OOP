package homework.shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import homework.bookhierachy.Book;
import homework.tax.Taxable;

public class BookStore {
	
	private  ArrayList<Book> stock = new ArrayList<Book>();
	private  ArrayList<Taxable> staff  =new ArrayList<Taxable>();
	

	
	public ArrayList<Book> getStock() {
		return stock;
	}
	public ArrayList<Taxable> getStaff() {
		return staff;
	}
	
	public void addToStock(Book book) {
		
		stock.add(book);
	}
	
	public void addToStaff(Employee employee) {
		
		staff.add(employee);
	}
	
	public int  listStock() {
		
		
		return stock.size();
	}
	
	public int  listStaff() {
		
		
		return staff.size();
	}
	
	public int sumVAT() {
		
		int sum = 0;
		for (int i = 0; i < stock.size(); i++) {
					
			sum += stock.get(i).getTax();
		}
		
		return sum;
	}
	
	public int sumIncomTax() {
		
		
		int sum = 0;
		for (int i = 0; i < staff.size(); i++) {
					
			sum += staff.get(i).getTax();
		}
		
		return sum;
		
	}
	
	public void sortByTitle() {
		
		stock.sort(Comparator.comparing(Book::getTitle));
	}
	
	public void reverseSortByPrice() {
		stock.sort(Comparator.comparing(Book::getPrice).reversed());
		
		
	}
	
	
}
