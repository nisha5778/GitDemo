package Day01;

import java.util.Scanner;

public class Student {
	String name;
	int marksSub1;
	int marksSub2;
	int marksSub3;
	int marksSub4;
	float sum;
	float average;
	
	public void CalcSum() {
		sum = marksSub1 + marksSub2 + marksSub3 + marksSub4;
		System.out.println("The total marks for "  + 	this.name + " : "+  (int)(sum));
	}
	public void CalcAverage() {
		average = sum/4;
		System.out.println("The average marks for " + this.name + " : " + average);
	}
	
	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		for (i=0;i<4;i++) {
			Student student1 = new Student();
			System.out.print("Please enter name of student : ");
			student1.name = input.next();
			System.out.print("Please enter marks for subject 1 : ");
			student1.marksSub1 = input.nextInt();
			System.out.print("Please enter marks for subject 2 : ");
			student1.marksSub2 = input.nextInt();
			System.out.print("Please enter marks for subject 3 : ");
			student1.marksSub3 = input.nextInt();
			System.out.print("Please enter marks for subject 4 : ");
			student1.marksSub4 = input.nextInt();
			student1.CalcSum();
			student1.CalcAverage();
		}
		input.close();
		
		/*student1.marksSub1 = 87;
		student1.marksSub2 = 90;
		student1.marksSub3 = 59;
		student1.marksSub4 = 67;
		
		
		Student student2 = new Student();
		student2.marksSub1 = 50;
		student2.marksSub2 = 78;
		student2.marksSub3 = 66;
		student2.marksSub4 = 60;
		student2.CalcSum();
		student2.CalcAverage();
		
		Student student3 = new Student();
		student3.marksSub1 = 91;
		student3.marksSub2 = 90;
		student3.marksSub3 = 95;
		student3.marksSub4 = 89;
		student3.CalcSum();
		student3.CalcAverage();
		
		Student student4 = new Student();
		student4.marksSub1 = 62;
		student4.marksSub2 = 88;
		student4.marksSub3 = 78;
		student4.marksSub4 = 72;
		student4.CalcSum();
		student4.CalcAverage();*/
	}
}
