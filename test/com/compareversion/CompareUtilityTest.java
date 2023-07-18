package com.compareversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompareUtilityTest {

	@Test
	void test() {
		CompareUtility compareUtility  = new CompareUtility();		 
		assertEquals(-1, compareUtility.compareVersion("0.1", "1.1"));
		assertEquals(-1, compareUtility.compareVersion("1.1", "1.2"));		
		
		assertEquals(1, compareUtility.compareVersion("1.10", "1.3.4"));
		
		assertEquals(0, compareUtility.compareVersion("1.1", "1.1"));
	}

}
