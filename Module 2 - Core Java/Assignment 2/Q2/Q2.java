import java.util.Scanner;

class BMI{
    private float height;
    private float weight;
    
    BMI(float ht, float wt){
        this.height = ht;
        this.weight = wt;
    }

    public float getHeight(){
       return this.height; 
    }

    public float getWeight(){
        return this.weight;
    }

    public double caclulateBMI(){
        return this.weight / (height * height);
    }
}


class Q2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to BMI Calculator");
        System.out.print("Enter your height (metres)");
        float ht = scan.nextFloat();
        System.out.print("Enter your weight (kg)     ");
        float wt = scan.nextFloat();
        BMI bmi = new BMI(ht,wt);
        System.out.print("Your BMI is              " + bmi.caclulateBMI());

        scan.close();
        

    }
}


