class ZeroOnes{
	public static void main(String args[]){
		// Program to generate Pattern using only two for Loops
		int n = 6;
		for (int i =1; i<=n; i++){
			for(int j = 1; j<=i;j++){
				if(j%2==0){
					System.out.print(0);
				}else{
					System.out.print(1);
				}
			}
			System.out.println("");
		}
	}
}
			