package com.WedApp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wedapp.BookingManager;

public class BookingDetailsTestCase {

	/*
	 * This method test with futuredate and futuretime for booking It should return
	 * true
	 */
	@Test
	public void test1() {
		boolean valid = BookingManager.dateTimeValidator("2021-04-30", "11:58:03");
		// assertExpected(actual)
		assertTrue(valid);
	}

	/*
	 * This method test with pastdate and pasttime for booking It should return
	 * false
	 */
	@Test
	public void test2() {
		boolean valid = BookingManager.dateTimeValidator("2021-04-25", "12:59:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with currentdate and currenttime for booking It should
	 * return false
	 */
	@Test
	public void test3() {
		boolean valid = BookingManager.dateTimeValidator("2021-04-28", "03:26:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with futuredate and pasttime for booking It should return
	 * false
	 */
	@Test
	public void test4() {
		boolean valid = BookingManager.dateTimeValidator("2021-04-29", "01:12:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with futuredate and currenttime for booking It should return
	 * false
	 */
	@Test
	public void test5() {
		boolean valid = BookingManager.dateTimeValidator("2021-04-30", "03:27:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with pastdate and futuretime for booking It should return
	 * false
	 */
	@Test
	public void test6() {
		boolean valid = BookingManager.dateTimeValidator("2021-04-24", "04:59:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with pastdate and currenttime for booking It should return
	 * false
	 */
	@Test
	public void test7() {
		boolean valid = BookingManager.dateTimeValidator("2021-04-24", "03:27:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

}
