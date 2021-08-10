import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private ArrayList<Appointment> appointmentList;
	private Appointment appt1;
	

	@Before
	public void setUp() throws Exception {
		appt1 = new Appointment("10/08/2021", "4:38");
		appointmentList = new ArrayList<Appointment>();
	}

	@After
	public void tearDown() throws Exception {
		appt1 = null;
		appointmentList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	public void addAppointmentTest() {
		//Appointment list is not null, so that can add a new item
		assertNotNull("Test if there is valid Appointment arraylist to add to", appointmentList);
		
		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addAppointmentSchedule(appointmentList, appt1);
		assertEquals("Test if that Appointment arraylist size is 1?", 1, appointmentList.size());
		
		// The appointment just added is as same as the first appointment of the list
		assertSame("Test that appointment is added same as 1st item of the list?", appt1, appointmentList.get(0));
		
		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addAppointmentSchedule(appointmentList, appt1);
		assertEquals("Test that Appointment arraylist size is 2?", 2, appointmentList.size());
	}
	
	public void updateAppointmentTest() {
		//Appointment list is not null, so that can update an existing appointment
		assertNotNull("Test if there is valid Appointment arraylist to update from", appointmentList);
		
		//The appointment just added is same as the first appointment of the lsit
		assertSame("Test that appointment just updated same as 1st appointment of the list?", appt1, appointmentList.get(0));
		
		
	
	}

}
