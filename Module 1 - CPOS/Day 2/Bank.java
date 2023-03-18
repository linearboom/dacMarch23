class Bank{
	String name;
	String branch;
	String ifsc;
	int accounts;
	int employee;
	double balance;
	
	
	
	public Bank(String name, String branch, String ifsc, int accounts, int employee, double balance){
		this.name= name;
		this.branch = branch;
		this.ifsc = ifsc;
		this.accounts =  accounts;
		this.employee = employee;
		this.balance = balance;
	}
	
	public void getInfo(){
		System.out.println("The name of the bank: "+name);
		System.out.println("The name of the branch: "+branch);
		System.out.println("IFSC Code  : "+ifsc);
		System.out.println("Number of accounts  : "+accounts);
		System.out.println("Number of Employees  : "+employee);
		System.out.println("Total amount in the branch  : "+balance);
	}
	
	public void createAccount(int num){
		this.accounts+=num;
		System.out.println("Account Created");
	}
	
	
	public static void main(String args[]){
		Bank b1 = new Bank("HDFC","Mumbai","IS22",23000,56,500_00_000);
		Bank b2 = new Bank("ICICI","Delhi","IS24",2500,20,1_00_000);
		System.out.println("Day 1 Info");
		b1.getInfo();
		b2.getInfo();
		b1.createAccount(40);
		System.out.println("Day 2 Info");
		b1.getInfo();
		b2.getInfo();
	}
}