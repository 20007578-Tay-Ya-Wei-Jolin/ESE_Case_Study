import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19010398, 9 Aug 2021 4:12:16 pm
 */

public class Appointment {

	private String date;
	private String time;

	public Appointment(String date, String time) {
		this.date = date;
		this.time = time;

	}
	
	public String getDate() {
		return date;
	}
	
	public String getTime() {
		return time;
	}
	
	public String setDate(String newDate) {
		return this.date = newDate;
	}
	
	public String setTime(String newTime) {
		return this.time = time;
	}

}
