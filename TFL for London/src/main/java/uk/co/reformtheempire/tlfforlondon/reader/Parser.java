package uk.co.reformtheempire.tlfforlondon.reader;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import uk.co.reformtheempire.tlfforlondon.xml.objects.Station;
import ch.mather.quicklogger.impl.Logger;
import ch.mather.quicklogger.impl.LoggerFactory;

public class Parser {

	public Station parse() {
		Logger LOG = LoggerFactory.getLogger(this);

		LOG.info("Parsing XML File");

		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("src/test/resources/livecyclehireupdates.xml");

		try {

			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			List<Element> list = rootNode.getChildren("station");

			for (int i = 0; i < list.size(); i++) {

				Element node = (Element) list.get(i);

				System.out.println("ID : " + node.getChildText("id"));
				System.out.println("Last Name : " + node.getChildText("lastname"));
				System.out.println("Nick Name : " + node.getChildText("nickname"));
				System.out.println("Salary : " + node.getChildText("salary"));

			}

		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}

		return null;

	}

}
