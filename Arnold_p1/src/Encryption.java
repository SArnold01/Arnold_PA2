import java.util.Scanner;

public class Encryption {
		
	public static void main(String[] args) {
		
		//Setup scanner
		Scanner scnr = new Scanner(System.in);
		
		//Declare variables
		int num1;
		int num2;
		int num3;
		int num4;
		
		//Send output request for input and receive input
		System.out.println("Enter digit 1");
		num1 = scnr.nextInt();
		
		System.out.println("Enter digit 2");
		num2 = scnr.nextInt();
		
		System.out.println("Enter digit 3");
		num3 = scnr.nextInt();
		
		System.out.println("Enter digit 4");
		num4 = scnr.nextInt();
		
		//Encrypt the variables by adding 7 and finding the remainder
		num1 = (num1 + 7) % 10;
		num2 = (num2 + 7) % 10;
		num3 = (num3 + 7) % 10;
		num4 = (num4 + 7) % 10;
		
		//Print result of encryption
		System.out.println("The encryption is: " + num3 + num4 + num1 + num2);
		
		//Close the scanner
		scnr.close();
		
	}
} 