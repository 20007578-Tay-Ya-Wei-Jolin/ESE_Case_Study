
public class C206_CaseStudy {

	public static void main(String[] args) {

		int option = 0;

		while (option != 5) {

			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// Visitor Registration

			} else if (option == 2) {
				// View cars

			} else if (option == 3) {
				// View parts

			} else if (option == 4) {
				// Display appointment

			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}
	}
	
	public static void menu() {

		System.out.println("1. Visitor Registration");
		System.out.println("2. View cars");
		System.out.println("3. View parts");
		System.out.println("4. Display appointment schedule");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	
	//================================= Option 1 View Registration =================================
	//Write code for View Registration option
	
	
	
	
	//================================= Option 2 View cars =================================
	//Write code for View cars option
	
	
	
	
	//================================= Option 3 View parts =================================
	//Write code for View parts option
	
	
	
	
	//================================= Option 4 Display appointment schedule =================================
	//Write code for Display appointment schedule option
	

}
