package uk.co.reformtheempire.games.minesweeper.board;

import java.util.Random;

import uk.co.reformtheempire.games.minesweeper.error.exception.MisshapenBoardException;
import uk.co.reformtheempire.games.minesweeper.error.exception.TooManyMinesException;
import ch.mather.quicklogger.impl.Logger;
import ch.mather.quicklogger.impl.LoggerFactory;

public class BoardFactory {

	private static final Logger LOG = LoggerFactory.getLogger("u.c.r.g.m.b.BoardFactory");

	public static Board generateBoard(int x, int y, int mineCount) throws TooManyMinesException, MisshapenBoardException {
		if (x != y) {
			throw new MisshapenBoardException("Cannot make a board that is not a square.");
		}
		final Cell[][] board = new Cell[y][x];
		LOG.info("Generating Board with X = " + x + " & Y = " + y);

		for (int cellY = 0; cellY < y; cellY++) {
			for (int cellX = 0; cellX < x; cellX++) {
				board[cellY][cellX] = new Cell();
			}
		}

		seedMines(board, mineCount);

		final Board boardToReturn = new Board(board);

		setCellNumbers(boardToReturn, x, y);

		return boardToReturn;
	}

	private static void setCellNumbers(Board board, int x, int y) {
		x--;
		y--;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				int cellValue = 0;

				if (i != 0 && j != 0) {
					// NW
					if (board.getCell(j - 1, i - 1).hasMine()) {
						cellValue++;
					}
				}

				if (i != 0 && j != x) {
					// NE
					if (board.getCell(j + 1, i - 1).hasMine()) {
						cellValue++;
					}
				}

				if (i != y && j != 0) {
					// SW
					if (board.getCell(j - 1, i + 1).hasMine()) {
						cellValue++;
					}
				}

				if (i != y && j != x) {
					// SE
					if (board.getCell(j + 1, i + 1).hasMine()) {
						cellValue++;
					}
				}
				
				if(i != 0){
					// N
					if(board.getCell(j, i - 1).hasMine()){
						cellValue++;
					}
				}
				
				if(i != y){
					// S
					if(board.getCell(j, i + 1).hasMine()){
						cellValue++;
					}
				}
				
				if(j != x){
					// E
					if(board.getCell(j + 1, i).hasMine()){
						cellValue++;
					}
				}
				
				if(j != 0){
					// W
					if(board.getCell(j - 1, i).hasMine()){
						cellValue++;
					}
				}

				board.getCell(j, i).setCellValue(cellValue);
			}
		}
	}

	private static void seedMines(Cell[][] board, int mineCount) throws TooManyMinesException {
		if(mineCount > board.length * board.length){
			LOG.error("TOO MANY MINES");
			throw new TooManyMinesException("Total Mines: " + mineCount + " whereas Total Cells: " + (board.length * board.length));
		}
		final Random r = new Random();

		for (int i = 0; i < mineCount; i++) {

			int x = r.nextInt(board.length);
			int y = r.nextInt(board.length);

			while (board[y][x].hasMine()) {
				x = r.nextInt(board.length);
				y = r.nextInt(board.length);
			}

			board[y][x].setMine();

			LOG.debug(y + " " + x);

		}

	}

}
