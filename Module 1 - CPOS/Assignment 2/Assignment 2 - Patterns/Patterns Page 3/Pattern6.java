class Pattern6{
	public static void main(String args[]){
		int num = 9;
		for (int i = 1 ; i<= num; i++){
			for(int j = 1; j<i; j++){
				System.out.print(" ");
			}
				
			for(int j = num; j>=i;j--){
				System.out.print("* ");
			}
			System.out.println("");
			
		}
	}
}
