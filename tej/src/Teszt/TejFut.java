package Teszt;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import Etel.Kiszereles;
import Etel.Tej;
import Etel.Tejtermek;
import Etel.Tipus;

public class TejFut {

	public static void main(String[] args) {
		
		
		Tej tejtermek[] = new Tej[2
		                          ];
		
		/*
		tejtermek[0] = new Tej(400, "ez",LocalDate.of(2020, 4, 1) ,LocalDate.of(2022, 12, 12),500, Tipus.ZSIROS, Kiszereles.POHARAS);
		tejtermek[1] = new Tej(500, "eze",LocalDate.of(2020, 2, 1) ,LocalDate.of(2022, 12, 12),100, Tipus.FELZSIROS, Kiszereles.POHARAS);
		tejtermek[2] = new Tej(200, "ezet",LocalDate.of(2020, 3, 1) ,LocalDate.of(2022, 12, 12),180, Tipus.FELZSIROS, Kiszereles.LITERES);
	*/
		
		beolvas(tejtermek);
		
		System.out.println("Ihato, zsiros,poharas termekek:");
		for (int i = 0; i < tejtermek.length; i++) {
			
			if(tejtermek[i].IhatoE() && tejtermek[i].getTipus() == Tipus.ZSIROS && tejtermek[i].getKiszereles() == Kiszereles.POHARAS)
			{
				System.out.println(tejtermek[i].toString());
			}
		}
		
		int sum = 0;
		for (Tej tej : tejtermek) {
			sum += tej.getEgysegar();		}
		System.out.println("tej egysegar:"+sum);
		
		kiir(tejtermek);
		
	}

	private static void kiir(Tej[] tejtermek) {
		for (int i = 0; i < tejtermek.length; i++) {
			System.out.println(tejtermek[i].toString());
		}
		
	}

	private static void beolvas(Tej[] tejtermek) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		
		for (int i = 0; i < tejtermek.length; i++) {
			
			tejtermek[i] = new Tej(i, null, null, null, i, null, null);
			
			
			int ok = 1, ertek = 0;
			do {
				System.out.println((i+1)+"Egysegar (150- 220)");
					while(!input.hasNextInt()) {
						System.out.println("Nem szam");
						input.next();
						ok = 0;
					}
					ertek = input.nextInt();
					tejtermek[i].setEgysegar(ertek);
					ok = 1;
			
				} while (ok!=1 || ertek < 150 || ertek > 220);
			
			input.nextLine();
			System.out.println("gyarto");
			String gyarto = input.nextLine();
			tejtermek[i].setGyarto(gyarto);
			
			
			//System.out.println("Datum-év:");
			
			int ev = 0, honap = 0, nap = 0;
			do {
				ok  = 1;
				System.out.println((i+1)+"gyartasi Év:");
					while(!input.hasNextInt()) {
						System.out.println("Nem szam");
						input.next();
						ok = 0;
					}
					ev = input.nextInt();
					
					//tejtermek[i].setGyartasIdo(LocalDate.of(ev, honap, nap));
					ok = 1;
			
				} while (ok!=1);
						
			honap = random.nextInt(12)+1;
			nap = random.nextInt(12)+1;
			
			tejtermek[i].setGyartasIdo(LocalDate.of(ev, honap, nap));
			
			input.nextLine();
			
			int lejaratiev = 0;
			do {
				ok  = 1;
				System.out.println((i+1)+"Lejarati  Év:");
					while(!input.hasNextInt()) {
						System.out.println("Nem szam");
						input.next();
						ok = 0;
					}
					lejaratiev = input.nextInt();
					
					//tejtermek[i].setGyartasIdo(LocalDate.of(ev, honap, nap));
					ok = 1;
			
				} while (ok!=1 || lejaratiev < ev);
			
			tejtermek[i].setLejaratiIdo(LocalDate.of(lejaratiev, honap, nap));
			
			System.out.println("Kiszereles: ");
			String kiszereles = input.nextLine();
			if(kiszereles.equalsIgnoreCase("poharas")) {
				tejtermek[i].setKiszereles(Kiszereles.POHARAS);
			}
			else if(kiszereles.equalsIgnoreCase("literes")) {
				tejtermek[i].setKiszereles(Kiszereles.LITERES);
			}else
			{
				tejtermek[i].setKiszereles(Kiszereles.FELLITERES);
			}
			input.nextLine();
		}

		
	}

}
