package citas.singleton;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import citas.Doctor;
import citas.builder.DoctorBuilder;

public class DoctorSingletonFactoryTest {
	Doctor doctor;
	Doctor doctor2;


	@Before
	public void Before() {
		doctor = new DoctorBuilder(2, "Cabecera").cost(20).build();
		doctor2 = new DoctorBuilder(1, "Cabecera").cost(20).build();

	}

	@Test
	public void testGetDoctor() {

		DoctorSingletonFactory.getDoctorSingletonFactory().setDoctor(doctor);

		assertEquals(true, DoctorSingletonFactory.getDoctorSingletonFactory().getDoctor(doctor));
	}

	@Test
	public void testGetDoctorFactorySize() {
		DoctorSingletonFactory.getDoctorSingletonFactory().setDoctor(doctor2);

		assertEquals(1, DoctorSingletonFactory.getDoctorSingletonFactory().getDoctorFactorySize());

	}

	@Test
	public void testRemoveDoctor() {

		DoctorSingletonFactory.getDoctorSingletonFactory().removeDoctor("2");

		assertEquals(false, DoctorSingletonFactory.getDoctorSingletonFactory().getDoctor(doctor));

	}

	@Test
	public void testGetdoctorSingletonFactory() {
		assertEquals(DoctorSingletonFactory.getDoctorSingletonFactory(),DoctorSingletonFactory.getDoctorSingletonFactory());
	}

}
