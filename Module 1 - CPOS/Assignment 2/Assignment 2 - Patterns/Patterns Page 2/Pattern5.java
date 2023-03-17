class Pattern5{
	public static void main(String args[]){
		int counter = 1;
		for (int i = 1 ; i<= 5; i++){
			for(int j = 1; j<=5-i; j++){
				System.out.print(" ");
			}
				
			for(int j = 1; j<=counter;j++){
				System.out.print("*");
			}
			System.out.println("");
			counter+=2;
			
		}
	}
}
