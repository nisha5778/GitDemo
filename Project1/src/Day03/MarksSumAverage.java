package Day03;


public class MarksSumAverage {
	float M1, M2, M3, M4;
	
	public float GetSum() {
		return M1+M2+M3+M4;
	}
	
	public float GetAverage() {
		return GetSum()/4;
		
	}
	
	MarksSumAverage(float m1, float m2, float m3, float m4){
		M1 = m1;
		M2 = m2;
		M3 = m3; 
		M4 = m4;
	}
	MarksSumAverage(float m1, float m2, float m3){
		M1 = m1;
		M2 = m2;
		M3 = m3; 
		M4 = 35;
	}
	MarksSumAverage(float m1, float m2){
		M1 = m1;
		M2 = m2;
		M3 = 35; 
		M4 = 35;
	}
	MarksSumAverage(float m1){
		M1 = m1;
		M2 = 35;
		M3 = 35; 
		M4 = 35;
	}
	MarksSumAverage(){
		M1 = 35;
		M2 = 35;
		M3 = 35; 
		M4 = 35;
	}
	
	public static void main(String[] args) {
		MarksSumAverage st1 = new MarksSumAverage();
		System.out.println("Total Marks : " + st1.GetSum());
		System.out.println("Average : " + st1.GetAverage());
		System.out.println();
		
		MarksSumAverage st2 = new MarksSumAverage(90);
		System.out.println("Total Marks : " + st2.GetSum());
		System.out.println("Average : " + st2.GetAverage());
		System.out.println();
		
		MarksSumAverage st3 = new MarksSumAverage(23, 78, 29);
		System.out.println("Total Marks : " + st3.GetSum());
		System.out.println("Average : " + st3.GetAverage());
		System.out.println();
		
		MarksSumAverage st4 = new MarksSumAverage(88, 59);
		System.out.println("Total Marks : " + st4.GetSum());
		System.out.println("Average : " + st4.GetAverage());
		System.out.println();
		
		MarksSumAverage st5 = new MarksSumAverage(90, 88, 86, 84);
		System.out.println("Total Marks : " + st5.GetSum());
		System.out.println("Average : " + st5.GetAverage());
	}
}
