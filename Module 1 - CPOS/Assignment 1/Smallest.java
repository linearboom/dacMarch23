import java.util.Scanner;

class Smallest{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  number 1");
		int num1 = scan.nextInt();
		System.out.println("Enter  number 2");
		int num2 = scan.nextInt();
		System.out.println("Enter  number 3");
		int num3 = scan.nextInt();
		
		int smallest;
		
		if (num1 < num2 && num1 < num3){
			smallest = num1;
		} else{
			if (num2< num3){
				smallest = num2;
			}else{
				smallest = num3;
			}
		}
		
		System.out.println("Smallest Number is: " + smallest);
		scan.close();
	}
}

		
		