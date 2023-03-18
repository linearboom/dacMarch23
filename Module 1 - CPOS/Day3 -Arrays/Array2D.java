

class Array2D{
	int matrix[][];// = new int[3][3];
	int transpose[][];//= new int[3][3];
	
	public Array2D(int arr[][]){
		this.matrix = new int[3][3];
		this.transpose = new int[3][3];
		for(int i = 0; i <3; i++){
			for(int j =0;j<3;j++){
				this.matrix[i][j] = arr[i][j];
				this.transpose[i][j] = arr[j][i];
			}
		}
	}
	
	
	public void display(){
		displayMatrix(this.matrix);
	}
	
	public void displayTranspose(){
		displayMatrix(this.transpose);
	}
	
	public static void displayMatrix(int arr[][]){
		for(int i[] : arr){
			for(int j : i){
				System.out.print(j +" ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
		
	
	public static int[][] add(int arr1[][], int arr2[][]){
		int arr3[][] = new int[3][3];
		for(int i = 0; i <3; i++){
			for(int j =0;j<3;j++){
				arr3[i][j] = arr1[i][j] + arr2[i][j];
 			}
		}
		return arr3;
	}
	
	public static int[][] subtract(int arr1[][], int arr2[][]){
		int arr3[][] = new int[3][3];
		for(int i = 0; i <3; i++){
			for(int j =0;j<3;j++){
				arr3[i][j] = arr1[i][j] - arr2[i][j];
 			}
		}
		return arr3;
	}
	
	public static int[][] matMultiplication(int arr1[][], int arr2[][]){
		int arr3[][] = new int[3][3];
		int sum;
		for(int i = 0; i <3; i++){
			for(int j =0;j<3;j++){
				sum = 0;
				for(int k =0 ; k<3;k++){
					sum+= arr1[i][k] * arr2[k][j];
				}
				arr3[i][j] = sum;
			}
		}
		return arr3;
	}
		
		
		
	
		
	
	public static void main(String args[]){
		int arr1[][] = new int[3][];
		
		int a[] = new int[]{1,2,3};
		int b[] = new int[]{4,5,6};
		int c[] = new int[]{7,8,9};
		
		arr1[0] = a;
		arr1[1] =b;
		arr1[2] =c;
		
		int arr2[][] = new int[3][];
		
		int d[] = new int[]{1,2,3};
		int e[] = new int[]{4,5,6};
		int f[] = new int[]{7,8,9};
		
		arr2[0] = d;
		arr2[1] =e;
		arr2[2] =f;
		
		Array2D matrix1 = new Array2D(arr1);
		Array2D matrix2 = new Array2D(arr2);
		
		matrix1.display();
		matrix2.display();
		matrix1.displayTranspose();
		matrix2.displayTranspose();
		
		
		
		int sum[][] = add(matrix1.matrix , matrix2.matrix);
		displayMatrix(sum);
		
		int subtract[][] = subtract(matrix1.matrix, matrix2.matrix);
		displayMatrix(subtract);
		
		//int sum1[][] = add(matrix1.matrix , sum);
		//displayMatrix(sum1);
		
		int mutliply[][] = matMultiplication(matrix1.matrix, matrix2.matrix);
		displayMatrix(mutliply);
		
		
		
	}
}
		
		
		