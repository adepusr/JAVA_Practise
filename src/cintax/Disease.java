package cintax;

import java.util.List;

public class Disease {
	private String name;
	private List<Allergie> symptoms;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Allergie> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(List<Allergie> symptoms) {
		this.symptoms = symptoms;
	}
}
