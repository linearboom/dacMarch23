class Q1_29 {
    public static void main (String args[]){
        Double x = new Double(35.50d);

        
        byte b = x.byteValue();  // Loss of data
        short s = x.shortValue(); // Loss of data
        int i = x.intValue(); // Loss of data
        float f = x.floatValue();
        long l = x.longValue();

       

        System.out.println("byte: "+ b);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("float: "+f);
        System.out.println("long: "+l);
    }
}    
