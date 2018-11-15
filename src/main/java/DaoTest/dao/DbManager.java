package DaoTest.dao;

import java.sql.SQLException;

public class DbManager {
	OvChipkaartDaoImpl odao;
	ReizigerOracleDaoImpl rdao;

	public DbManager(OvChipkaartDaoImpl odao, ReizigerOracleDaoImpl rdao) throws SQLException {

		this.rdao = rdao;
		this.odao = odao;

	}

	public void deleteovchipkaart(OvChipkaart o1) throws SQLException {
		odao.DeleteOvChipkaart(o1);

	}

	public void deleteReiziger(Reiziger r1) throws SQLException {

		if (r1.getNaam() != "eelke") {
			boolean result = rdao.delete(r1);
			if(result == false) {
				System.out.println("failed");
				throw new IllegalAccessError("return value indicates failure");
			}

		}
	}

	public void saveReiziger(Reiziger r1) throws SQLException {
		rdao.save(r1);

	}
}
