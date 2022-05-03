package Etel;

import java.time.LocalDate;

public class Tejtermek {

	private int egysegar;
	private String gyarto;
	private LocalDate gyartasIdo;
	private LocalDate lejaratiIdo;
	
	
	public Tejtermek(int egysegar, String gyarto, LocalDate gyartasIdo, LocalDate lejaratiIdo) {
		super();
		this.egysegar = egysegar;
		this.gyarto = gyarto;
		this.gyartasIdo = gyartasIdo;
		this.lejaratiIdo = lejaratiIdo;
	}


	public int getEgysegar() {
		return egysegar;
	}


	public void setEgysegar(int egysegar) {
		this.egysegar = egysegar;
	}


	public String getGyarto() {
		return gyarto;
	}


	public void setGyarto(String gyarto) {
		this.gyarto = gyarto;
	}


	public LocalDate getGyartasIdo() {
		return gyartasIdo;
	}


	public void setGyartasIdo(LocalDate gyartasIdo) {
		this.gyartasIdo = gyartasIdo;
	}


	public LocalDate getLejaratiIdo() {
		return lejaratiIdo;
	}


	public void setLejaratiIdo(LocalDate lejaratiIdo) {
		this.lejaratiIdo = lejaratiIdo;
	}


	@Override
	public String toString() {
		return "Tejtermek [egysegar=" + egysegar + ", gyarto=" + gyarto + ", gyartasIdo=" + gyartasIdo
				+ ", lejaratiIdo=" + lejaratiIdo + "]";
	}
	
	
	public boolean IhatoE() {
		
		LocalDate now = LocalDate.now();
		
		if(now.isBefore(lejaratiIdo)) {
			
			return true;
		}
		
		return false;
				
	}
	
	
}
