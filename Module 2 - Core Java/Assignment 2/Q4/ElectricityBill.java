class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String name , double units){
        this.customerName = name;
        this.unitsConsumed = units;
        calculateBillAmount();
    }

    public void calculateBillAmount(){
        if (unitsConsumed<=100){
            billAmount = unitsConsumed * 5;
        } else if(unitsConsumed<=300){
            billAmount = (500) + (unitsConsumed-100)*7;
        } else{
            billAmount = (500) + (1400)+ (unitsConsumed-300)*10 ;
        }
    }

    public void display(){
        System.out.println("The customer name is            : "+customerName);
        System.out.println("The number of units consumed are: "+unitsConsumed);
        System.out.println("The total bill amount is        : "+billAmount);
    }

    
}
