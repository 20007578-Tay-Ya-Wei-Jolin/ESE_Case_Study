import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
