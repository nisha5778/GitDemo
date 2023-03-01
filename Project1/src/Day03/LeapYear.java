package Day03;

public class LeapYear {
	public void FindLeapYears() {
		int i=0;
		for(i=2000; i<=2100; i++) {
			if(i%4 == 0) {
				if(i%100!=0 || i%400==0) {
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		LeapYear lp = new LeapYear();
		lp.FindLeapYears();
	}
}
