package ht.tm.dev.telstar.communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Basic TELNET communication system.
 * 
 * Originally used for WHOIS lookup project
 * 
 * @author Thomas Mather
 *
 */
public class TelstarCommunicator {
	private Logger log;
	private PrintWriter systemOut;
	private BufferedReader systemIn;
	
	/**
	 * Initialise the TelnetCommunicator
	 */
	public TelstarCommunicator() {
		log = LoggerFactory.getLogger(TelstarCommunicator.class);
		systemOut = null;
		systemIn = null;
	}
	
	/**
	 * Attach the TelnetCommunicator to a socket.
	 *
	 *Sets systemOut to the socket's output stream
	 *Sets systemIn to the socket's input stream
	 *
	 * @param socket - a socket that has been connected to a TELNET server
	 */
	public boolean attachToSocket(Socket socket) {
		try {
			systemOut = new PrintWriter(socket.getOutputStream(), true);
			systemIn = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			return true;
		} catch (IOException e) {
			log.error("Failed to attach to socket");
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Send a command to the connected TELNET server
	 * 
	 * @param command - The command
	 */
	public void sendCommand(String command) {
		log.info("Sending Command: " + command);
		System.out.println("Command Sent");
		systemOut.println(command);
		log.info("Command Sent");
	}
	
	/**
	 * Read from the TELNET server.
	 * best used directly after a command.
	 * @return TELNET server response
	 */
	public String read() {
		String message;
		StringBuilder response = new StringBuilder();
		try {
			while ((message = systemIn.readLine()) != null) {
				response.append(message + "\n");
			}
		} catch (IOException e) {
			log.error("Cannot read from server");
			e.printStackTrace();
		}
		message = response.toString();
		log.info("Response is: \n" + message);
		return message;
	}

}
