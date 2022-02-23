package szamsor;


import java.util.Scanner;

public class SzamSor {

	public static void main(String[] args){
		
		int N = 0;
		N = beolvas();
		
		kiir(N);

		
	}
	public static int beolvas()
	{
		int szam = 0;
		
		Scanner input = new Scanner(System.in); //buffer
	
		
		do {
			System.out.println("Adj meg egy szamot [1,10] között");
		
			while (!input.hasNextInt()) {
			System.out.println("Ez nem szam, add meg ujra");
			input.next();
		}
		szam = input.nextInt();
		} while (szam<1 || szam>10);
		
		input.close();
		
		
		return szam;
		
	}
	
	public static void kiir(int meret) {
		
		cimke: for (int i = 0; i <= meret; i++) {
			for (int j = 1; j <= meret; j++) {
				System.out.println(i);
				
				if(i == j) {
					System.out.println("\n");
					continue cimke;
				}
			}
		}
		
	}
}
