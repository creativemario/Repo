package ch.mather.server.isalive.monitor;

import ht.tm.dev.telstar.communication.TelstarCommunicator;
import ht.tm.dev.telstar.connector.TelstarConnector;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import ch.mather.quicklogger.impl.Logger;
import ch.mather.quicklogger.impl.LoggerFactory;

public class Monitor {

	public boolean monitor() {
		Logger LOG = LoggerFactory.getLogger(this);

		LOG.info("Server Monitor 0.0.1");

		Properties props = new Properties();
		FileReader fr = null;
		try {
			fr = new FileReader(new File("service.properties"));

			props.load(fr);
		} catch (FileNotFoundException e) {
			LOG.error("No Properties", e);
			System.exit(1);
		} catch (IOException e) {
			LOG.error("No Properties", e);
			System.exit(1);
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				LOG.error("Couldn't close Properties Reader", e);
			}
		}

		try {

			while (1 == 1) {

				String host = props.getProperty("servermonitor.hostname");
				int port = Integer.parseInt(props.getProperty("servermonitor.port"));

				TelstarConnector connection = new TelstarConnector(host, port);

				connection.establishConnection();

				TelstarCommunicator communicator = new TelstarCommunicator();

				communicator.attachToSocket(connection.getConnection());

				communicator.sendCommand("GET / HTTP/1.1");
				communicator.sendCommand("host: isalive.tm.ht");
				communicator.sendCommand("");

				communicator.read();

				connection.closeConnection();

				try {
					Thread.sleep(Integer.parseInt(props.getProperty("servermonitor.delay")));
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			}
		} catch (Exception e) {

			System.out.println();
			System.out.println();
			System.out.println("********************************************************");
			System.out.println();
			System.out.println("SERVER NOT ALIVE");
			System.out.println("TIME IS: " + new Date().toString());
			System.out.println();
			System.out.println("********************************************************");
			return false;
		}

	}

}
