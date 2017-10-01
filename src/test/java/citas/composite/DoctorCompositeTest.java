package citas.composite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import citas.Doctor;
import citas.builder.DoctorBuilder;

public class DoctorCompositeTest {

	DoctorLeaf doctorLeaf;
	DoctorComposite doctorComposite;
	DoctorComposite doctorComposite2;
	Doctor doctor;
	
	@Before
	public void Before(){
		doctor = new DoctorBuilder(2,"Cabecera").build();
		doctorLeaf = new DoctorLeaf(doctor);
		doctorComposite = new DoctorComposite(doctorLeaf); 
		doctorComposite2 = new DoctorComposite(doctorComposite);
		
		
	}
	
	@Test
	public void testViewComposite() {
		assertEquals("DoctorComposite",doctorComposite.view());
	}
	@Test
	public void testViewLeaft() {
		assertEquals("ID: 2",doctorLeaf.view());
	}

}
