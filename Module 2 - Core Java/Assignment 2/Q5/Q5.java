import java.util.Scanner;

class Q5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Phone bill calculator");
        System.out.println("Enter the customer name");
        String name = scan.nextLine();
        System.out.println("Enter the phone number");
        long phone = scan.nextLong();
        System.out.println("Enter the number of calls made");
        int number = scan.nextInt();
        System.out.println("Enter the duration of the call");
        int duration = scan.nextInt();
        

        TelephoneBill bill = new TelephoneBill(name,phone,number,duration);
        System.out.println("The bill amount is : "+bill.billAmount);

        scan.close();
    }
}