package DaoTest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleBaseDAO {
	// Zorg ter voorbereiding dat je ojdbc.jar download en toevoegt aan je project.

	// Aanmaken van de variabelen die je connectie specificeren. In dit geval een
	// gebruiker "harry" met password "harry"
//	private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
//	private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xe";
//	private static final String DB_USER = "P2";
//	private static final String DB_PASS = "hallo";
//	private static Connection conn;
	
	protected static Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:sqlite:sample.db");
	}
}
