import java.util.*;

public class AgeGuess {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String answer = "";
		int ageGuess;
		String Name;
		System.out.println("Please enter your name and age: ");
		Name = scan.nextLine();
		ageGuess = scan.nextInt();
		System.out.print("Your name is ");
		System.out.print(Name);
		System.out.print(" and you are ");
		System.out.print(ageGuess);
		System.out.print(" years old.");
	}

}
