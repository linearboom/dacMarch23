import java.util.Scanner;

class Q8{
    public static void main(String args[]){
        Rational r1 = new Rational();
        Rational r2 = new Rational();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Rational Number");
        System.out.print("Numerator   : ");
        r1.setNum(scan.nextInt());
        System.out.print("Denominator : ");
        r1.setDen(scan.nextInt());
        System.out.println("Enter the second Rational Number");
        System.out.print("Numerator   : ");
        r2.setNum(scan.nextInt());
        System.out.print("Denominator : ");
        r2.setDen(scan.nextInt());

        System.out.println("Enter the arithemetic operator");
        char oper = scan.next().charAt(0);

        Rational r3 = new Rational();
        
        switch (oper){
            case '+' : r3 = add(r1,r2); break;
            case '-' : r3 = subtract(r1,r2); break;
            case '*' : r3 = multiply(r1,r2); break;
            case '/' : r3 = divide(r1,r2); break;
            default :  System.out.println("Invalid Input");
                       System.exit(0); 
                       break;
        }

        System.out.println(r3);
        scan.close();
    }
    public static Rational add(Rational r1, Rational r2){
        Rational r3 = new Rational();
        r3.setDen(r1.getDen()*r2.getDen());
        r3.setNum(r1.getDen()*r2.getNum() + r2.getDen()*r1.getNum());
        r3.reduce();
        return r3;
    }

    public static Rational subtract(Rational r1, Rational r2){
        Rational r3 = new Rational();
        r3.setDen(r1.getDen()*r2.getDen());
        r3.setNum(r1.getDen()*r2.getNum() - r2.getDen()*r1.getNum());
        r3.reduce();
        return r3;
    }

    public static Rational multiply(Rational r1, Rational r2){
        Rational r3 = new Rational();
        r3.setDen(r1.getDen()*r2.getDen());
        r3.setNum(r1.getNum()*r2.getNum());
        r3.reduce();
        return r3;
    }

    public static Rational divide(Rational r1, Rational r2){
        Rational r3 = new Rational();
        r3.setNum(r1.getNum()*r2.getDen());
        r3.setDen(r1.getDen()*r2.getNum());
        r3.reduce();
        return r3;
    }

}