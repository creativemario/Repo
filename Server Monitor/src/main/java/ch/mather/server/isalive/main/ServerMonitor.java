package ch.mather.server.isalive.main;

import ch.mather.server.isalive.monitor.Monitor;



public class ServerMonitor {

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		
		if(!monitor.monitor()){
			// Send email
		}
	}

}
