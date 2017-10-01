package citas.composite;

import citas.Doctor;

public class DoctorLeaf extends DoctorComponent {

	private Doctor doctor;
	
	public DoctorLeaf(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String view() {
		return "ID: "+this.doctor.getId();
	}

}
