import java.util.Scanner;

class Q1_31{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        // Will throw a number format exception if the String cannot be converted to int .
        int i = Integer.parseInt(str);


        System.out.println("This was sucessful and the value if integer is now: "+i);
        scan.close();
       
    }
}