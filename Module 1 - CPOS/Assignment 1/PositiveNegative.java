import java.util.Scanner;
class PositiveNegative{
	
	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the number: ");
	
	float number = scan.nextFloat();
	if (number<0){
		System.out.println("Number is Negative"); 
	} else if (number > 0){
		System.out.println("Number is Positive");
	} else {
		System.out.println("Number is Zero");
	}
	
}

}