class Q1_13{
    public static void main(String args[]){

        short s = 100;
        short r = 200;
        String str = "300";


        String str_short = String.valueOf(s);
        Short Short_r = new Short(r);
        Short Short_str = Short.parseShort(str);

        System.out.println("a: "+str_short);
        System.out.println("b: "+Short_r);
        System.out.println("c: "+Short_str);
    }
}