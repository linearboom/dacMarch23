import java.util.Scanner;

class Q6{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of your Bank");
        String name = scan.nextLine();
        System.out.println("Please enter the maximum number of accounts");
        int num = scan.nextInt();
        //scan.close();
        Bank bank = new Bank(name, num);
        runApplication(bank);
        

    }

    public static  void runApplication(Bank bank){
        
        bank.basicDetails();
        int choice = 0;
        while (choice!=10){
            System.out.println("Please chose one of the following options:          ");
            System.out.println("Chose one if you want to create an account          ");
            System.out.println("Chose two if you want to deposit money in an account");
            System.out.println("Chose three if you want to withdraw money from the account");
            System.out.println("Chose four if you want to view your account balance");
            System.out.println("Chose five if you want to see your account information");
            System.out.println("Chose 10 to quit");
            choice = sc.nextInt();
            sc.nextLine(); //Scan Line Trap
            switch (choice){
                case 1: createAccount(bank); break;
                case 2: deposit(bank); break;
                case 3: withdraw(bank); break;
                case 4: accBalance(bank);  break;
                case 5: accInfo(bank); break ;
                case 876: bank.listDetails(); break;
                case 890: bank.basicDetails(); break;
                case 10: System.out.println("Byee!"); break;
                default: System.out.println("Enter valid option");
            }
            System.out.println("");
        }
    }

    public static void createAccount(Bank bank){
        System.out.println("Enter your name");
        String name = sc.nextLine();
        bank.createAccount(name);
    }

    public static void deposit(Bank bank){
        System.out.println("Enter the amount to deposit");
        double amount = sc.nextDouble();
        System.out.println("Enter your account number");
        int acc = sc.nextInt();
        bank.deposit(acc,amount);
    }

    public static void withdraw(Bank bank){
        System.out.println("Enter the amount to withdraw");
        double amount = sc.nextDouble();
        System.out.println("Enter your account number");
        int acc = sc.nextInt();
        bank.withdraw(acc,amount);
    }

    public static void accBalance(Bank bank){
        System.out.println("Enter your account number");
        int acc = sc.nextInt();
        bank.displayBalance(acc);
    }

    public static void accInfo(Bank bank){
        System.out.println("Enter your account number");
        int acc = sc.nextInt();
        bank.accountDetail(acc);
    }
   
}