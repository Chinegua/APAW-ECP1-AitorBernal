package citas.composite;

import java.util.ArrayList;
import java.util.List;

public class DoctorComposite extends DoctorComponent{

	private List<DoctorComponent> doctorList;
	
	public DoctorComposite(DoctorComponent doctorComponent){
		super.name = "DoctorComposite";
		this.doctorList = new ArrayList<>();
		this.add(doctorComponent);
		
	}

    public void add(DoctorComponent doctorComponent) {
        assert doctorComponent != null;
        doctorList.add(doctorComponent);
    }


	@Override
	public String view() {
		return super.name;
	}
}
