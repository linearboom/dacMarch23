class NumSwap{
	
	public static void main(String args[]){
	
	int num1 = 20;
	int num2 = 30;
	
	System.out.println("num1: " + num1);
	System.out.println("num2: " + num2);  
	
	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
	
	System.out.println("Swapping Numbers");
	System.out.println("Num1: " + num1);
	System.out.println("Num2: " + num2);
	
	
	
	}
}


