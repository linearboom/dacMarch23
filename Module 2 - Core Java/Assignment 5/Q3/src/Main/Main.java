package Main;

import java.util.Scanner;

import com.cdac.util.Products;
import com.product.test.ProductTest;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		try {
			int size =  sc.nextInt();
			ProductTest test = new ProductTest(size);
			test.getvalues();
			test.sort();
			test.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
