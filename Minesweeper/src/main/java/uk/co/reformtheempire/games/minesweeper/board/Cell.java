package uk.co.reformtheempire.games.minesweeper.board;

import uk.co.reformtheempire.games.minesweeper.main.Minesweeper;

public class Cell {

	private boolean hasMine;
	private boolean flagged;
	private int cellValue;

	public Cell() {
	}

	public Cell(boolean hasMine) {
		this.hasMine = hasMine;
	}

	public void setMine() {
		this.hasMine = true;
	}

	public void setFlagged(boolean flagged) {
		this.flagged = flagged;
	}

	public void setCellValue(int cellValue){
		this.cellValue = cellValue;
	}
	
	public void click(){
		if(hasMine && !flagged){
			Minesweeper.gameOver = true;
		}
	}
	
	public boolean hasMine() {
		return hasMine;
	}

	public boolean hasFlag() {
		return flagged;
	}

	public String getCell() {
		if (flagged) {
			return "[F]";
		} else {
			return "[ ]";
		}
	}
	
	public int getCellValue() {
		return cellValue;
	}

	@Override
	public String toString() {
		if (flagged) {
			return "[F]";
		} else if (hasMine) {
			return "[x]";
		} else {
			return "["+ cellValue +"]";
		}
	}
}
