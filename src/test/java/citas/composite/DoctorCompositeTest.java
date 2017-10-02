package citas.composite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import citas.Doctor;
import citas.builder.DoctorBuilder;

public class DoctorCompositeTest {

	DoctorLeaf doctorLeaf;
	DoctorLeaf doctorLeaf2;

	DoctorComposite doctorComposite;
	DoctorComposite doctorComposite2;
	Doctor doctor;

	@Before
	public void Before() {
		doctor = new DoctorBuilder(2, "Cabecera").build();
		doctorLeaf = new DoctorLeaf(doctor);
		doctorLeaf2 = new DoctorLeaf(doctor);
		doctorComposite = new DoctorComposite("Ginecologo", doctorLeaf);
		doctorComposite2 = new DoctorComposite("Dentista", doctorComposite);

	}

	@Test
	public void testViewComposite() {
		assertEquals("Ginecologo", doctorComposite.view());
	}

	@Test
	public void testViewLeaft() {
		assertEquals("ID: 2", doctorLeaf.view());
	}

	@Test
	public void testaddComposite() {
		doctorComposite.add(doctorLeaf2);
		assertEquals("Ginecologo", doctorComposite.view());
	}

}
