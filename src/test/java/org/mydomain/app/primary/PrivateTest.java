/**
 * Project: jpetstore-6
 * 
 * File Created at Aug 28, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package org.mydomain.app.primary;

import java.io.Serializable;

/**
 * @author baowp
 * 
 */
public class PrivateTest {

	public static void main(String[] args) {
		A a = new A("a");
		B b = new B("b");
		C c = new C("c");
		System.out.println(a.getString());
		System.out.println(b.getString());
		System.out.println(c.getString());
	}

	public static class A {
		private String string;
		private String string2;

		public A(String str) {
			string = str;
		}

		public String getString() {
			return string;
		}

		public void setString(String string) {
			this.string = string;
		}

	}

	public static class B extends A {

		public B(String str) {
			super(str);
		}

		public <T extends Object> void con(T s) {
		}
	}

	public static class C extends B {

		public C(String str) {
			super(str);
		}

		public <T extends Serializable> void con(T s) {
		}
	}
}
