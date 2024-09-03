import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int attempt = 0;
		int operation = 0;
		double firstNum = 0;
		
		do {
			System.out.println("Calculator");
			System.out.println("=============");
			
			System.out.println("Total = " + firstNum);
			System.out.println();
			
			Scanner scan = new Scanner(System.in);
			
			// Scanner
			if(attempt == 0) {
				System.out.println("Input number: ");
				firstNum = scan.nextDouble();
				attempt++;
			}
			
			// Operation
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulo");
			System.out.println("6. Clear Total");
			System.out.println("7. Exit");
			System.out.println("Operator [1..7]: ");
			operation = scan.nextInt();
			
			if(operation == 6) {
				firstNum = 0;
				attempt = 0;
				System.out.println();
				System.out.println();
				continue;
			}
			else if(operation == 7) {
				break;
			}
			
			// Scanner
			System.out.println("Input number: ");
			double secondNum = scan.nextDouble();
			
			switch(operation) {
			case 1:
				firstNum += secondNum;
				break;
			case 2:
				firstNum -= secondNum;
				break;
			case 3:
				firstNum *= secondNum;
				break;
			case 4:
				firstNum /= secondNum;
				break;
			case 5:
				firstNum %= secondNum;
				break;
			default:
				break;
			}
			
			System.out.println("=================");
			System.out.println();
			System.out.println();
		} while(operation != 7);
		
		System.out.println("Thank you for using this app.");
		System.exit(0);
	}
}
