package ch.mather.quicklogger.impl;

import org.apache.commons.lang3.StringUtils;

import ch.mather.quicklogger.impl.Logger;

public class LoggerFactory {

	public static Logger getLogger(Object o) {
		return new Logger(getLoggerClassName(o.getClass().getCanonicalName()));
	}

	private static String getLoggerClassName(String canonicalClassName){
		String[] splitClass = StringUtils.split(canonicalClassName, ".");
		for (int i = 0; i < splitClass.length; i++) {
			if(i == splitClass.length ||i == splitClass.length - 1){
				break;
			}
	        splitClass[i] = StringUtils.substring(splitClass[i], 0,1);
        }
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < splitClass.length; i++) {
			if(i == splitClass.length || i == splitClass.length -1){
				sb.append(splitClass[i]);
			}else{
				sb.append(splitClass[i] + ".");
			}
        }
		return sb.toString();
	}
}
