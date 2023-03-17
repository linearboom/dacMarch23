import java.util.Scanner;
import java.util.ArrayList;

class PrimeFactors{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> num1fact = new ArrayList<>();
		System.out.println("Enter the number");
		int num1 =  scan.nextInt();
		System.out.println("The Prime Factors are: ");
		
		for (int i =2; i<num1 ; i++){
			if ((num1 % i == 0) && (prime(i))){
				System.out.println(i);
			}
		}
	}
	
	
	
	public static boolean prime(int n){
		for (int i = 2; i<n; i++){
			if (n%i == 0){
			return false;
			}
		}
		return true;
	}
	
}