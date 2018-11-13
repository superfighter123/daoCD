package DaoTest.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OvChipkaartDao {
	public ArrayList<OvChipkaart> GetOvChipkaartFromReiziger(Reiziger r1) throws SQLException;
	public boolean SetOvChipkaart (OvChipkaart o1) throws SQLException;
	public boolean DeleteOvChipkaart(OvChipkaart o1) throws SQLException; 
	public boolean DeleteOvChipkaartenFromReiziger(Reiziger r1) throws SQLException;

}
