import java.util.Scanner;

class Array1D{
	
	public static int min(int arr[]){
		int min  =arr[0];
		for(int i : arr){
			if (i<min){
				min = i;
			}
			
		}
		return min;
	}
	
	public static int max(int arr[]){
		int max = arr[0];
		for(int i : arr){
			if (i>max){
				max = i;
			}
			
		}
		return max;
	}
	
	public static int search(int arr[],int i){
		for(int j = 0 ; j< arr.length;j++){
			
			if ( i == arr[j]){
				System.out.println("Number "+i+" found at index "+j);
				return j;
			}
		}
	
		System.out.println("Number "+i+" not in the given array");
		return -1;
		
	}
	
	
		
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0 ;i<arr.length;i++){
			System.out.println("Enter number "+i);
			arr[i] = scan.nextInt();
		}
		System.out.print("Elements of the array are: ");
		for( int i : arr){
			System.out.print(i+" ");
		}
		
		System.out.println("\n The minimum number is: "+min(arr));
		System.out.println("\n The minimum number is: "+max(arr));
		
		System.out.println("Enter number you want to search");
		int a = scan.nextInt();
		search(arr,a);
		scan.close();
	}
}
		
		
		