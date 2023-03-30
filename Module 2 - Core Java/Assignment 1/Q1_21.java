class Q1_21 {
    public static void main (String args[]){
        Long x = new Long(100_00_000L);

        
        byte b = x.byteValue();  // Loss of data
        short s = x.shortValue(); // Loss of data
        int i = x.intValue(); // Loss of data
        double d = x.doubleValue();
        float f = x.floatValue();

       

        System.out.println("byte: "+ b);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("double: "+d);
        System.out.println("float: "+f);
    }
}    
