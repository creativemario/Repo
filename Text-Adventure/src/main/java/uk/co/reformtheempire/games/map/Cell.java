package uk.co.reformtheempire.games.map;

public class Cell {

	private static int numberOfCells = 0;
	
	private boolean n;
	private boolean s;
	private boolean e;
	private boolean w;
	
	@Override
	public String toString() {
		return "Cell [n=" + n + ", s=" + s + ", e=" + e + ", w=" + w + "]";
	}

	public Cell(boolean n, boolean s, boolean e, boolean w) {
		Cell.numberOfCells++;
		this.n = n;
		this.s = s;
		this.e = e;
		this.w = w;
	}

	public boolean isN() {
		return n;
	}

	public void setN(boolean n) {
		this.n = n;
	}

	public boolean isS() {
		return s;
	}

	public void setS(boolean s) {
		this.s = s;
	}

	public boolean isE() {
		return e;
	}

	public void setE(boolean e) {
		this.e = e;
	}

	public boolean isW() {
		return w;
	}

	public void setW(boolean w) {
		this.w = w;
	}

	public static int getNumberOfCells() {
		return numberOfCells;
	}
	
	
}
