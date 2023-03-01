package Day03;

import java.util.ArrayList;
import java.util.Scanner;


public class PrimeFactors {
	static ArrayList<Integer> factors = new ArrayList<Integer>();
	
	public ArrayList<Integer> GetPrimeFactors(int n) {
		for(int i=2; i<=n/2; i++) {
				if(n%i == 0) {
					if(i==2) {
						factors.add(i);
						
					}
					else {
						if(CheckIfPrime(i)) {
							factors.add(i);
						}
					}
				}
			}
		return factors;
	}
	
	private boolean CheckIfPrime(int n) {
		for (int i = 2; i<=n/2; i++) {
			if (n%i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		PrimeFactors pf = new PrimeFactors();
		System.out.println("Please enter an integer : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<Integer> factors =  pf.GetPrimeFactors(n);
		System.out.println("The factors of " + n + " are : ");
		
		for(int i=0; i<factors.size() ; i++) {
			System.out.println(factors.get(i));
		}
	}
}