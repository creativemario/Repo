package ch.mather.quicklogger.api;

public interface LoggerIF {
	
	public void info(String message);
	
	public void debug(String message);
	
	public void error(String error);
	public void error(String error, Exception e);
}
