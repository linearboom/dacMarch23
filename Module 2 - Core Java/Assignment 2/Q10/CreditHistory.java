class CreditHistory {
    private String name;
    private int creditHistory;
    private int creditUtilization;
    private boolean paymnetHistory;


    CreditHistory(String name, int creditHistory, int creditUtilization, boolean paymnetHistory){
        this.name = name;
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymnetHistory = paymnetHistory;
    }

    public int calculateCreditScore(){
        if (paymnetHistory)
            return (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
        else
            return (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
        }
        

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditHistory() {
        return this.creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    public int getCreditUtilization() {
        return this.creditUtilization;
    }

    public void setCreditUtilization(int creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public boolean isPaymnetHistory() {
        return this.paymnetHistory;
    }

    public boolean getPaymnetHistory() {
        return this.paymnetHistory;
    }

    public void setPaymnetHistory(boolean paymnetHistory) {
        this.paymnetHistory = paymnetHistory;
    }
    
}
