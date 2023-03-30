class Q1_9 {
    public static void main (String args[]){
        byte b = 4;
        Byte b1 = new Byte(b);

        short s = (short) b1;
        int i = (int) b1;
        long l = (long) b1;
        double d = (double) b1;
        float f = (float) b1;

        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("long: "+ l);
        System.out.println("double: "+d);
        System.out.println("float: "+f);
    }    
}
