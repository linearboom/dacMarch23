import java.util.Scanner;

class GCD{
	
	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1 = scan.nextInt();
		System.out.println("Enter Number 2");
		int num2 = scan.nextInt();
		
		int greater;
		
		if (num1>num2){
			greater = num1;
		}else{
			greater=  num2;
		}
		
		int GCD=0;
		
		for (int i = 1; i<=greater;i++){
			if (num1%i == 0 && num2 % i ==0){
				GCD = i;
			}
		}
		System.out.println("GCD is : "+GCD);
		scan.close();
	}
}