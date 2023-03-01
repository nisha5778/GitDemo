package Day03;

import java.util.Scanner;


public class FormsOfDecimalNo {
		static String sb ="", so="", sh="";
		
		public String GetBinary(int n) {
			sb = sb+ n%2;
			if (n/2==0){			
				return sb;
			}
			GetBinary(n/2);
			return sb;
		}
		
		public String GetOctal(int n) {
			so = so+ n%8;
			if (n/8==0){			
				return so;
			}
			GetOctal(n/8);
			return so;
		}
		public String GetHexadecimal(int n ) {
			sh = sh+ n%16;
			if (n/16==0){			
				return sh;
			}
			GetHexadecimal(n/16);
			return sh;
		}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FormsOfDecimalNo fd= new FormsOfDecimalNo();
		System.out.println(" : ");
		int n = input.nextInt();
		
		StringBuilder sb = new StringBuilder(fd.GetBinary(n));		
		System.out.println("Binary output : " + sb.reverse());
		
		sb = new StringBuilder(fd.GetOctal(n));
		System.out.println("Octal output : " + sb.reverse());
		
		String sh="";
		if(n>9 && n<16) {
			System.out.print("inside");
			switch (n) {
				case 10: {
					sh="A";
					break;
				}
				case 11: {
					sh="B";
					break;
				}
				case 12: {
					sh="C";
					break;
				}
				case 13: {
					sh="D";
					break;
				}
				case 14: {
					sh="E";
					break;
				}
				case 15: {
					sh="F";
					break;
				}
			}
		}
		if(sh.matches("")) {
			sb = new StringBuilder(fd.GetHexadecimal(n));
		}
		else {
			sb = new StringBuilder(sh);
		}
		
		System.out.println("Hexadecimal output : " + sb.reverse());
		
		input.close();
	}
}
