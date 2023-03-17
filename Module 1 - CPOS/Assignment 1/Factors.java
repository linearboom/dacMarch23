import java.util.Scanner;

class Factors{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scan.nextInt();
		for (int i = 1; i<=number;i++){
			if (number % i == 0){
				System.out.println(i);
			}
		}
		scan.close();
	}
}
