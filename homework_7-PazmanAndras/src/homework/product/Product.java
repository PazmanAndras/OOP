package homework.product;

public class Product {
	
	 private String name;
	 private int price;
	 
	 //Constructors
	 public Product(String name, int price) {
		 this.name = name;
		 
		 if(price >= 0)
		 {
			 this.price = price;
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
	
	

}
