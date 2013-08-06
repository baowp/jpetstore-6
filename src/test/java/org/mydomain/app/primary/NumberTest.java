/**
 * Project: jpetstore-6
 * 
 * File Created at Jul 15, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package org.mydomain.app.primary;

import java.util.Random;

import org.junit.Test;

/**
 * @author baowp
 * 
 */
public class NumberTest {

	@Test
	public void testSample() {
		Random r = new Random();
		String activation = Integer.toString(Math.abs(r.nextInt()), 36);
		System.out.println(r);
		System.out.println(activation);
		System.out.println(0.1 + 0.2);
	}
}
