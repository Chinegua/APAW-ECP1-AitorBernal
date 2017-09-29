package citas.singleton;

import java.util.HashMap;
import java.util.Map;

import citas.Doctor;

public final class DoctorSingletonFactory {

	private Map<Integer, Doctor> doctorFactory;

	private static final DoctorSingletonFactory doctorSingletonFactory = new DoctorSingletonFactory();

	private DoctorSingletonFactory() {
		this.doctorFactory = new HashMap<Integer, Doctor>();

	}
	public boolean getDoctor(Doctor doctor){
		Integer doctorId = new Integer(doctor.getId());
		return this.doctorFactory.get(doctorId) != null;
		
	}
	
	public void setDoctor(Doctor doctor) {
		Integer doctorId = new Integer(doctor.getId());
		if(this.doctorFactory.get(doctorId) == null){
			this.doctorFactory.put(doctorId, doctor);
		}
		else{
	        throw new UnsupportedOperationException( "No se puede añadir el doctor a la factoria" );
		}
	}
	
	public void removeDoctor(String key){
		this.doctorFactory.remove(key);
	}
	public int getDoctorFactorySize(){
		return doctorFactory.size();
	}
	

}
