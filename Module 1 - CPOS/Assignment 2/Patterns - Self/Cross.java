class Cross{
	public static void main(String args[]){
		// Program to generate Pattern using only two for Loops
		//To generate a pattern using Cross
		int n = 7;
		for (int i =1; i<=n; i++){
			for(int j = 1; j<=n;j++){
				if(j==i || i+j==n+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
			