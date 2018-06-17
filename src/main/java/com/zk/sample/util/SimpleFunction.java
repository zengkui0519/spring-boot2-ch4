package com.zk.sample.util;

import org.beetl.core.Context;
import org.beetl.core.Function;
import org.springframework.stereotype.Component;

@Component
public class SimpleFunction implements Function {

	public Object call(Object[] paras, Context ctx) {
		return "hi";
	}

}
