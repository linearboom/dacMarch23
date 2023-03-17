import java.util.Scanner;
import java.util.ArrayList;

class LCMPrimeFactor{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> num1fact = new ArrayList<>();
		ArrayList<Integer> num2fact = new ArrayList<>();
		
		System.out.println("Enter number 1");
		int num1 =  scan.nextInt();
		System.out.println("Enter Number 2");
		int num2 = scan.nextInt();
		
		int num1_copy =num1;
		int num2_copy =num2;
		
		int i = 2;
		while (i<num1){	
			if (num1 ==1){
				//num1fact.add(1);
				//Redundant code block, will never be exectuted
				break;
			}
			if (prime(num1)){
				num1fact.add(num1);
				break;
			}
			if (prime(i)){
				if (num1_copy % i ==0){
					num1fact.add(i);
					num1_copy = num1_copy / i;
					continue;
				} 
			}
			i++;
		}
		
		i = 2;
		while (i<num2){
			if (num2 ==1){
				//num1fact.add(1);
				break;
			}
			if (prime(num2)){
				num2fact.add(num2);
				break;
			}
			if (prime(i)){
				if (num2_copy % i ==0){
					num2fact.add(i);
					num2_copy = num2_copy / i;
					continue;
				} 
			}
			i++;
		}
		
		System.out.println("Prime Factors of number 1: "+num1fact);
		System.out.println("Prime Factors of number 2: "+num2fact);
		ArrayList<Integer> gcdfact = new ArrayList<>();
		
		int greater,lesser;
		boolean num1_state;
		
		if (num1fact.size() > num2fact.size()){
			greater = num1fact.size();
			lesser = num2fact.size();
			num1_state = true;
		}else {
			greater = num2fact.size();
			lesser = num1fact.size();
			num1_state =false;
		}
		
		for (int j =0;j<greater;j++){
			if (j>=lesser){
				if(num1_state){
					gcdfact.add(num1fact.get(j));
					System.out.println(j);
					continue;
				}else{
					gcdfact.add(num2fact.get(j));
					continue;
				}
			}
			if (num1fact.get(j) == num2fact.get(j)){
				gcdfact.add(num1fact.get(j));
			}else{
				gcdfact.add(num1fact.get(j));
				gcdfact.add(num2fact.get(j));
			}
		
	}
	System.out.println("Factors for LCM are after taking common factors "+gcdfact);
	
	
	int LCM = 1;
	for (int k = 0 ; k<gcdfact.size();k++){
		LCM = LCM * gcdfact.get(k);
	}
	
	System.out.println("LCM is : "+LCM);

	scan.close();
}
		
				
		
				

	public static boolean prime(int n){
		for (int i = 2; i<n; i++){
			if (n%i == 0){
			return false;
			}
		}
		return true;
	}
	

		
}
