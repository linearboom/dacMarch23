class Q1_28{
    public static void main (String args[]){
        double x = 25.50d;
        double y = 10000000.567d;
        String str = "3000.45";
        double z = 100.25d;

        String a = String.valueOf(x);
        Double b = new Double(y);
        Double c = Double.parseDouble(str);
        String hex = Double.toHexString(z);
        Long l =Double.doubleToLongBits(z); 
        String bin = Long.toBinaryString(l);
        String oct = Long.toOctalString(l);
        //String bin = Double.
        
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
        System.out.println("Hexadecimal "+ hex);
        System.out.println("Binary:     "+bin);
        System.out.println("Octal:      "+oct);
        
        
    }    
}
