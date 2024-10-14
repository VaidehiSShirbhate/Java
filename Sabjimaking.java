import java.util.Scanner;
public class Sabjimaking{

	public static void main(String[] args){
		System.out.println("Enter a sabji you want to eat:");
		Scanner sc= new Scanner(System.in);
		String sabji = sc.next();

		cutVeg(sabji);
		cutVeg("Onion");
		cutVeg("Garlic");

		takePan();
		addMasala("Turmeric");
		addMasala("Chilli Powder");
		if (!isDry(sabji)) {
			pourWater(10,"Hot");
		}
		addVeg();
		waitForCook(10);
	}


	public static void cutVeg(String sabji){
		System.out.println("First cut a vegetable"+sabji);
	}

	public static boolean isDry(String sabji){
		if (sabji.equalsIgnoreCase("Bhendi")||
		sabji.equalsIgnoreCase("Potato")||
		sabji.equalsIgnoreCase("Tomato")){
			return true;
		}
		return false;
//		if (sabji=="Bhendi"||sabji=="Potato"||sabji=="Tomato"){
//			return true;
//		}
//		else{
//			return false;
//		}

	}

	public static void takePan(){
		System.out.println("take a pan to cook a sabji");
	}

	public static void addMasala(String s){
		System.out.println("Add oil and masala in pan");
	}

	public static void pourWater(int liter, String waterType){
		System.out.println("Add "+liter+ "liter water with "+waterType+ " water to make sabji Gravy");
	}

	public static void addVeg(){
		System.out.println("Add a sabji in pan");
	}

	public static void waitForCook(int hours){
		System.out.println("After that you have to wait "+ hours +" min for baji to cook");
	}

}