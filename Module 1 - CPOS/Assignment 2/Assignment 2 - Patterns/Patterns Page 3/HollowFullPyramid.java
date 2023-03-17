class HollowFullPyramid{
	public static void main(String args[]){
		int num = 6;
		for(int i = 1; i <=num; i++){
			for (int j =1; j<=num-i;j++){
				System.out.print(" ");
			}
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