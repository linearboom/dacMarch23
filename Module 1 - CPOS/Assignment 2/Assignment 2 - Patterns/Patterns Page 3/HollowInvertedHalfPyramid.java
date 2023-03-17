class HollowInvertedHalfPyramid{
	public static void main(String args[]){
		int num = 6;
		for(int i = num; i >=1; i--){
			
			for(int j = 1; j<=i;j++){
				if(j!=1 && j!=i && i!=num){
					System.out.print("  ");
					continue;
				}
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}