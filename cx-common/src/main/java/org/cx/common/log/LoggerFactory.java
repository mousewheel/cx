package org.cx.common.log;

/**
 * 用该类创建Logger，记录日志时会带上请求ID标识
 * @author shawn
 *
 */
public class LoggerFactory {
	
	public static Logger getLogger(String name) {
		org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(name);
		return new Sef4jLogger(logger);
	}

	public static Logger getLogger(Class<?> clazz) {
		org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(clazz);
		return new Sef4jLogger(logger);
	}
}
