import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    public Book(String title, String author, String publisher, String isbn, int year,
                double price, int quantity){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void increaseQuantity(int quantity){
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity){
        if (this.quantity >= quantity){
        this.quantity -= quantity;
        }else{
            System.out.println("Quantity entered is more than what is in the inventory");
        }
    }

    public double getInventoryValue(){
        return this.price * this.quantity;
    }

}

class Q3{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("====Welcome to Book Inventory Store====");

        // Creating a new book of Book Class
        Book b1 = new Book("Harry Potter 1","JK Rowling","Penguin","345R11",2004,851.45d,10);

        System.out.println("The quantity of the Book " + b1.getTitle() + " is "+ b1.getQuantity());
        System.out.print("Do you want to increase the quantity? Input zero if no ");
        int qIncrease = scan.nextInt();
        b1.increaseQuantity(qIncrease);
        System.out.println("The quantity of the Book " + b1.getTitle() + " is "+ b1.getQuantity());
        System.out.print("Do you want to decrease the quantity? Input zero if no ");
        int qDecrease = scan.nextInt();
        b1.decreaseQuantity(qDecrease);
        System.out.println("The quantity of the Book " + b1.getTitle() + " is "+ b1.getQuantity());


        
        scan.close();
    }
}