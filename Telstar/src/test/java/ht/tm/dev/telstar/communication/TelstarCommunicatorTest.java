package ht.tm.dev.telstar.communication;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import ht.tm.dev.telstar.connector.TelstarConnector;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelstarCommunicatorTest {

	TelstarCommunicator telstarCommunicator;
	TelstarConnector connection;

	@Before
	public void setup() {
		BasicConfigurator.configure();
		telstarCommunicator = new TelstarCommunicator();
		connection = new TelstarConnector("canco.uk", 80);
	}

	@Test
	public void testTelstarAttachToSocket() {
		connection.establishConnection();
		telstarCommunicator.attachToSocket(connection.getConnection());
		teardown();
		telstarCommunicator.attachToSocket(new Socket());
	}

	@Test
	public void testTelstarRead() {
		connection.establishConnection();
		telstarCommunicator.attachToSocket(connection.getConnection());
		telstarCommunicator.sendCommand("GET");
		assertNotNull("TELSTAR OBJECT SHOULD CONTAIN BAD REQUEST DETAILS", telstarCommunicator.read());
	}

	@After
	public void teardown() {
		connection.closeConnection();
	}

}
