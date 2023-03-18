class Radio{
	String brand;
	String model;
	float price;
	
	public Radio(String brand, String model, float price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void getInfo(){
		System.out.println("The name of the brand: "+brand);
		System.out.println("The name of the model: "+model);
		System.out.println("The price in Rupees  : "+price);
	}
	
	public static void main(String args[]){
		Radio r1 = new Radio("Sony","Marshal",4599.00f);
		Radio r2 = new Radio("Samsung","Galaxy",3000.00f);
		r1.getInfo();
		r2.getInfo();
	}
}