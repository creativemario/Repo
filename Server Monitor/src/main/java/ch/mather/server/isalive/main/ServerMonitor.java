package ch.mather.server.isalive.main;

import ht.tm.dev.telstar.communication.TelstarCommunicator;
import ht.tm.dev.telstar.connector.TelstarConnector;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerMonitor {

	public static void main(String[] args) {

		System.out.println("Server Monitor 0.0.1");

		Properties props = new Properties();
		FileReader fr = null;
		try {
			fr = new FileReader(new File("service.properties"));

			props.load(fr);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("NO PROPERTIES");
			System.exit(1);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("NO PROPERTIES");
			System.exit(1);
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {

			while (1 == 1) {
				System.out.println("Connecting");
				System.out.println(new Date().toString());

				String host = props.getProperty("servermonitor.hostname");
				int port = Integer.parseInt(props.getProperty("servermonitor.port"));

				TelstarConnector connection = new TelstarConnector(host, port);

				connection.establishConnection();

				TelstarCommunicator communicator = new TelstarCommunicator();

				communicator.attachToSocket(connection.getConnection());

				communicator.sendCommand("GET / HTTP/1.1");
				communicator.sendCommand("host: isalive.tm.ht");
				communicator.sendCommand("");

				System.out.println(communicator.read());

				connection.closeConnection();

				try {
					Thread.sleep(Integer.parseInt(props.getProperty("servermonitor.delay")));
					System.out.println("Ping");
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

		}
	}

}
