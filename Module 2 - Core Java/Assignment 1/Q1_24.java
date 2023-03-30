class Q1_24 {
    public static void main (String args[]){
        float x = 25.5f;
        float y = 35.5f;
        String str = "3000.4";
        float z = 100.25f;

        String a = String.valueOf(x);
        Float b = new Float(y);
        Float c = Float.parseFloat(str);
        String hex = Float.toHexString(z);
        
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
        System.out.println("Hexadecimal "+ hex);
        
    }    
}