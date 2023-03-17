class Z{
	public static void main(String args[]){
		// Program to generate Pattern using only two for Loops
		//To print the letter Z
		int n = 7;
		for (int i =1; i<=n; i++){
			for(int j = 1; j<=n;j++){
				if(i==1 || i== n|| j+i==n+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
			