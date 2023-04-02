import java.util.Scanner;

class TollBooth {
    //private double distance;
    private double tollFee;
    private final double C_BASE_RATE = 0.25;
    private final double T_BASE_RATE = 0.50;
    private final double PROCESSING_FEE = 2;
    private final String[] ACC_VEHICLES =  new String[]{"Car","Van","Bus","Truck"}; 
    private Vehicle vehicle = new Vehicle();

    public double getTollFee(){
        return this.tollFee;
    }

    private boolean checkType(){
        for(String type : ACC_VEHICLES){
            if (vehicle.getType().equals(type))
            return true;
        }
        return false;
    }

    public void calculateTollFee(){
        if (!checkType())
             throw new IllegalArgumentException("Vehicle type invalid");
        if (vehicle.getType().equals("Trucks")){
            this.tollFee = (vehicle.getDistance() * vehicle.getNumberOfaxles() * T_BASE_RATE) + PROCESSING_FEE; 
        } else{
            this.tollFee = (vehicle.getDistance() * vehicle.getNumberOfaxles() * C_BASE_RATE) + PROCESSING_FEE;
        }
        System.out.println("The toll fee is "+ getTollFee()); // Kind of redundant to use getTollFee
        vehicle.setTotalAmountDue(vehicle.getTotalAmountDue() + this.tollFee); // Sets the total amount due for the vehicle
    }

    public void generateBill(){
        System.out.println("The total amount pending for the "+this.vehicle.getType() +":");
        System.out.println(this.vehicle.getTotalAmountDue());
    }

    public void showMenu(){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while(choice != 6){
            System.out.println("1. Enter the vehicle type");
            System.out.println("2. Enter the number of axles");
            System.out.println("3. Enter the distance travelled");
            System.out.println("4. Calculate toll fee");
            System.out.println("5. Generate Bill");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1 : this.vehicle.setType(scan.nextLine()); break;
                case 2 : this.vehicle.setNumberOfaxles(scan.nextInt()); break;
                case 3 : this.vehicle.setDistance(scan.nextInt()); break;
                case 4 : this.calculateTollFee(); break;
                case 5 : this.generateBill(); break;
                default: System.out.println("Enter valid input");

            }
        }

    scan.close();
    }
}
