class Q1_20 {
    public static void main (String args[]){
        long x = 10_00_00_000L;
        long y = 20_00_00_000L;
        String str = "3000";
        long z = 100L;

        String a = String.valueOf(x);
        Long b = new Long(y);
        Long c = Long.parseLong(str);
        String hex = Long.toHexString(z);
        String oct = Long.toOctalString(z);
        String bin = Long.toBinaryString(z);


        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
        System.out.println("Hexadecimal "+ hex);
        System.out.println("Octal       "+ oct);
        System.out.println("Binary      "+ bin);
    }    
}