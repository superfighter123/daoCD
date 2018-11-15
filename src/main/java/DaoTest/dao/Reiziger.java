package DaoTest.dao;

import java.sql.Date;

public class Reiziger {
	private String naam;
	private String gbdatum;
	
	public Reiziger(String nm, String gb) {
		naam = nm;
		gbdatum = gb;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String nm) {
		naam = nm;
	}
	
	public String getGBdatum() {
		return gbdatum;
	}
	
	public void setGBdatum(String gb) {
		gbdatum = gb;
	}
	public String toString(){
		return naam + gbdatum;
	}
}
