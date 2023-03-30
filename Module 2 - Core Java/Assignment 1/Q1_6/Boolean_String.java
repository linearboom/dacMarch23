class Boolean_String{
    public static void main(String[] args){
        boolean x = true;
        boolean y =false;
        String s ="true";
        String t ="false";

        String s1 = String.valueOf(x); // Will retrun the string value
        Boolean x1 = new Boolean(y); // New Instance of type Boolean
        boolean x2 = Boolean.parseBoolean(s);
        Boolean x3 = Boolean.parseBoolean(t);

        System.out.println("This is string s1 covnerted from Boolean value "+s1);
        System.out.println("This is Boolean x2, a new Boolean value "+x1);
        System.out.println("This is string s covnerted to boolean value "+x2);
        System.out.println("This `is string t covnerted to Boolean value "+x3);
        

    }
}