package DaoTest.dao;

import java.sql.SQLException;
import java.util.List;

public class Main {
	public static void main(String[] args) throws SQLException {
		String gbdatum = "01-01-2001";
		String naam = "henk2";
		Reiziger r1 = new Reiziger(naam, gbdatum);
		ReizigerDao rdao = new ReizigerOracleDaoImpl();
		rdao.delete(r1);
		rdao.save(r1); 
		System.out.println(rdao.findByGBdatum(gbdatum));

		// test ovchipkaart

		OvChipkaart o1 = new OvChipkaart("student weekend", r1);
		OvChipkaartDao odao = new OvChipkaartDaoImpl();
		System.out.println(odao.GetOvChipkaartFromReiziger(r1));

	}
}