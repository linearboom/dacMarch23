class Q1_11 {
    public static void main(String args[]){
        char c = args[0].charAt(0);

    
        if (Character.isDigit(c)){
            System.out.println(c);
            
            System.out.println(Character.codePointAt(args[0],0));
        }else{
            if( Character.isLowerCase(c)){
                System.out.println(Character.toUpperCase(c));
                System.out.println(Character.codePointAt(args[0],0));
            } else{
                System.out.println(Character.toLowerCase(c));
                System.out.println(Character.codePointAt(args[0],0));
            }
        }
    }    
}
