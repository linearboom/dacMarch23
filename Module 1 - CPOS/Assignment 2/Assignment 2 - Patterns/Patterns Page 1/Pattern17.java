class Pattern17{
	public static void main(String args[]){
		int counter =1;
		for(int i = 5; i>=1; i--){
			for(int j = 5;j>=i;j--){
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println("");
			
		}
	}
}
