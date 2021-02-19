package time.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import time.Time;

class TimeTest {

	@Test
	void testGetTotalSeconds() {
		int seconds = Time.getTotalSeconds("12:05:05");
		//assertTrue("The seconds were not calculated properly", seconds==43510); //test failed
		assertTrue("The seconds were not calculated properly", seconds==43505); //test success 
//		Assertions.assertThrows(NumberFormatException.class, () -> {
//		    Integer.parseInt("One");
//		  });


	}
	@Test
	void testGetMilliseconds() {
		int milliseconds = Time.getMilliseconds("12:05:05:11");
		
		assertTrue("The milliseconds were not calculated properly", milliseconds==11);
		
	}

}
