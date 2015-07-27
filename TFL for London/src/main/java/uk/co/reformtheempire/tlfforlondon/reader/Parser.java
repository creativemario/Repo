package uk.co.reformtheempire.tlfforlondon.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import uk.co.reformtheempire.tlfforlondon.xml.objects.Station;
import ch.mather.quicklogger.impl.Logger;
import ch.mather.quicklogger.impl.LoggerFactory;

public class Parser {

	public ArrayList<Station> parse() {
		Logger LOG = LoggerFactory.getLogger(this);

		LOG.info("Parsing XML File");

		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("src/test/resources/livecyclehireupdates.xml");

		try {

			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			List<Element> list = rootNode.getChildren("station");
			
			ArrayList<Station> stationArrayList = new ArrayList<Station>();
			
			for (int i = 0; i < list.size(); i++) {

				Element stationElement = (Element) list.get(i);
				
				stationArrayList.add(new Station(stationElement));
				
			}

			return stationArrayList;
			
		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}

		return null;

	}

}
