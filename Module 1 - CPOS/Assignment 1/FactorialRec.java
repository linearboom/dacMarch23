import java.util.Scanner;

class FactorialRec{
	
	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = scan.nextInt();
	System.out.println(fact(num));
	
	}
	
	public static int fact(int n){
		if (n==1){
			return 1;
	} else {
		return n*fact(n-1);
	}
	
}

}