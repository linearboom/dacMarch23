class Q1_16 {
    public static void main (String args[]){
        int x = 1000;
        int y = 2000;
        String str = "3000";
        int z = 10;

        String a = String.valueOf(x);
        Integer b = new Integer(y);
        Integer c = Integer.parseInt(str);
        String hex = Integer.toHexString(z);
        String oct = Integer.toOctalString(z);
        String bin = Integer.toBinaryString(z);


        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
        System.out.println("Hexadecimal "+ hex);
        System.out.println("Octal       "+ oct);
        System.out.println("Binary      "+ bin);
    }    
}
