
package university.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cdac.students.Student;
import com.cdac.util.University;

public class UniversityTest {
	private Scanner sc = new Scanner(System.in);
	University uni = new University();
	
	
	public void start() {
		int choice;
		while (true) {
			try {
				 choice = menu();
				 if (choice == 0)
					 break;
					switch (choice) {
						case 1:
							uni.viewAll();
							break;
						case 2:
							System.out.println("Not yet implemented");
							break;
						case 3:
							System.out.println("Not yet implemented");
							break;
						case 4:
							System.out.println("Not yet implemented");
							break;
						default:
							System.out.println("Enter Valid input");
				}
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("Please Enter a Valid input");
				sc.nextLine();
			} catch(Exception e) {
				e.getStackTrace();
			}
		}
		System.out.println("Exiting System");
		sc.close();
	}

private int menu() throws InputMismatchException {
		System.out.println("0. Exit Application");
		System.out.println("1. Calculate & View the Fees of the students");
		System.out.println("2. Change the Research Fee of a student");
		System.out.println("3. Change the Number of Credit Hours of Student");
		System.out.println("4. View Student Status");
		return sc.nextInt();
	}


}
