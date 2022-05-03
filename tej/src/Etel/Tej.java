package Etel;

import java.time.LocalDate;

public class Tej extends Tejtermek{

	
	private int eladasiar;
	private Tipus tipus;
	private Kiszereles kiszereles;
	
	
	public Tej(int egysegar, String gyarto, LocalDate gyartasIdo, LocalDate lejaratiIdo) {
		super(egysegar, gyarto, gyartasIdo, lejaratiIdo);
		this.tipus = Tipus.ZSIROS;
		this.kiszereles = Kiszereles.LITERES;
		//õskonstruktor felhasznalassal: this(egysegar, gyarto, gyartasIdo, lejaratiIdo,eladasiar,Tipus.ZSIROS,Kiszereles.LITERES)
	}


	public Tej(int egysegar, String gyarto, LocalDate gyartasIdo, LocalDate lejaratiIdo, int eladasiar, Tipus tipus,
			Kiszereles kiszereles) {
		super(egysegar, gyarto, gyartasIdo, lejaratiIdo);
				
		
		int ar = 0;
		if(tipus == Tipus.FELZSIROS) {
			ar  = getEgysegar() * 1;
		}else
		{
			ar = getEgysegar() * 3;
		}
		this.eladasiar = ar;
		
		this.tipus = tipus;
		this.kiszereles = kiszereles;
	}
	

	public int getEladasiar() {
		return eladasiar;
	}


	public void setEladasiar(int eladasiar) {
		this.eladasiar = eladasiar;
	}


	public Tipus getTipus() {
		return tipus;
	}


	public void setTipus(Tipus tipus) {
		this.tipus = tipus;
	}


	public Kiszereles getKiszereles() {
		return kiszereles;
	}


	public void setKiszereles(Kiszereles kiszereles) {
		this.kiszereles = kiszereles;
	}


	@Override
	public String toString() {
		return "Tej [eladasiar=" + eladasiar + ", tipus=" + tipus + ", kiszereles=" + kiszereles + ", toString()="
				+ super.toString() + "]";
	}
	
	public Tej OlcsobbTej (Tej egyik, Tej masiktej) {
		
		if(egyik.getEladasiar() < masiktej.getEladasiar()) {
			return egyik;
		}else if(egyik.getEladasiar() > masiktej.getEladasiar()) {
			return masiktej;
		}
		return egyik;
		
	}
	
	
}
