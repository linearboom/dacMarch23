class Q1_33{
    public static void main(String args[]){
        double x = Double.parseDouble(args[0]);
        String operator = args[1];
        double y = Double.parseDouble(args[2]);
        double ans = 0.0d; // Initialised value to not get an error
        boolean b = false;
        
        switch (operator){
            case "+": ans = Double.sum(x, y); break;
            case "-": ans = x -y ; break;
            case "*": ans = x * y; break;
            case "/": ans = x/y  ; break;
            default : b = true;
            
        }
        if (b){
            System.out.println("Invalid inoperator in the command line");
        }else{
        System.out.println("The answer is "+ans);
        }
    }
}