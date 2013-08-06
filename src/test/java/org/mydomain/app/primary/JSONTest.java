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

import net.sf.json.JSONObject;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author baowp
 *
 */
public class JSONTest {
	@Test
	public void testJSONObject() {

		byte b = (byte) 0x80;
		Assert.assertEquals(b, -128);
	}
}
