package uk.co.reformtheempire.games.minesweeper.board;


public class Board {
	
	final Cell[][] board;
	
	public Board(Cell[][] board) {
	    this.board = board;
    }
	
	public Cell getCell(int x, int y){
		return board[y][x];
	}
	/**
	 * Get a cell.
	 * Will automatically remove 1 from each parameter to get the 'array' value
	 * @param xString
	 * @param yString
	 * @return
	 */
	public Cell getCell(String xString, String yString){
		int x = Integer.parseInt(xString);
		int y = Integer.parseInt(yString);
		x--;
		y--;
		return board[y][x];
	}

	
	@Override
	public String toString() {
	    final StringBuilder sb = new StringBuilder();
	    
	    for (int y = 0; y < board.length; y++) {
	        for (int x = 0; x < board.length; x++) {
	            sb.append(board[y][x].getCell());
            }
	        sb.append("\n");
        }
	    
	    return sb.toString();    
	}
	
	public String toDebugString() {
	    final StringBuilder sb = new StringBuilder();
	    
	    for (int y = 0; y < board.length; y++) {
	        for (int x = 0; x < board.length; x++) {
	            sb.append(board[y][x].toString());
            }
	        sb.append("\n");
        }
	    
	    return sb.toString();    
	}
	
}
