/**
 * Project: jpetstore-6
 * 
 * File Created at Jul 13, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package org.mydomain.app.primary;

import java.util.Date;

import org.junit.Test;

/**
 * @author baowp
 * 
 */
public class StringTest {

	@Test
	public void testStringFormat() {
		System.out.println(String.format("%2$08d\n%1$ 9d", -3123, -5566));
		System.out.printf("%2$d\n%1$ 9d\n", -3123, -5566);
		System.out.println(String.format("%,d", Integer.MAX_VALUE));
		System.out.println(String.format("%tR", System.currentTimeMillis()));
		System.out.println(String.format("%tD", new Date()));
		System.out.println(String.format("%05d", 123));
		System.out.println(String.format("%1$9d", -31));
		System.out.println(String.format("%1$-9d", -31));
		System.out.println(String.format("%1$(9d", -31));
		System.out.println(String.format("%1$#9x", 5689));

		// 小数点后面两位
		System.out.println(String.format("%1$.2f", 5689.0));
		System.out.printf("50元的书打8.5折扣是：%1.2f元%n", 50 * 0.85);
		String formatter = "%1$s%2$s";
		String value = String.format(formatter, "adf", "24234");
		System.out.println(value);
	}
}
