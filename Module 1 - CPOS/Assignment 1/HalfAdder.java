import java.util.Scanner;
class HalfAdder{
	public static void  main(String arg[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int a = scan.nextInt();
		System.out.println("Enter Number 2");
		int b = scan.nextInt();
		
		int c;

		
		while (b!=0){
			c = a & b;
			a = a ^ b;
			b = c << 1;
			
		}
		
		System.out.println("Sum is : "+a);
		scan.close();
	}
}