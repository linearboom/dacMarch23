import java.util.Scanner;


class Q4{
    public static void main(String args[]){
        System.out.println("Welcome to Electricity bill Calculator");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Customer Name ");
        String cust = scan.nextLine();
        System.out.println("Enter the number of units consumed by the customer");
        int units = scan.nextInt();
        ElectricityBill bill = new ElectricityBill(cust, units);
        bill.display();

        scan.close();

    }
}