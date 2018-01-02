package cintax;

import java.util.List;

public class Allergie {
	private String alargyName;
	private Seviarity seviarity;
	
	public Seviarity getSeviarity() {
		return seviarity;
	}
	
	public void setSeviarity(Seviarity seviarity) {
		this.seviarity = seviarity;
	}
	
	public String getAlargyName() {
		return alargyName;
	}
	
	public void setAlargyName(String alargyName) {
		this.alargyName = alargyName;
	}
	
}
