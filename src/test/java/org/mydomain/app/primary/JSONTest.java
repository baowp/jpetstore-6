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

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;

import org.junit.Assert;
import org.junit.Test;
import org.mybatis.jpetstore.domain.Category;

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

	@Test
	public void testSerializable() {
		Category category = new Category();
		JSON json = JSONSerializer.toJSON(category);
		System.out.println(json);
	}
}
