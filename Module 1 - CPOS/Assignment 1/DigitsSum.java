import java.util.Scanner;

class DigitsSum{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int sum = 0;
		while (num>=1){
			int a = num%10;
			sum+=a;
			num = num/10;
		}
		
		System.out.println(sum);
		scan.close();
	}
}
		