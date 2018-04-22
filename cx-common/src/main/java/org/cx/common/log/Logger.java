package org.cx.common.log;

public interface Logger {
	
	public String getName();

	public void debug(String msg);

	public void debug(String format, Object... args);
	
	public boolean isDebugEnabled();
	
	public void trace(String msg);
	
	public void trace(String format, Object... args);
	
	public boolean isTraceEnabled();

	public void info(String msg);

	public void info(String format, Object... args);
	
	public boolean isInfoEnabled();

	public void warn(String msg);

	public void warn(String format, Object... args);
	
	public boolean isWarnEnabled();

	public void error(String msg);
	
	public void error(String format, Object... args);
	
	public void error(Exception ex);
	
	public void error(String msg, Exception ex);
	
	public boolean isErrorEnabled();

}
