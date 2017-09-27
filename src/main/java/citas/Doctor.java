package citas;

import java.util.ArrayList;

public class Doctor {

	private int id;
	private String speciality;
	private double cost;
	private ArrayList<Appointmen> apoimentList;
	private Level level;

	public Doctor(int id, String speciality) {
		apoimentList = new ArrayList<>();
		this.id = id;
		this.speciality = speciality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		assert id > 0;
		this.id = id;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public ArrayList<Appointmen> getApoimentList() {
		return apoimentList;
	}

	public void setApoimentList(ArrayList<Appointmen> apoimentList) {
		this.apoimentList = apoimentList;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	public void addApoiment(Appointmen appointmen){
		apoimentList.add(appointmen);
		
	}

}
