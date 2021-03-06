/**
 * Project: jpetstore-6
 * 
 * File Created at Sep 17, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package org.mydomain.app.classloader;

import java.io.InputStream;

import org.junit.Test;

/**
 * @author baowp
 * @see http://www.blogjava.net/mstar/archive/2012/12/14/65505.html
 */
public class LoaderSample1 {

	@Test
	public void main() {
		Class<?> c;
		ClassLoader cl;
		cl = ClassLoader.getSystemClassLoader();
		System.out.println(cl);
		System.out
				.println(Thread.currentThread().getContextClassLoader() == cl);
		while (cl != null) {
			cl = cl.getParent();
			System.out.println(cl);
		}
		try {
			c = Class.forName("java.lang.Object");
			cl = c.getClassLoader();
			System.out.println(" java.lang.Object's loader is  " + cl);
			c = Class.forName("org.mydomain.app.classloader.LoaderSample1");
			cl = c.getClassLoader();
			System.out.println(" LoaderSample1's loader is  " + cl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test1() {
		InputStream is = ClassLoader
				.getSystemResourceAsStream("org/mydomain/app/classloader/classes.dex");
		System.out.println(is);
	}
}
