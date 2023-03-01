package Day03;
import java.util.Scanner;


public class DayOfWeek {
	
	public void PrintDay(int d) {
		switch (d) {
		case 1: {
			System.out.println("It's Sunday!");
			break;
		}
		case 2: {
			System.out.println("It's Monday!");
			break;
		}
		case 3: {
			System.out.println("It's Tuesday!");
			break;
		}
		case 4: {
			System.out.println("It's Wednesday!");
			break;
		}
		case 5: {
			System.out.println("It's Thursday!");
			break;
		}
		case 6: {
			System.out.println("It's Friday!");
			break;
		}
		case 7: {
			System.out.println("It's Saturday!");
			break;
		}
		default:
			System.out.println("Please enter a number from 1 to 7!!");
		}
	}
	
	public static void main(String[] args) {
		int i;
		String s;
		System.out.println("Please enter a number from 1 to 7 : ");
		Scanner input = new Scanner (System.in);
		s = input.next();
		
		if(s.matches("[1-7]*")){
			DayOfWeek d = new DayOfWeek();
			d.PrintDay(Integer.parseInt(s));
			}
		else{
			System.out.println("Please enter a number from 1 to 7 : ");	
		}
		input.close();
	}
}
