package uk.co.reformtheempire.games.interfaces.text;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class CommandInterpretor {

	public static ArrayList<String> getCommands(final String commands) {

		ArrayList<String> commandList = new ArrayList<String>();
		
		String[] commandArray = StringUtils.split(commands, " ");
		
		for (int i = 0; i < commandArray.length; i++) {
			commandList.add(commandArray[i]);
		}
	
		return commandList;
	}

}
