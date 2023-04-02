class Bank {
    public Account accounts[];
    String name;
    private int numberOfAccounts;
    private int uniqueNumber = 0 ; // 
    
    public Bank(String name, int max_cap){
        this.name = name;
        this.numberOfAccounts = 0;
        this.accounts = new Account[max_cap];
    }

    public void createAccount(String name){
        this.accounts[this.uniqueNumber] = new Account(name, this.uniqueNumber);
        System.out.println("Account Created Sucessfully");
        this.accounts[this.uniqueNumber].getDetails();
        this.uniqueNumber++;     
        this.numberOfAccounts++;
    }

    public boolean deposit(int uniqueNumber, double amount){
        for(int i = 0; i<this.numberOfAccounts;i++){
            Account account = this.accounts[i];
            if (account.getAccNumber() == uniqueNumber){
                account.setBalance(account.getBalance()+amount);
                System.out.println("Deposit operation conducted succesfully!");
                System.out.println("Current Balance: "+account.getBalance());
                return true;
            }     
        }
        System.out.println("Account number not found");
        return false;
    }

    public boolean withdraw(int uniqueNumber, double amount){
        for(int i = 0; i<numberOfAccounts; i++){
            Account account = this.accounts[i];
            if (account.getAccNumber() == uniqueNumber){
                if (account.getBalance()>=amount){
                    account.setBalance(account.getBalance()-amount);
                    System.out.println("Withdrawal operation conducted succesfully!");
                    System.out.println("Current Balance: "+account.getBalance());
                    return true;
                }else{
                    System.out.println("Insufficient Balance");
                    return false;
                }
            }     
        }
        System.out.println("Account number not found");
        return false;
    }

    public boolean displayBalance(int uniqueNumber){
        for(int i = 0; i<numberOfAccounts; i++){
            Account account = this.accounts[i];
            if (account.getAccNumber() == uniqueNumber){
                System.out.println("The Balance for the "+account.getAccNumber()+" is "+account.getBalance());
                return true;
            }
        }
        System.out.println("Account Number not found");
        return false;
    }

    public boolean accountDetail(int uniqueNumber){
        for(int i = 0; i<numberOfAccounts; i++){
            Account account = this.accounts[i];
            if (account.getAccNumber() == uniqueNumber){
                account.getDetails();
                return true;
            }
        }
        System.out.println("Account Number not found");
        return false;
    }

    public void basicDetails(){
        System.out.println("The name of the bank is    : "+this.name);
        System.out.println("The number of Accounts are : "+this.numberOfAccounts);
    }

    public void listDetails(){
        System.out.println("The details of all the accounts in "+this.name+ " bank are:");
        for (int i = 0; i<this.numberOfAccounts; i++){
            accounts[i].getDetails();
            System.out.println("==============================");
        }
        System.out.println("There are total: "+this.numberOfAccounts+" number of Accounts");
    }

    
}
