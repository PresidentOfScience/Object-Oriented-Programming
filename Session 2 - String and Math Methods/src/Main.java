import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Lowercase VS Uppercase
		String input;		
		System.out.println("Input an alphabet: ");
		Scanner scan = new Scanner(System.in);
		input = scan.next();
		char alphabet = input.charAt(0);
		int ascii = alphabet;
		
		if(ascii >= 65 && ascii <= 90) {
			System.out.println("Uppercase");
		}
		else if(ascii >= 97 && ascii <= 122) {
			System.out.println("Lowercase");
		}
		else {
			System.out.println("Not an alphabet");
		}
		System.out.println();
		
		// String Methods
		String stringToReplaced = "Good Morning Morning";
		String result = stringToReplaced.replaceFirst("Morning", "Day");
		System.out.println(result);
		result = stringToReplaced.replace("Morning", "Day");
		System.out.println(result);
		
		String stringToSplit = "Good,Morning,Morning";
		System.out.println(stringToSplit.substring(1, 5));
		System.out.println();
		
		// Math Methods
		System.out.println("25 / 4 is " + 25/4);
		System.out.println("25 / 4.0 is " + 25/4.0);
	}
}