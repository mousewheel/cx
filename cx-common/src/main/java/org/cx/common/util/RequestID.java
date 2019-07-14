package org.cx.common.util;

import java.util.UUID;

/**
 *  请求唯一性标识
 * @author shawn
 *
 */
public class RequestID {
	
	private static final ThreadLocal<String> REQUEST_ID = new InheritableThreadLocal<String>();

	private static String genId() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}

	public static void set(String rid) {
		String uuid;
		if (null == rid) {
			uuid = genId();
		} else {
			uuid = rid;
		}

		REQUEST_ID.set(uuid + " ");
	}

	public static void unset() {
		REQUEST_ID.remove();
	}

	public static String get() {
		String uuid = REQUEST_ID.get();
		if (null == uuid || uuid.trim().length() == 0) {
			set(null);
		}
		return REQUEST_ID.get();
	}
}
