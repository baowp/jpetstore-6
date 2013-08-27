/**
 * Project: jpetstore-6
 * 
 * File Created at Aug 27, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package org.mydomain.app.primary;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.Test;

import com.iteye.baowp.utility.MethodParamNamesScaner;

/**
 * @author baowp
 * 
 */

public class MethodParamNamesScanerTest {

	@Test
	public void test() throws SecurityException, NoSuchMethodException {
		Method method = getClass().getMethod("sample", String.class);
		List<String> list = MethodParamNamesScaner.getParamNames(method);
		for (String s : list) {
			System.out.println(s);
		}
	}

	public void sample(String str2) {

	}
}
