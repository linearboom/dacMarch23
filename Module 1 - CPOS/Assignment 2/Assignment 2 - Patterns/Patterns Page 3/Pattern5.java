class Pattern5{
public static void main(String args[]){
	int num = 9;
	for(int i =1 ; i<=num; i++){
		for(int j =1; j<=num-i;j++){
			System.out.print("  ");
		}
		for(int j = num+1-i; j<=num;j++){
			System.out.print(j+" ");
		}
		for(int j =num-1; j>=num-i+1;j--){
			System.out.print(j+" ");
		}
		System.out.println("");
	}
	}
} 	