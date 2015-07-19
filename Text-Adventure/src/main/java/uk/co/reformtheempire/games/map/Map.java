package uk.co.reformtheempire.games.map;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Map {

	private int numberOfCells;

	private static Cell[][] cells;

	public Map(Cell[][] cells) {
		this.cells = cells;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int y = 0; y < cells.length; y++) {
			for (int x = 0; x < cells.length; x++) {
				if (cells[y][x].isS()) {
					sb.append("###");
				} else {
					sb.append("#*#");
				}
			}
			sb.append("\n");
			for (int k = 0; k < cells.length; k++) {
				if (cells[y][k].isW()) {
					sb.append("#");
				} else {
					sb.append("*");
				}
				sb.append("*");
				if (cells[y][k].isE()) {
					sb.append("#");
				} else {
					sb.append("*");
				}
			}

			sb.append("\n");
		}
		PrintWriter output = null;
		try {
			output = new PrintWriter("src/test/resources/map.rte");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String map = sb.toString();
		output.println(map);
		output.close();
		
		return map;
	}
}
