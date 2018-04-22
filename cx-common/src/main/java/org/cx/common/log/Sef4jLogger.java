package org.cx.common.log;

import java.io.Serializable;

import org.cx.common.util.RequestID;

/***
 * 包装了Sef4j，并加上了请求唯一性标识
 * @author shawn
 *
 */
public class Sef4jLogger implements Logger, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private org.slf4j.Logger impl;
	
	public Sef4jLogger(org.slf4j.Logger impl) {
		this.impl = impl;
	}

	@Override
	public String getName() {
		return impl.getName();
	}

	@Override
	public void debug(String msg) {
		impl.debug(RequestID.get() + msg);
	}

	@Override
	public void debug(String format, Object... args) {
		impl.debug(RequestID.get() + format, args);

	}

	@Override
	public boolean isDebugEnabled() {
		return impl.isDebugEnabled();
	}

	@Override
	public void trace(String msg) {
		impl.trace(RequestID.get() +msg);
	}

	@Override
	public void trace(String format, Object... args) {
		impl.trace(RequestID.get() +format, args);
	}

	@Override
	public boolean isTraceEnabled() {
		return impl.isTraceEnabled();
	}

	@Override
	public void info(String msg) {
		impl.info(RequestID.get() +msg);
	}

	@Override
	public void info(String format, Object... args) {
		impl.info(RequestID.get() +format, args);
	}

	@Override
	public boolean isInfoEnabled() {
		return impl.isInfoEnabled();
	}

	@Override
	public void warn(String msg) {
		impl.warn(RequestID.get() +msg);
	}

	@Override
	public void warn(String format, Object... args) {
		impl.warn(RequestID.get() +format, args);
	}

	@Override
	public boolean isWarnEnabled() {
		return impl.isWarnEnabled();
	}

	@Override
	public void error(String msg) {
		impl.error(RequestID.get() +msg);
	}

	@Override
	public void error(String format, Object... args) {
		impl.error(RequestID.get() +format,args);

	}

	@Override
	public void error(Exception ex) {
		impl.error(RequestID.get(), ex);
	}

	@Override
	public void error(String msg, Exception ex) {
		impl.error(RequestID.get() + msg, ex);

	}

	@Override
	public boolean isErrorEnabled() {
		return impl.isErrorEnabled();
	}

}
