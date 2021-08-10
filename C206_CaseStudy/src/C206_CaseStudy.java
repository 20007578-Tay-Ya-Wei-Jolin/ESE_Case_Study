import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

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
				Appointment appt1 = inputAppointment();
				C206_CaseStudy.addAppointmentSchedule(appointmentList, appt1);

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

	// ================================= Option 1 View Registration
	// =================================
	// Write code for View Registration option

	// ================================= Option 2 View cars
	// =================================
	// Write code for View cars option

	// ================================= Option 3 View parts
	// =================================
	// Write code for View parts option

	// ================================= Option 4 Display appointment schedule
	// =================================
	// Write code for Display appointment schedule option

	public static String viewAppointmentSchedule(ArrayList<Appointment> appointmentList) {
		String output = String.format("%s\n", "Appointment Date");

		for (int i = 0; i < appointmentList.size(); i++) {

			output += String.format("%s\n", appointmentList.get(i).getDate());
		}

		return output;
	}

	public static void addAppointmentSchedule(ArrayList<Appointment> appointmentList, Appointment appt1) {

		String addDate = Helper.readString("Enter date ");
		String addTime = Helper.readString("Enter time: ");

		Appointment addAppt = new Appointment(addDate, addTime);

		appointmentList.add(addAppt);

	}

	public static void updateAppointmentSchedule(ArrayList<Appointment> appointmentList) {

		String updateSchedule = Helper.readString("Enter appointment date to update: ");

		for (int i = 0; i < appointmentList.size(); i++) {

			if (appointmentList.get(i).getDate().equalsIgnoreCase(updateSchedule)) {

				String updateTime = Helper.readString("Enter appointment time to update: ");

				appointmentList.get(i).setDate(updateSchedule);
				appointmentList.get(i).setTime(updateTime);

			}
		}

	}

	public static Appointment inputAppointment() {
		String date = Helper.readString("Enter date > ");
		String time = Helper.readString("Enter time > ");

		Appointment appt1 = new Appointment(date, time);
		// write your code here
		return appt1;

	}

}
