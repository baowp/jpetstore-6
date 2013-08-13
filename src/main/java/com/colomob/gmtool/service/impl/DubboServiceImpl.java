/**
 * Project: jpetstore-6
 * 
 * File Created at Aug 12, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package com.colomob.gmtool.service.impl;

import org.springframework.stereotype.Service;

import com.colomob.shared.gmtool.service.DubboService;

/**
 * @author baowp
 * 
 */
@Service("dubboService")
public class DubboServiceImpl implements DubboService {

	public String hello(String name) {
		System.out.println(name);
		return name;
	}

}
