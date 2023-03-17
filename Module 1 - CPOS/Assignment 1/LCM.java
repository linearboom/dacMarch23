import java.util.Scanner;

class LCM{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 =  scan.nextInt();
		System.out.println("Enter Number 2");
		int num2 = scan.nextInt();
		
		int largest = num1 > num2 ? num1:num2;
		int i = largest;
		
		
		
		while (true){
			if (i%num1 == 0  && i%num2 == 0){
				
				System.out.println(i);
				break;
			}
	
			i++;
		}
		scan.close();
		
	}
}
		