package uk.co.reformtheempire.tlfforlondon.main;

import ch.mather.quicklogger.impl.Logger;
import ch.mather.quicklogger.impl.LoggerFactory;

public class TFLForLondonStandalone {

	public static void main(String args[]){
		TFLForLondonStandalone main = new TFLForLondonStandalone();
		main.run();
	}
	
	public void run(){
		Logger LOG = LoggerFactory.getLogger(this);
		LOG.info("Hello World!");
	}
}
