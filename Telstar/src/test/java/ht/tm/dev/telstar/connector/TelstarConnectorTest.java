package ht.tm.dev.telstar.connector;

import static org.junit.Assert.*;
import ht.tm.dev.telstar.connector.TelstarConnector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelstarConnectorTest {

	TelstarConnector telstarConnector;
	
	@Before
	public void setup(){
		telstarConnector = new TelstarConnector("5.9.155.57", 80);
	}
	
	@Test
	public void testTelstarConnector(){
		telstarConnector.setHost("isalive.tm.ht");
		telstarConnector.setPort(80);	
		
		telstarConnector.establishConnection();
		
		assertEquals("isalive.tm.ht", telstarConnector.getHost());
		assertEquals(80, telstarConnector.getPort());
		
		telstarConnector.getConnection();
		assertEquals("isalive.tm.ht/5.9.155.57:80", telstarConnector.getConnection().getRemoteSocketAddress().toString());
		assertEquals(80, telstarConnector.getConnection().getPort());
		
	}
	
	@Test
	public void testTelstarFailures(){
		//Will handle the exception, if it fails then the method has exited.
		telstarConnector.establishConnection();
		teardown();
		telstarConnector.getConnection();
	}

	@After
	public void teardown(){
		telstarConnector.closeConnection();
	}
}
