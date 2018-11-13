package DaoTest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OvChipkaartDaoImpl extends OracleBaseDAO implements OvChipkaartDao {

	
	public ArrayList<OvChipkaart> GetOvChipkaartFromReiziger(Reiziger r1) throws SQLException {
		ArrayList<OvChipkaart> OvChipkaarten = new ArrayList<OvChipkaart>();
		
			
			Connection conn = super.getConnection();
			String query = "select * from ovchipkaart where reiziger_naam = ?";
			PreparedStatement p = conn.prepareStatement(query);
			p.setString(1, r1.getNaam());
			ResultSet r = p.executeQuery();
			while(r.next()) {
				OvChipkaart o = new OvChipkaart(r.getString("abonnement"), r1);
				OvChipkaarten.add(o);}
				
	
		return OvChipkaarten;
	}

	
	public boolean SetOvChipkaart(OvChipkaart o1) throws SQLException {
		Connection conn = super.getConnection();
		String query = "insert into OvChipkaart(reiziger_naam, abonnement) values (?,?)";
		PreparedStatement p = conn.prepareStatement(query);
		p.setString(1, o1.getReiziger().getNaam());
		p.setString(2, o1.getAbbonement());
		p.executeUpdate();
		return true;
	}


	public boolean DeleteOvChipkaart(OvChipkaart o1) throws SQLException {
		Connection conn = super.getConnection();
		String query = "delete from ovchipkaart where reiziger_naam = ? and abonnement = ?";
		PreparedStatement p = conn.prepareStatement(query);
		p.setString(1, o1.getReiziger().getNaam());
		p.setString(2, o1.getAbbonement());
		p.executeUpdate();
		return true;
		
	}


	public boolean DeleteOvChipkaartenFromReiziger(Reiziger r1) throws SQLException {
		Connection conn = super.getConnection();
		String query = "delete from ovchipkaart where reiziger_naam = ?";
		PreparedStatement p = conn.prepareStatement(query);
		p.setString(1, r1.getNaam());
		p.executeUpdate();
		return true;
	} 
	

}
