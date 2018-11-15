package DaoTest.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReizigerOracleDaoImpl extends OracleBaseDAO implements ReizigerDao {
	private Connection conn;

	public List<Reiziger> findAll() throws SQLException {
		Connection conn = super.getConnection();
		String query = "select * from reiziger";

		Statement stmt = conn.createStatement();
		ResultSet r = stmt.executeQuery(query);

		ArrayList<Reiziger> lijst = new ArrayList<Reiziger>();
		while (r.next()) {
			String naam = r.getString("naam");
			String gbdatum = r.getString("gbdatum");
			System.out.println(naam + ", " + gbdatum);
			Reiziger reiziger = new Reiziger(naam, gbdatum);
			lijst.add(reiziger);
		}
		return lijst;
	}

	public List<Reiziger> findByGBdatum(String GBdatum) throws SQLException {
		Connection conn = super.getConnection();
		String query = "select * from reiziger where gbdatum = ?";
		PreparedStatement p = conn.prepareStatement(query);

		p.setString(1, GBdatum);
		ResultSet r = p.executeQuery();

		ArrayList<Reiziger> lijst = new ArrayList<Reiziger>();
		while (r.next()) {
			String naam = r.getString("naam");
			String gbdatum = r.getString("gbdatum");
			System.out.println(naam + ", " + gbdatum);
			Reiziger reiziger = new Reiziger(naam, gbdatum);
			lijst.add(reiziger);
		}
		return lijst;
	}

	public Boolean save(Reiziger reiziger) throws SQLException {
		Connection conn = super.getConnection();
		String query = "insert into reiziger (naam, gbdatum) values (?,?)";
		PreparedStatement p = conn.prepareStatement(query);
		p.setString(1, reiziger.getNaam());
		p.setString(2, reiziger.getGBdatum());
		p.executeUpdate();

		query = "select * from reiziger where naam = ? and gbdatum = ?";
		p = conn.prepareStatement(query);

		p.setString(1, reiziger.getNaam());
		p.setString(2, reiziger.getGBdatum());
		ResultSet r = p.executeQuery();

		String naam = r.getString("naam");
		String gbdatum = r.getString("gbdatum");
		System.out.println(naam + ", " + gbdatum);
		Reiziger r1 = new Reiziger(naam, gbdatum);
		conn.close();
		
		return true;

	}

	public Reiziger update(Reiziger reiziger) {
		
		
		return null;
		
	}

	public boolean delete(Reiziger reiziger) throws SQLException {
		Connection conn = super.getConnection();
		String query = "delete from reiziger where naam = ? and gbdatum = ?";
		PreparedStatement p = conn.prepareStatement(query);
		p.setString(1, reiziger.getNaam());
		p.setString(2, reiziger.getGBdatum());
		p.executeUpdate();

		query = "select * from reiziger where naam = ? and gbdatum = ?";
		p = conn.prepareStatement(query);

		p.setString(1, reiziger.getNaam());
		p.setString(2, reiziger.getGBdatum());
		 p.executeQuery();

	
		
		return true;
	}
}
