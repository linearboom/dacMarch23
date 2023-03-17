class Pattern6{
	public static void main(String args[]){
		int counter = 9;
		for (int i = 1 ; i<= 5; i++){
			for(int j = 1; j<i; j++){
				System.out.print(" ");
			}
				
			for(int j = 1; j<=counter;j++){
				System.out.print("*");
			}
			System.out.println("");
			counter-=2;
			
		}
	}
}
