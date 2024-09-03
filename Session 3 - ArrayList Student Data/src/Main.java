import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> studentName = new ArrayList<String>();
		ArrayList<String> studentPass = new ArrayList<String>();
		ArrayList<String> studentNumber = new ArrayList<String>();
		
		int choice = 0;
		while(choice != 4) {
			System.out.println("1. Input Data");
			System.out.println("2. Show Data");
			System.out.println("3. Delete Data");
			System.out.println("4. Exit");
			
			System.out.println("Your choice: ");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Name: ");
				String name = scan.nextLine();
				System.out.println("Pass: ");
				String pass = scan.nextLine();
				System.out.println("Phone: ");
				String phone = scan.nextLine();
				studentName.add(name);
				studentPass.add(pass);
				studentNumber.add(phone);
				System.out.println("New data is added.");
				break;
			case 2:
				System.out.println("====================================================");
				System.out.println("| No |   Name   |   Pass   |     Phone     |");
				System.out.println("====================================================");
				if(studentName.size() == 0) {
					System.out.println("|                 No data exist                    |");
				}
				else {
					for(int i=0; i<studentName.size(); i++) {
						System.out.println("| " + (i+1) + "  |   " + studentName.get(i) + "   |   " + studentPass.get(i) + "   |  " + studentNumber.get(i) + "  |");
					}
				}
				System.out.println("====================================================");
				break;
			case 3:
				System.out.println("====================================================");
				System.out.println("| No |   Name   |   Pass   |     Phone     |");
				System.out.println("====================================================");
				if(studentName.size() == 0) {
					System.out.println("|                 No data exist                    |");
					System.out.println("====================================================");
					System.out.println("There is no data exist to be deleted.");
					break;
				}
				else {
					for(int i=0; i<studentName.size(); i++) {
						System.out.println("| " + (i+1) + "  |   " + studentName.get(i) + "   |   " + studentPass.get(i) + "   |  " + studentNumber.get(i) + "  |");
					}
					System.out.println("====================================================");
					System.out.println("Input data number to be deleted: ");
					int toDel = scan.nextInt();
					studentName.remove(toDel-1);
					studentPass.remove(toDel-1);
					studentNumber.remove(toDel-1);
					System.out.println("Data is removed.");
				}
				break;
			case 4:
				System.out.println("Program terminated.");
				break;
			default:
				System.out.println("Wrong input!");
				break;
			}
			System.out.println();
		}
	}
}