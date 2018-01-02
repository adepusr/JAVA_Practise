package cintax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    public static void main(String args[]){
    	Map<String,Patient> mp = new HashMap<String, Patient>();
    	Patient p= new Patient();
    	p.setName("Sravan");
    	List<Allergie> al = new ArrayList<Allergie>();
    	Allergie a = new Allergie();
    	a.setAlargyName("feaver");
    	a.setSeviarity(Seviarity.HIGH);
    	al.add(a);
    	Allergie a1 = new Allergie();
    	a1.setAlargyName("cold");
    	a1.setSeviarity(Seviarity.MEDIUM);
    	al.add(a1);
    	p.setAllergy(al);
    	Map<Integer, Disease> m= new HashMap<Integer, Disease>();
    	Disease d = new Disease();
    	d.setName("Cancer");
    	d.setSymptoms(al);
    	m.put(1,d);
    	p.setDisease(m);
    	mp.put(p.getName(), p);
    	
    	System.out.println(p.getName());
    	System.out.println(p.getAllergy().get(0).getAlargyName());
    	System.out.println(p.getAllergy().get(0).getSeviarity());
    	System.out.println(p.getDisease());
    	System.out.println(mp);
    }
}
