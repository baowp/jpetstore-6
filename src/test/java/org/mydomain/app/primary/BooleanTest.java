/**
 * Project: jpetstore-6
 * 
 * File Created at Aug 21, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package org.mydomain.app.primary;

import org.junit.Test;

/**
 * @author baowp
 * 
 */
public class BooleanTest {

	@Test
	public void test() {
		if (checkA() || checkB() && checkC())
			System.out.println("result");
	}

	private boolean checkA() {
		System.out.println("a");
		return false;
	}

	private boolean checkB() {
		System.out.println("b");
		return true;
	}

	private boolean checkC() {
		System.out.println("c");
		return false;
	}
}
