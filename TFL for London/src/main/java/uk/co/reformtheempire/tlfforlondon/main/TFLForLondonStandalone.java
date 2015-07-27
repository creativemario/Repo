package uk.co.reformtheempire.tlfforlondon.main;

import uk.co.reformtheempire.tlfforlondon.reader.Parser;
import ch.mather.quicklogger.impl.Logger;
import ch.mather.quicklogger.impl.LoggerFactory;

public class TFLForLondonStandalone {

	public static void main(String args[]){
		TFLForLondonStandalone main = new TFLForLondonStandalone();
		main.run();
		
		Parser parser = new Parser();
		parser.parse();
	}
	
	public void run(){
		Logger LOG = LoggerFactory.getLogger(this);
		LOG.info("Hello World!");
	}
}
