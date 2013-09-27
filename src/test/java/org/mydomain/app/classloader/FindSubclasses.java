/**
 * Project: jpetstore-6
 * 
 * File Created at Sep 27, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package org.mydomain.app.classloader;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;

/**
 * @author baowp
 * 
 */
public class FindSubclasses implements Serializable {
	@Test
	public void useClassLoadUtil() {
		// ClassLoaderUtil.loadClassesFromPath();
		List<Class<?>> list = ClassLoaderUtil.getSubClasses(Serializable.class);
		for (Class<?> cls : list) {

			System.out.println(cls);
		}
	}

	@Test
	public void useSpringFind() {
		ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(
				true);
		provider.addIncludeFilter(new AssignableTypeFilter(Serializable.class));

		// scan in org.example.package
		Set<BeanDefinition> components = provider
				.findCandidateComponents("org.apache.commons");
		for (BeanDefinition component : components) {
			Class<?> cls = null;
			try {
				cls = Class.forName(component.getBeanClassName());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println(cls.getName());
		}
	}
}
