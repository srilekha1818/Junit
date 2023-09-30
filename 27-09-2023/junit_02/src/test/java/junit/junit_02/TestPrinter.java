package junit.junit_02;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


public class TestPrinter {
	@Test
	public void testSingleton() {
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		//assertNotNull(p1);
		if(p1==null || p2==null) {
			fail("p1,p2 should not be null");
		}
		assertSame(p1,p2);
	}

}
