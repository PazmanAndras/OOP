package homework;

import java.util.Scanner;

public class Homework {
	
	public static void main(String[] args)  {
		
		
		
		int n = readInt();
		
		
		Book[] bookArray = new Book[n];
		
		
		
		
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
