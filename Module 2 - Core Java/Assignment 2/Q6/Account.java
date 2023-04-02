class Account {
    private String name;
    private int accNumber;
    private double balance;


    public Account(String name,int  accNumber){
        this.name = name;
        this.accNumber = accNumber;
        this.balance = 0; //Initial balance is set to zero
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNumber() {
        return this.accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void getDetails(){
        System.out.println("The Account holder name is: "+this.name);
        System.out.println("The Account number is     : "+this.accNumber);
        System.out.println("The Account balance is    : "+this.balance);
    }
    
}
