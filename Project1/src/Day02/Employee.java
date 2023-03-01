package Day02;

public class Employee {

	double basicPay;
	double BOA;
	double bonus;
	double tax;
	double PF;
	double monthlyGross;
	double yearlyGross;
	double yearlyTax;
	double monthlyTax;
	double monthlyTakeHome;
	
	private void CalculateMonthlyGross() {
		PF = basicPay*.12;
		monthlyGross = basicPay + BOA + bonus - PF;
		yearlyGross = monthlyGross * 12;
		//System.out.println("Monthly Gross - " + monthlyGross);
		CalculateYearlyTax();
	}
	
	private void CalculateYearlyTax() {
		float taxRate=0f;
		if(yearlyGross<=250000) {
			taxRate = 0f;
		}else if(yearlyGross >250000 && yearlyGross <=500000) {
			taxRate = .05f;
		}else if(yearlyGross >500000 && yearlyGross <=750000) {
			taxRate = .1f;
		}else if(yearlyGross >750000 && yearlyGross <=1000000) {
			taxRate = .15f;
		}else if(yearlyGross >1000000 && yearlyGross <=1250000) {
			taxRate = .2f;
		}else if(yearlyGross >1250000 && yearlyGross <=1500000) {
			taxRate = .25f;
		}else if(yearlyGross >1500000) {
			taxRate = .3f;
		}
		System.out.println("taxRate - " +taxRate);

		yearlyTax = yearlyGross * taxRate;
		monthlyTax = yearlyTax / 12;
		//System.out.println("MonthlyTax - " +monthlyTax);

	}
	
	public void CalculateMonthlyTakeHome() {
		CalculateMonthlyGross();
		//System.out.println("MonthlyGross - " +monthlyGross);
		//System.out.println("MonthlyTax - " +monthlyTax);

		monthlyTakeHome = monthlyGross - monthlyTax;
		System.out.println("Monthly Take Home - " + (float)monthlyTakeHome);
	}
	
	Employee(double b1, double b2, double b3){
		basicPay =b1;
		BOA = b2;
		bonus = b3;
	}	


	public static void main(String[] args) {
		Employee e1 = new Employee (15000, 17000, 4000);
		e1.CalculateMonthlyTakeHome();
		Employee e2 = new Employee (7000, 5000, 2000);
		e2.CalculateMonthlyTakeHome();
		Employee e3 = new Employee (10000, 7000, 2500);
		e3.CalculateMonthlyTakeHome();
		Employee e4 = new Employee (12000, 9000, 3000);
		e4.CalculateMonthlyTakeHome();
		Employee e5 = new Employee (15000, 10000, 3500);		
		e5.CalculateMonthlyTakeHome();
	}
}

