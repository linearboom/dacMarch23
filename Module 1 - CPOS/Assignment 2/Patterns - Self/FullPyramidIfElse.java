class FullPyramidIfElse{
	public static void main(String args[]){
		// Program to generate Pattern using only two for Loops
		int n = 6;
		int left_pad;
		for (int i =1; i<=n; i++){
			for(int j = 1; j<=n;j++){
				if (j<=n-i){
				System.out.print(" ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}
			