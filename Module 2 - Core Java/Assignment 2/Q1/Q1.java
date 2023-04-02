
import java.util.Scanner;

class DateAndTime{
    //Date Fields
    String day;
    String month;
    String year;
    //Time Fields
    String hour;
    String hour12;
    String min;
    String sec;
    String am_pm;

    public void accept(String day,String month, String year, String hour, String min, String sec){
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
        this.sec =sec;
        this.am_pm =  (Integer.parseInt(this.hour) >= 12) ? "PM" : "AM";
        this.hour12 = String.valueOf(Integer.parseInt(this.hour) - 12);
    }

    public String dateFormat1(){
        return day+"/"+month+"/"+year;
    }
    public String dateFormat2(){
        return month+"/"+day+"/"+year;
    }
    public String dateFormat3(){
        return year+"/"+month+"/"+day;
    }

    public String timeFormat1(){
        return hour+":"+min+":"+sec;
    }
    public String timeFormat2(){
        
        return hour+":"+min+":"+sec +" "+am_pm;
    }
    public String timeFormat3(){
        return hour+":"+min;
    }

    public String dateTimeFormat1(){
        return dateFormat1()+" "+timeFormat1();
    }

    public String dateTimeFormat2(){
        return dateFormat2()+" "+timeFormat2();
    }

    public String dateTimeFormat3(){
        return dateFormat3()+" "+timeFormat3();
    }

}

class Q1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //withouth using Date Formatters
        System.out.println("-------Welcome to Date Formatter-----------");
        System.out.print("Enter the day of the month in dd format      ");
        String day = scan.nextLine();
        System.out.print("Enter the the month in mm format             ");
        String month = scan.nextLine();
        System.out.print("Enter the the year in yy format              ");
        String year = scan.nextLine();
        System.out.print("Enter the current time hour in 24 hour format");
        String hour = scan.nextLine();
        System.out.print("Enter the curent time minute                 ");
        String minute = scan.nextLine();
        System.out.print("Enter the time seconds                       ");
        String second = scan.nextLine();

        DateAndTime date = new DateAndTime();
        date.accept(day, month, year, hour, minute, second);

        System.out.println("The date in the format dd/mm/yyyy is "+date.dateFormat1());
        System.out.println("The date in the format mm/dd/yyyy is "+date.dateFormat2());
        System.out.println("The date in the format yyyy/mm/dd is "+date.dateFormat3());

        System.out.println("The time in the format hh:mm:ss   is "+date.timeFormat1());
        System.out.println("The time in the format hh:mm:ss a is "+date.timeFormat2());
        System.out.println("The time in the format hh:mm      is "+date.timeFormat3());

        System.out.println("The date in the format dd/mm/yyyy is "+date.dateTimeFormat1());
        System.out.println("The date in the format dd/mm/yyyy is "+date.dateTimeFormat2());
        System.out.println("The date in the format dd/mm/yyyy is "+date.dateTimeFormat3());


        scan.close();
    }
}