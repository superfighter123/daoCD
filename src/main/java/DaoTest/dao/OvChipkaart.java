package DaoTest.dao;

public class OvChipkaart {
	private String abbonement;
	private Reiziger reiziger;
	
	public OvChipkaart(String abbonement1,Reiziger reiziger1) {
		reiziger = reiziger1;
		abbonement = abbonement1;
		
		
		
	}

	public String getAbbonement() {
		return abbonement;
	}

	public void setAbbonement(String abbonement) {
		this.abbonement = abbonement;
	}

	public Reiziger getReiziger() {
		return reiziger;
	}

	public void setReiziger(Reiziger reiziger) {
		this.reiziger = reiziger;
	}

}
