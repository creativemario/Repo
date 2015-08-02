package uk.co.reformtheempire.games.minesweeper.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import uk.co.reformtheempire.games.minesweeper.board.Board;
import uk.co.reformtheempire.games.minesweeper.board.BoardFactory;
import uk.co.reformtheempire.games.minesweeper.commands.CommandExecutor;
import ch.mather.quicklogger.impl.Logger;
import ch.mather.quicklogger.impl.LoggerFactory;

public class Minesweeper {

	public static Board BOARD = null;
	public static boolean gameOver = false;

	private static final Logger LOG = LoggerFactory.getLogger("u.c.r.g.m.m.Minesweeper");

	public static void main(String[] args) {
		final Minesweeper minesweeper = new Minesweeper();
		try {
	        BOARD = BoardFactory.generateBoard(10, 10, 10);
	        minesweeper.run();
        } catch (final Exception e) {
	        LOG.error("Error Generating Board", e);
        }
	}

	public void run() {

		while (gameOver == false) {
			LOG.info("BOARD: \n" + BOARD.toDebugString());
			System.out.println("Enter Command : ");

			try {
				final BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
				final String command = bufferRead.readLine();

				CommandExecutor.runCommand(command);

			} catch (final IOException e) {
				LOG.error("Error Parsing Command", e);
			}
		}

	}

}
