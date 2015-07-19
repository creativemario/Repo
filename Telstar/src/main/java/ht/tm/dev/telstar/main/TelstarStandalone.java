package ht.tm.dev.telstar.main;

import ht.tm.dev.telstar.communication.TelstarCommunicator;
import ht.tm.dev.telstar.connector.TelstarConnector;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;

public class TelstarStandalone {

	public static void main(String[] args) throws IOException {

		BasicConfigurator.configure();

		String host = "whois.nic.uk";
		int port = 43;

		TelstarConnector connection = new TelstarConnector(host, port);

		connection.establishConnection();

		TelstarCommunicator communicator = new TelstarCommunicator();

		communicator.attachToSocket(connection.getConnection());

		communicator.sendCommand("bigdisco.co.uk");

		communicator.read();

		connection.closeConnection();

		communicator.read();

	}
}
