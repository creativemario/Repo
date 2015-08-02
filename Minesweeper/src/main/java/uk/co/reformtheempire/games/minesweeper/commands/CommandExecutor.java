package uk.co.reformtheempire.games.minesweeper.commands;

import org.apache.commons.lang3.StringUtils;

import uk.co.reformtheempire.games.minesweeper.main.Minesweeper;

public class CommandExecutor {

	public static void runCommand(String command) {

		final String[] choppedCommand = StringUtils.split(command, " ");

		if (choppedCommand[0].equalsIgnoreCase("search")) {

		} else if (choppedCommand[0].equalsIgnoreCase("flag")) {
			Minesweeper.BOARD.getCell(choppedCommand[1], choppedCommand[2]).setFlagged(!Minesweeper.BOARD.getCell(choppedCommand[1], choppedCommand[2]).hasFlag());
		} else if (choppedCommand[0].equalsIgnoreCase("exit")){
			System.exit(0);
		}

	}

}
