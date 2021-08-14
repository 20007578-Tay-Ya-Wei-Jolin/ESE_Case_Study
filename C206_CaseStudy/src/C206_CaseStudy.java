import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class C206_CaseStudy {

	static String dateFormat = "[0-3][0-9]/((0[1-9])|(1[0-2]))/2021";
	static String timeFormat = "[0-2][0-9]:[0-5][0-9]";

	static String s1;
	static String s2;
	static String s3;
	static String s4;

	static int i1;
	static int i2;
	static int i3;
	static int i4;

	public static void main(String[] args) {

		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
		Appointment appt1 = null;

		int option = 0;

		while (option != 5) {
			menu();
			option = Helper.readInt("Enter option > ");
			System.out.println();

			if (option == 1) {

			} else if (option == 2) {

			} else if (option == 3) {

			} else if (option == 4) {

				menuForAppointment();

				int choice = Helper.readInt("Enter choice > ");

				if (choice == 1) {
					viewAppointmentSchedule(appointmentList);

				} else if (choice == 2) {

					addAppointmentSchedule(appointmentList, appt1);

				} else if (choice == 3) {
					updateAppointmentSchedule(appointmentList);

				} else if (choice == 4) {
					searchAppointmentSchedule(appointmentList);

				} else {
					System.out.println("Invalid choice");
				}

			} else if (option == 5) {
				System.out.println("Bye!");

			} else {
				System.out.println("Invalid option!");
			}

		}
	}

	public static void menu() {

		Helper.line(80, "-");
		System.out.println("1. Visitor Registration");
		System.out.println("2. View cars");
		System.out.println("3. View parts");
		System.out.println("4. Display appointment schedule");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}

	public static void menuForAppointment() {

		System.out.println("1. View Appointment");
		System.out.println("2. Add Appointment");
		System.out.println("3. Update Appointment");
		System.out.println("4. Search Appointment");
		System.out.println();
		Helper.line(80, "=");

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

	public static void viewAppointmentSchedule(ArrayList<Appointment> appointmentList) {
		String output = String.format("%-20s %-10s\n", "DATE", "TIME");

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMM yyyy");

		for (Appointment a : appointmentList) {

			String date = a.getDate();
			LocalDate dateLD = LocalDate.parse(date, dtf1);
			String dateFromLD = dateLD.format(dtf2);

			String time = a.getTime();

			output += String.format("%-20s %-10s\n", dateFromLD, time);
		}

		System.out.println(output);
		Helper.line(80, "=");

	}

	public static void addAppointmentSchedule(ArrayList<Appointment> appointmentList, Appointment appt1) {

		boolean check = false;

		String addDate = Helper.readString("Enter date:  ");
		String addTime = Helper.readString("Enter time: ");

		s1 = addDate.charAt(4) + ""; // check if the month is February
		s2 = addDate.charAt(0) + ""; // check if the day of the month is greater than 29
		i1 = Integer.parseInt(s1);
		i2 = Integer.parseInt(s2);

		s3 = addTime.charAt(0) + ""; // check if the first digit of the time is 2
		s4 = addTime.charAt(1) + ""; // check if the second digit of the time is 4
		i3 = Integer.parseInt(s3);
		i4 = Integer.parseInt(s4);

		if (Pattern.matches(dateFormat, addDate) && Pattern.matches(timeFormat, addTime)) {
			if (i1 == 2) {
				if (i2 >= 3) {
					System.out.println("February cannot have more than 29 days!");
				} else {
					check = true;
				}
			} else {
				check = true;
			}

			if (i3 == 2) {
				if (i4 >= 5) {
					System.out.println("Hours cannot be more than 24");
					check = false;

				} else {
					check = true;
				}
			} else {
				check = true;
			}

		} else {
			System.out.println("Invalid date and time format!");
		}

		if (check == true) {

			Appointment addAppt = new Appointment(addDate, addTime);

			appointmentList.add(addAppt);
		}

	}

	public static void updateAppointmentSchedule(ArrayList<Appointment> appointmentList) {

		boolean check = false;

		String oldDate = Helper.readString("Enter previous date: ");
		String oldTime = Helper.readString("Enter previous time: ");

		String newDate = Helper.readString("Enter new date: ");
		String newTime = Helper.readString("Enter new time: ");

		s1 = newDate.charAt(4) + ""; // check if the month is February
		s2 = newDate.charAt(0) + ""; // check if the day of the month is greater than 29
		i1 = Integer.parseInt(s1);
		i2 = Integer.parseInt(s2);

		s3 = newTime.charAt(0) + ""; // check if the first digit of the time is 2
		s4 = newTime.charAt(1) + ""; // check if the second digit of the time is 4
		i3 = Integer.parseInt(s3);
		i4 = Integer.parseInt(s4);

		for (Appointment a : appointmentList) {
			if (a.getDate().equals(oldDate)) {
				if (Pattern.matches(dateFormat, newDate)) {
					if (i1 == 2) {
						if (i2 >= 3) {
							System.out.println("February cannot have more than 29 days!");
						} else {
							check = true;
						}
					} else {
						check = true;
					}
				}
			} else {
				System.out.println("No such date found in the system.");
			}

			if (a.getTime().equals(oldTime)) {
				if (Pattern.matches(timeFormat, newTime)) {
					if (i3 == 2) {
						if (i4 >= 5) {
							System.out.println("Hours cannot be more than 24");
							check = false;

						} else {
							check = true;
						}
					} else {
						check = true;
					}
				}
			} else {
				System.out.println("No such time found in the system.");
			}

			if (check == true) {
				Appointment updateAppt = new Appointment(newDate, newTime);
				appointmentList.add(updateAppt);
				appointmentList.remove(a);
			}
		}

	}

	public static void searchAppointmentSchedule(ArrayList<Appointment> appointmentList) {

		String output = String.format("%-20s %-20s\n", "DATE", "TIME");
		String inputKeyword = Helper.readString("Enter appointment date > ");

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMM yyyy");

		for (Appointment a : appointmentList) {
			if (a.getDate().equals(inputKeyword)) {

				String date = a.getDate();
				LocalDate dateLD = LocalDate.parse(date, dtf1);
				String dateFromLD = dateLD.format(dtf2);

				String time = a.getTime();
				output += String.format("%-20s %-20s", dateFromLD, time);
			}
		}

		System.out.println(output);

	}

	public static Appointment inputAppointment() {
		String date = Helper.readString("Enter date > ");
		String time = Helper.readString("Enter time > ");

		Appointment appt1 = new Appointment(date, time);
		// write your code here
		return appt1;

	}

}
