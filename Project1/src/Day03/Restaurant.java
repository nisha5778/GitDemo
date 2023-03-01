package Day03;

import java.util.Scanner;


public class Restaurant {
	int parcelOrDineIn;
	int vegOrNonveg;
	float fOrderAmount;
	int iNoOfDishes = 0;
	float fBillAmount = 0;
	float fGST = 0;
	int iParcelDineinCharge = 0;
	float fTotalBill = 0;
	float fDiscount = 0;
	float fFinalBill = 0;
	
	String[][] VegMenu = {{"Paneer Tikka","120"},
							{"Cashew pulao","150"},
							{"Veg Fried rice","130"},
							{"Gobi 65","100"},
							{"Veg Thali", "140"}};
	
	
	String[][] nonVegMenu = {{"Chicken biryani","200"},
								{"Fish curry","150"},
								{"Chicken 65", "120"},
								{"Mutton gravy", "220"},
								{"Chicken fried roce","180"}};
	
	public void DisplayMainMessage() {
		System.out.println("Hello Welcome to Numpy Ninja restaurant !");
		System.out.println("");
		System.out.println("Please select the service offering from below list :");
		System.out.println("");
		System.out.println("[1] dine-in");
		System.out.println("");
		System.out.println("[2] take away");
		System.out.println("Please enter the option - ");
	}
	
	public void DisplayCategory() {
		System.out.println("Please select the category from the below list :");
		System.out.println("");
		System.out.println("[1] Vegetarian");
		System.out.println("");
		System.out.println("[2] Non-Vegetarian");
		System.out.println("Please enter the option - ");
	}
	
	public void DisplayVegDishes() {
		System.out.println("Below are the dishes available currently to order :");
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + ". " + VegMenu[i][0] + " - Rs. " + VegMenu[i][1] + ".00 (per item)");
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Please enter the option - ");
	}
	
	public void DisplayNonvegDishes() {
		System.out.println("Below are the dishes available currently to order :");
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + ". " + nonVegMenu[i][0] + " - Rs. " + nonVegMenu[i][1] + ".00 (per item)");
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Please enter the option - ");
	}
	
	public void CalculateBill() {
		System.out.println("Total cost : " + fOrderAmount);
		fGST = fOrderAmount * .06f;
		System.out.println("GST tax : " + fGST);
		
		if(parcelOrDineIn == 1) {//dine in - 30 per bill
			iParcelDineinCharge = 30;
		}else if (parcelOrDineIn == 2) {//parcel -  10rs per dish
			iParcelDineinCharge = 10 * iNoOfDishes;
		}
		System.out.println("Parcel/Dine-in charge : " + iParcelDineinCharge);
		fTotalBill = fOrderAmount + fGST + iParcelDineinCharge;
		System.out.println("Total bill amount : " + fTotalBill);
		if(fTotalBill > 1000) {
			fDiscount = fTotalBill * .1f;
		}
		else if(fTotalBill > 1500) {
			fDiscount = fTotalBill * .15f;
		}
		else{
			fDiscount = 0;
		}
		fFinalBill = fTotalBill - fDiscount;
		System.out.println("Discount : " + fDiscount);

		System.out.println("Net bill amount : " + fFinalBill);
		System.out.println("Thank you ! Visit again !");
	}

	public static void main(String[] args) {
		Restaurant rst = new Restaurant();
		rst.DisplayMainMessage();
		Scanner input = new Scanner(System.in);
		rst.parcelOrDineIn = input.nextInt();
		boolean bMoreOrder = true;
		rst.DisplayCategory();
		rst.vegOrNonveg = input.nextInt();
		int iOption=0, iQuantity=0;
		float fAmount = 0;
		String sMoreFromSameCategory = "";
		String sMoreOrderFromOtherCategory = "";
		
		while(bMoreOrder) {	
			
			if(rst.vegOrNonveg == 1 ) {
				rst.DisplayVegDishes();
			}else if (rst.vegOrNonveg == 2) {
				rst.DisplayNonvegDishes();
			}

			iOption = input.nextInt();
			if(iOption <=0 || iOption>5 ) {
				System.out.println("Please enter the option between 1 to 5");
				continue;
			}
			else {
				if(rst.vegOrNonveg == 1) {
					System.out.println("Please enter number of " + 
										rst.VegMenu[iOption-1][0] + " you would like to order - ");	
					iQuantity = input.nextInt();
					rst.iNoOfDishes = rst.iNoOfDishes + iQuantity;
					fAmount = iQuantity * Float.valueOf(rst.VegMenu[iOption-1][1]);
				}
				else {
					System.out.println("Please enter number of " + 
							rst.nonVegMenu[iOption-1][0] + " you would like to order - ");	
					iQuantity = input.nextInt();
					rst.iNoOfDishes = rst.iNoOfDishes + iQuantity;
					fAmount = iQuantity * Float.valueOf(rst.nonVegMenu[iOption-1][1]);
				}
				rst.fOrderAmount = rst.fOrderAmount + fAmount;
				
				System.out.println("Would you like to order one more dish ? [Y] or [N] - " );
				sMoreFromSameCategory = input.next();
				
				if(sMoreFromSameCategory.equals("Y")|| sMoreFromSameCategory.equals("y")) {
					continue;
					}
				else {
					System.out.println("Would you like to order from other category ? [Y] or [N] - " );
					sMoreOrderFromOtherCategory = input.next();
					if(sMoreOrderFromOtherCategory.equals("Y") || sMoreOrderFromOtherCategory.equals("y")) {
						if(rst.vegOrNonveg == 1) {
							rst.vegOrNonveg = 2;
							}
						else {
							rst.vegOrNonveg = 1;
							}
						bMoreOrder = true;
						sMoreOrderFromOtherCategory = "";
						continue;
					}
					else {
					bMoreOrder=false;
					break;
					}
				}
			}
		}
		rst.CalculateBill();
		input.close();
		}
	}

