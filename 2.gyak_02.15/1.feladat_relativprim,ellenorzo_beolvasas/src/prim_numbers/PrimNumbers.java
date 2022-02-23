package prim_numbers;


import java.util.Scanner;

public class PrimNumbers {

	public static void main(String[] args) {
		
		int N = 0;
		N = beolvas();
		
		prim_kiir(N);
		

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
	
	public static void prim_kiir(int N)
	{
		int db = 0;
		
		for (int i = 10, j = i +1 ; db < N; i++, j++) {
			if (relativ_prim(i,j)) {
				db++;
				System.out.println("Relativ primek: "+i + " " +j);
			}
		}
		System.out.println(db + "darab relativ prim van");
	}
	public static boolean relativ_prim(int i, int j){
		if (lnko(i, j) == 1)
				return true;
		
		return false;
		
	}
	
	public static int lnko(int a, int b) {
	    while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
			
		}
	    
	    return a;
	}

}
