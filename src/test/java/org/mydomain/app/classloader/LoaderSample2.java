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

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author baowp
 * 
 */
public class LoaderSample2 {
	public static void main(String[] args) {
		try {
			String path = System.getProperty("user.dir");
			URL[] us = { new URL("file://" + path
					+ "/src/main/java/com/iteye/baowp/classloader") };
			ClassLoader loader = new URLClassLoader(us);
			Class<?> c = loader.loadClass("LoaderSample4");
			Object o = c.newInstance();
			Field f = c.getField("age");
			int age = f.getInt(o);
			System.out.println(" age is  " + age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
