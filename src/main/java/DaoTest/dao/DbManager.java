package DaoTest.dao;

import java.sql.SQLException;

public class DbManager {
	OvChipkaartDaoImpl odao;
	ReizigerOracleDaoImpl rdao;

	public DbManager(OvChipkaartDaoImpl odao, ReizigerOracleDaoImpl rdao) throws SQLException {

		this.rdao = rdao;
		this.odao = odao;

	}

	public void deleteovchipkaart() {

	}

	public void deleteReiziger(Reiziger r1) throws SQLException {

		if (r1.getNaam() != "eelke") {
			rdao.delete(r1);

		}
	}

	public void saveReiziger(Reiziger r1) throws SQLException {
		rdao.save(r1);

	}
}
