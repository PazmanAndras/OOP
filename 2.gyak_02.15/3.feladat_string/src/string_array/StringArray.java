package string_array;


import java.util.Scanner;


public class StringArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int meret;
		
		do {
			
			System.out.println("Give number between [1,9]:");
			while(!input.hasNextInt()) {
				System.out.println("Thats not a number");
				input.next();
			}
			
			meret= input.nextInt();
			
		} while (meret < 1 || meret > 10);
		
		
		System.out.println("kerem a nevet:");
		String[] nevek = new String[meret];
		
		for (int i = 0; i < nevek.length; i++) {
			nevek[i] = input.next();
		}
		
		input.close();
		
		for (int i = 0; i < nevek.length; i++) {
			System.out.println(nevek[i]);
		}
		
		int azonosNevekDb = azonosNevek(nevek);
		System.out.println(azonosNevekDb + "db azonos nevu van");
		
		int azonosKezdubetuDb = azonosKezdubetusek(nevek);
		System.out.println(azonosKezdubetuDb + "darab azonos kezdobetus van");
		
		
		
		
	}
	
	private static int azonosKezdubetusek(String[] nevek) {
		int db2 = 0;
		for (int i = 0; i < nevek.length; i++) {
			for (int j = i+1; j < nevek.length; j++) {
				if(nevek[i].charAt(0) == nevek[j].charAt(0)) {
					System.out.println("Azonos kezdubetuek" +nevek[i] + " " + nevek[j]);
				}
			}
		}
		
		return db2;
	}
	
	private static int azonosNevek(String[] nevek) {
		int db = 0;
		for (int i = 0; i < nevek.length; i++) {
			for (int j = i+ 1; j < nevek.length; j++) {
				if(nevek[i].equals(nevek[j])) {
					System.out.println("Azonosak: " +nevek[i] + " " + nevek[j]);
					db++;
				}
			}
			
		}
		return db;
	}
	

}
