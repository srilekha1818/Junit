package junit.junit_02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;


public class TestCensus {
	private static CensusService service;
	@BeforeAll
	public static void setupOnce() {
		service=new CensusService();
	}
    @Disabled
	@DisplayName("Test Export Dta")
	@RepeatedTest(value=10,name="execution of {displayName}-{currentRepetition}/{totalRepetitions}")
	public  void TestExportedData() {
		System.out.println("Testing the Exported the data");
		CensusService service=new CensusService();
		assertEquals("data exported",service.exportData());
		

	}
    @Disabled
	@ParameterizedTest
	@ValueSource(ints= {10,21,32,87,13})
	public void testisOdd(int data) {
		System.out.println("TestCensus.testisOdd():"+data);
		boolean result=service.isOdd(data);
		assertTrue(result);
		
	}
	
	@ParameterizedTest
	@ValueSource(strings={"sachin","dhoni","ram"})
	@Disabled
	public void testisString(String data) {
		System.out.println("TestCensus.testisString(data):"+data);
		String actual=service.isString(data);
		String expected="hello: "+data;
		assertEquals(expected,actual);
		
		
	}
	@ParameterizedTest
	@NullAndEmptySource
	public void testisNull(String data) {
		assertTrue(service.isEmpty(data));
		
	}
	@AfterAll
	public static void cleanupOnce() {
		service=null;
	}
	

}
