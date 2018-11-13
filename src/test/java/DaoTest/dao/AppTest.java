package DaoTest.dao;

import java.sql.SQLException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * @throws SQLException 
     */
    public AppTest( String testName ) throws SQLException
    {
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

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
