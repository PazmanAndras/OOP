package homework.shop;

import homework.tax.Taxable;

public class Employee implements Taxable{
	
	private String name;
	private int salary;
	private int szja = 15;
	
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getSzja() {
		return szja;
	}


	public void setSzja(int szja) {
		this.szja = szja;
	}


	@Override
	public void setTax(double tax) {
		tax = 15;	
	}


	@Override
	public double getTax() {
		
		return this.salary * 0.15;
	}


	@Override
	public double getTaxedValue() {
		
		return this.salary - getTax();
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", szja=" + szja + "]";
	}
	
	
	
	
	
	
}
