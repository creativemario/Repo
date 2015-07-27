package uk.co.reformtheempire.tlfforlondon.main;

import java.util.ArrayList;

import uk.co.reformtheempire.tlfforlondon.reader.Parser;
import uk.co.reformtheempire.tlfforlondon.xml.objects.Station;
import ch.mather.quicklogger.impl.Logger;
import ch.mather.quicklogger.impl.LoggerFactory;

public class TFLForLondonStandalone {

	public static void main(String args[]){
		TFLForLondonStandalone main = new TFLForLondonStandalone();
		main.run();
		
		
		
	}
	
	public void run(){
		Logger LOG = LoggerFactory.getLogger(this);
		
		Parser parser = new Parser();
		long startTime = System.nanoTime();
		ArrayList<Station> stations = parser.parse();
		long endTime = System.nanoTime();
		for (Station station : stations) {
	        LOG.debug(station.toString());
        }
		LOG.debug("Time taken: " + (endTime - startTime)/1000000 + " ms");
	}
}
