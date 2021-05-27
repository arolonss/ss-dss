/**
 * 
 */
package com.dss.jb.four;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author arolonss
 *
 */
class DoubleCheckedLockingTest {

	@Test
	void getInstance() {
		assertNotNull(DoubleCheckedLocking.getInstance());
	}

}
