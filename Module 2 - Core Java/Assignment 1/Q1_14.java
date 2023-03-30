class Q1_14 {
    public static void main (String args[]){
        short s= 100;
        Short b1 = new Short(s);

        String str = String.valueOf(b1); // Cannot directly convert short to byte
        byte b = Byte.parseByte(str);
        int i = (int) b1;
        long l = (long) b1;
        double d = (double) b1;
        float f = (float) b1;

        // Anothr method is 
        byte b2 = b1.byteValue(); // Can work on all data types

        System.out.println("byte: "+ b);
        System.out.println("int: "+ i);
        System.out.println("long: "+ l);
        System.out.println("double: "+d);
        System.out.println("float: "+f);
    }    
}