package Day03;

import java.util.Scanner;

public class FibonacciSeries {
	//static int i=1;// nextNo =1, prevNo = 1;
	
	public int FindFibonacciSeriesNo(int n) {
		int f[] = new int[n+2];
		f[0] = 0;
		f[1] = 1;
		
		for(int i=2; i<=n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
	
	public int RecurFindFibonacciSeriesNo(int n) {
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
		if(n==1 || n==2)
		{
			return 1;
		}
		return RecurFindFibonacciSeriesNo(n-1)+ RecurFindFibonacciSeriesNo(n-2);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FibonacciSeries fb= new FibonacciSeries();
		System.out.println("Please enter the number for Fibonacci series : ");
		int n = input.nextInt();
		System.out.println(fb.FindFibonacciSeriesNo(n));
		System.out.println(fb.RecurFindFibonacciSeriesNo(n));
		input.close();
	}
}
