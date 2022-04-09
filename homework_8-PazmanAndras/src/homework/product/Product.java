package homework.product;

import homework.tax.Taxable;

public class Product implements Taxable {
	
	 private String name;
	 private int price;
	 private int taxPercent;
	 private String currency = "Ft";
	 
	 
	 
	 
	 //Constructors
	 
	 public Product(String name, int price) {
		 this.name = name;
		 
		 if(price < 0)
		 {
			 this.price = 0;
		 }else 
		 {
			 this.price = price;
		 }
		 
		 
	 }
	 
	 public Product(String name, int price, int  taxPercent) {
		 this.name = name;
		 
		 if(price < 0)
		 {
			 this.price = 0;
		 }else 
		 {
			 this.price = price;
		 }
		 
		 if(taxPercent > 0) {
			 this.taxPercent = taxPercent;
		 }
		 
	 }
	 
	 
	 
	 //getter&setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		if (price >= 0)
			this.price = price;
		
		
	}
	
	

	
	//Methods
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
	public void decreasePrice(int percent) {
			
		this.price = (int)Math.round((price - (price*((double)percent/100.0)))); 
		 
	}
	
	
	public void increasePrice(int percentage) {
		if (percentage > 0) {
			price += Math.round(price*(float)percentage/100);
		}	
	}

	//-----------------------------------------------------------------------//
	/*8.(heti) homework*/
	
	@Override
	public void setTax(double tax) {
		if(tax > 0) {
			this.taxPercent = (int) tax;
		}else{
			taxPercent = 27;
		}
		
	}


	@Override
	public double getTax() {
		
		return price*taxPercent/100.0;
	}


	public double getTaxedValue() {
	
		return price + getTax();
	}
	


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		
		if(this.currency.equalsIgnoreCase("Ft") && currency.equalsIgnoreCase("Euro")) {
			this.currency = "Euro";
			price = Math.round(price / 300.f);
		}else if (this.currency.equalsIgnoreCase("Euro") && !currency.equalsIgnoreCase("Euro")) {
			this.currency = "Ft";
			price *=300;
		}
		
		
	}
	
	
	public static void changeCurrency(Product[] products, String targetCurrency) {
	
		for (int i = 0; i < products.length; i++) {
			products[i].setCurrency(targetCurrency);
		}
	}
	
	
	
	
	public static int comparePrice(Product p1, Product p2) {		
		
		if(p1.price > p2.price) {
			return  1;
		}else if (p1.price < p2.price){
			return  2;
		}else {
			return  0;
		}
	
	}
	
	//public abstract int getUnitPrice();
	
	
	

}
