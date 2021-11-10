package tn.esprit.spring.appointment.tests;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.controller.RestAppointmentController;
import tn.esprit.spring.entities.Appointment;
import tn.esprit.spring.exception.ResourceNotFoundException;





@SpringBootTest
public class AppointmentSaghirTests {
	@Autowired
	RestAppointmentController restAppointmentController;
	
	@Test
	public void testGetAllAppointments() {
		restAppointmentController.getAllAppointments();
	}
	
	@Test
	public void testAddAppointment() throws ResourceNotFoundException {
		Appointment appoint = restAppointmentController.addAppointment(new Appointment());
		restAppointmentController.deleteAppointment(appoint.getIdAppointement());
	}

	@Test
	public void testGetAppointmentById() throws ResourceNotFoundException {
		restAppointmentController.getAppointmentById(1l);
	}
	
	@Test
	public void testUpdateAppointment() throws ResourceNotFoundException {
		restAppointmentController.updateAppointment(1l, new Appointment());
	}
	
	@Test
	public void testDeleteAppointment()	throws ResourceNotFoundException {
		//restAppointmentController.deleteAppointment(9l);
	}
	
	@Test
	public void testSortByState() {
		restAppointmentController.sortByState("");
	}
}