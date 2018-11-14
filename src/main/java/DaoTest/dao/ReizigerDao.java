package DaoTest.dao;

import java.sql.SQLException;
import java.util.List;

public interface ReizigerDao{
	public List<Reiziger> findAll() throws SQLException;
	public List<Reiziger> findByGBdatum(String GBdatum) throws SQLException;
	public Boolean save(Reiziger reiziger)throws SQLException;
	public Reiziger update(Reiziger reiziger)throws SQLException;
	public boolean delete(Reiziger reiziger)throws SQLException;
}
