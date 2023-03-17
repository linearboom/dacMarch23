import java.util.Scanner;
class Pallindrome{
	public static void main(String args[]){
	Scanner scan =  new Scanner(System.in);
	System.out.println("Enter the number");
	int num =  scan.nextInt();
	int m = num;
	int revNum= 0 ;
	while (num >=1){
		revNum = revNum*10 + (num%10);
		num= num/10;
	}
	String decision = (m == revNum) ? "Number is Pallindrome" : " Number is not Pallindrome";
	System.out.println(decision);
	scan.close();
	}
}