import java.util.Scanner;
import java.lang.Math;

class ReverseNumber{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		int revNum = 0;
		int counter = 0;
		int m = number;
		int a,b;
		while (number>=1){
			number = number /10;
			counter+=1;
		}
		
		while(counter>=1){
			a = m%10;
			b = (int) Math.pow(10, counter-1);
			a= a*b;
			revNum = revNum + a;
			counter--;
			m=m/10;
		}
		System.out.println(revNum);
		scan.close();
	}
}

			
			
			