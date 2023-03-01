package Day03;

public class PrimeNumbers {
	int[] prime = new int[30];
	static int counter=0;
	int n=3;
	
	public int[] GetPrimeNumbers(){
		prime[counter]=2;
		while(counter<29) {
			if(CheckIfPrime(n)) {
				counter++;
				prime[counter] = n;
			}
			n++;	
		}
		return prime;
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
		PrimeNumbers pn = new PrimeNumbers();
		int[] prime =  pn.GetPrimeNumbers();
		System.out.println("The first 30 prime numbers are : ");
		for(int i=0; i<30; i++) {
			System.out.println(prime[i]);
		}
	}
}
