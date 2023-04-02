class TelephoneBill {
    String customer;
    long phone;
    int numberOfCalls;
    int duration;
    double billAmount;
  

    private final float BASE_RATE = 0.50f;
    private final float B_100_RATE = 0.25f;
    private final int FIXED_RATE = 10;
    private final int CALL_1 =100; // Number of calls upto which rate is 50 cents.


    TelephoneBill(String customer,long phone,int numberOfCalls,int duration){
        this.customer = customer;
        this.phone = phone;
        this.numberOfCalls =numberOfCalls;
        this.duration = duration;
        this.bill();
        
    }

    public void bill(){
    
        if(this.numberOfCalls <= this.CALL_1){
            this.billAmount = this.numberOfCalls * BASE_RATE; 
        }else{
            this.billAmount = (this.CALL_1 * BASE_RATE) + (this.numberOfCalls - this.CALL_1)* this.B_100_RATE;
        }
        
        this.billAmount += this.FIXED_RATE;
    
    }

}
