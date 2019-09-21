import java.util.Scanner;

public class Arnold_p2 {
	
	public static void main(String[] args) {
		
		//Setup scanner
		Scanner scnr = new Scanner(System.in);
		
		//Declare variables
		int choice;
		double bmi = 0;
		double weight;
		double height;
		
		System.out.print("Options for Calculations: "
				+ "\n1) Imperial System (Pounds/Inches)"
				+ "\n2) Metric System (Kilograms/Meters)"
				+ "\n\nType your selection:  " );
		choice = scnr.nextInt();
		
		if (choice == 1) {
			
			//Request information on weight and height
			System.out.print("Enter weight in pounds: ");
			weight = scnr.nextDouble();
			
			System.out.print("Enter height in inches: ");
			height = scnr.nextDouble();
			
			//Calculate BMI
			bmi = (703 * weight) / (height * height);
		}
		
		else {
					
			//Request information on weight and height
			System.out.print("Enter weight in kilgrams: ");
			weight = scnr.nextDouble();
			
			System.out.print("Enter height in meters: ");
			height = scnr.nextFloat();
			
			//Calculate BMI
			bmi = (weight) / (height * height);
		}
		
		//Show user the Categories
		System.out.println("\n\nBMI Categories:"
				+ "\nUnderweight = <18.5"
				+ "\nNormal weight = 18.5 - 24.9"
				+ "\nOverweight = 25 - 29.9"
				+ "\nObesity = BMI of 30 or greater");
		System.out.println("\nYour BMI is " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("You are underweight!");
		}
		if(bmi >= 18.5 && bmi < 25) {
			System.out.println("You are a healthy weight!");
		}
		if(bmi >= 25 && bmi < 39) {
			System.out.println("You are overweight!");
		}
		if(bmi >= 30) {
			System.out.println("You are obesity!");
		}
	//Close the scanner
	scnr.close();

	}

}