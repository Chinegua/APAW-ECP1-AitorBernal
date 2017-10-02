package citas.composite;

import java.util.ArrayList;
import java.util.List;

public class DoctorComposite extends DoctorComponent{
	String name;
	private List<DoctorComponent> doctorList;
	
	public DoctorComposite(String name, DoctorComponent doctorComponent){
		this.name = name;
		this.doctorList = new ArrayList<>();
		this.add(doctorComponent);
		
	}

    public void add(DoctorComponent doctorComponent) {
        assert doctorComponent != null;
        doctorList.add(doctorComponent);
    }


	@Override
	public String view() {
		return this.name;
	}
}
