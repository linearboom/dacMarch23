class Pattern7{
	public static void main(String args[]){
		int num = 9;
		for(int i = num; i >=1; i--){
			for (int j =i; j<num;j++){
				System.out.print(" ");
			}
			for(int j = 1; j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}