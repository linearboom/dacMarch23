import java.util.Scanner;

class Q9{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    CustomDate cd = new CustomDate();
    System.out.println("Enter the day of the month");
    cd.setDay(scan.nextInt());
    System.out.println("Enter the month of the year");
    cd.setMonth(scan.nextInt());
    System.out.println("Enter the  year");
    cd.setYear(scan.nextInt());

    String s = cd.isValid() ? "Accepted" : "Rejected";
    System.out.println(s);
    if (!cd.isValid()){
        System.out.println("Invalid Date");
        System.exit(0);
    }
    System.out.println(cd.getDayOfWeek());
    System.out.println(cd.getNextDay());
    System.out.println(cd.getPreviousDay());
    System.out.println(cd.isLeapYear());


    scan.close();
    }
}