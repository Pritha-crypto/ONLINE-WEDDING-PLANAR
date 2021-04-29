package com.WedApp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wedapp.UserManager;

public class UserLoginTestCase {

	// Test Cases for display Users

	/**
	 * This method used to display all the stored Users
	 */
	@Test
	public void test1() {
		UserManager.displayAllUsers();
	}

	// TestCases for login

	/**
	 * Testing with correct stored username and password It should return true as
	 * the userName and passWord already added
	 */
	@Test
	public void test2() {
		UserManager.addUser("pritha", "123");
		boolean valid = UserManager.login("pritha", "123");
		// assertExpected(actual)
		assertTrue(valid);
	}

	/**
	 * Testing with incorrect username and password It should return false as the
	 * userName and passWord not yet added
	 */

	@Test
	public void test3() {
		UserManager.addUser("gracewed", "7172");
		boolean valid = UserManager.login("grace", "71");
		// assertExpected(actual)
		assertFalse(valid);
	}

	// TestCases for searchDetails()

	/**
	 * Testing with stored username and password It should return true as the
	 * userName and passWord already added in test(3)
	 */
	@Test
	public void test4() {
		boolean valid = UserManager.searchDetails("gracewed", "7172");
		// assertExpected(actual)
		assertTrue(valid);
	}

	/**
	 * Testing with unstored username and password It should return false as the
	 * userName and passWord not yet stored
	 */
	@Test
	public void test5() {
		boolean valid = UserManager.searchDetails("karthi", "kart7172");
		// assertExpected(actual)
		assertFalse(valid);
	}

	// Test cases for addUser

	/**
	 * Testing with new username and password It should return false as the userName
	 * and passWord not yet added
	 */
	@Test
	public void test6() {
		boolean valid = UserManager.addUserStatus("karthi", "kart7172");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/**
	 * Testing with existing username and password It should return true as the
	 * userName and passWord gets added
	 */
	@Test
	public void test7() {
		boolean valid = UserManager.addUserStatus("gracewed", "7172");
		// assertExpected(actual)
		assertTrue(valid);
	}

	// Test cases for delUser

	/**
	 * Testing with existing username and password It should True as the userName
	 * and passWord gets deleted already
	 */
	@Test
	public void test8() {
		UserManager.delUser("gracewed", "7172");
		boolean valid = UserManager.delUserStatus("gracewed", "7172");
		// assertExpected(actual)
		assertTrue(valid);
	}

	/**
	 * Testing with deleted username and password It should return True as the
	 * userName and passWord not in the list
	 */
	@Test
	public void test9() {
		UserManager.delUser("pritha", "123");
		boolean valid = UserManager.delUserStatus("grace", "717");
		// assertExpected(actual)
		assertTrue(valid);
	}

	// TestCases for updateUserName

	/**
	 * Testing with existing username and password It should return false as the
	 * given oldusername gets updated and it is not in the list.
	 */
	@Test
	public void test10() {
		UserManager.addUser("gracewed", "7172");
		UserManager.updUserName("gracewed", "gracewedding", "7172");
		boolean valid = UserManager.updUserNameStatus("gracewed");
		// assertExpected(actual)
		assertFalse(valid);
	}

	// here the gracewed username changes to gracewedding username

	/**
	 * Testing with new username and password It should return true as the given
	 * updateduserName gets updated and it is in the list.
	 */
	@Test
	public void test11() {
		UserManager.addUser("gracewed", "7172");
		UserManager.updUserName("gracewed", "gracewedding", "7172");
		boolean valid = UserManager.updUserNameStatus("gracewedding"); // checking whether the gracewedding is updated.
		// assertExpected(actual)
		assertTrue(valid);
	}

	// TestCases for updatePassWord

	/**
	 * Testing with existing username and password It should return false as the
	 * given oldusername gets updated and it is not in the list.
	 */
	@Test
	public void test12() {
		UserManager.addUser("gracewed", "7172");
		UserManager.updUserPass("7172", "717273", "gracewed");
		boolean valid = UserManager.updUserPassStatus("7172");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/**
	 * Testing with new username and password It should return false as the given
	 * updateduserName gets updated and it is in the list.
	 */
	@Test
	public void test13() {
		UserManager.addUser("gracewed", "7172");
		UserManager.updUserPass("7172", "717273", "gracewed");
		boolean valid = UserManager.updUserPassStatus("717273");
		// assertExpected(actual)
		assertFalse(valid);
	}

}
