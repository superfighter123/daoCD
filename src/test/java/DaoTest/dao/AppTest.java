package DaoTest.dao;

import java.sql.SQLException;

import org.mockito.Mockito;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 * 
	 * @throws SQLException
	 */
	public void testApp() throws SQLException {
		// arrange
		OvChipkaartDaoImpl odao = Mockito.mock(OvChipkaartDaoImpl.class);
		ReizigerOracleDaoImpl rdao = Mockito.mock(ReizigerOracleDaoImpl.class);
		DbManager manager = new DbManager(odao, rdao);
		String gbdatum = "01-01-2001";
		String naam = "eelke";
		Reiziger r1 = new Reiziger(naam, gbdatum);
		OvChipkaart o1 = new OvChipkaart("student weekend", r1);
		// act

		manager.deleteReiziger(r1);
		manager.saveReiziger(r1);
		// Assert

		Mockito.verify(rdao).save(r1);
		Mockito.verify(rdao, Mockito.never()).delete(r1);
		Mockito.verifyNoMoreInteractions(rdao);
		
	}
	public void test() {
		
		
		assertEquals("1","1");
	}
}

