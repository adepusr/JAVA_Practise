package cintax;

import java.util.List;
import java.util.Map;

public class Patient {
	private String name;
	private List<Allergie> allergy;
	private Map<Integer,Disease> disease;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Allergie> getAllergy() {
		return allergy;
	}
	public void setAllergy(List<Allergie> allergy) {
		this.allergy = allergy;
	}
	public Map<Integer,Disease> getDisease() {
		return disease;
	}
	public void setDisease(Map<Integer,Disease> disease) {
		this.disease = disease;
	}
	

}
