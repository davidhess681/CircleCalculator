import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		do {
			Circle myCircle = new Circle(PromptRadius(input));
			// Circle myCircle = new Sphere(PromptRadius(input)); 
			myCircle.PrintDetails();
			
		}
		while(PromptContinue(input));
		System.out.println("Goodbye. You created " + Circle.Count + " Circle object(s)");

	}
	public static double PromptRadius(Scanner input) {
		if(Circle.Count != 0) {
			System.out.println("\n\n");
		}
		System.out.println("Welcome to the Circle Calculator!");
		System.out.print("Enter Radius: ");
		return input.nextDouble();
		
		
	}
	public static boolean PromptContinue(Scanner input) {
		System.out.print("Thank you for playing! Would you like to continue? (y/n): ");
		return input.nextBoolean();
	}

}
