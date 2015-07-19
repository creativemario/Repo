package ht.tm.dev.telstar.connector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TelstarConnector {
	
	private Logger log;
	private String host;
	private int port;
	private Socket connection;

	public TelstarConnector(String host, int port) {
		this.host = host;
		this.port = port;
		connection = new Socket();
		log = LoggerFactory.getLogger(TelstarConnector.class);
	}

	public boolean establishConnection() {
		try {
			connection.connect(new InetSocketAddress(host, port));
			log.info("Connected to: " + host + ":" + port);
			return true;
		} catch (IOException e) {
			log.error("Cannot Connect to " + host + ":" + port);
			e.printStackTrace();
			return false;
		}
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Socket getConnection() {
		return connection;
	}

	public void closeConnection() {
		try {
			connection.close();
		} catch (IOException e) {
			log.error("could not close connection");
			e.printStackTrace();
		}
	}

}
