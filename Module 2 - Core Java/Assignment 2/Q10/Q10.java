import java.util.Scanner;

class Q10{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();
        System.out.println("Enter credit history");
        int creditHistory = scan.nextInt();
        System.out.println("Enter credit utilization");
        int creditUtilization = scan.nextInt();
        System.out.println("Enter credit history");
        boolean paymnetHistory = scan.nextBoolean();
        CreditHistory cred = new CreditHistory(name, creditHistory, creditUtilization, paymnetHistory);

        System.out.println(cred.calculateCreditScore());
    }
}