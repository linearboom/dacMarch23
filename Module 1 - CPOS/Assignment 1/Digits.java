import  java.util.Scanner;
import java.lang.Math;

class Digits{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int num = scan.nextInt();
		int m = num;
		int counter = 0;
		
		while(num>=1){
			//System.out.println(num%10);
			num = num/10;
			counter+=1;
		}
		
		while(counter>1){
			int a = (int)Math.pow(10,counter-1);
			int n = m/a;
			m = m - n*a;
			System.out.println(n);
			counter--;

		}
		System.out.println(m);
		
		scan.close();
	}
}
		