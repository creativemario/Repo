package uk.co.reformtheempire.games.map;

import uk.co.reformtheempire.games.random.Randomiser;

public class MapGenerator {


	public static Cell[][] generateMap(int size) {
		Randomiser randomiser = new Randomiser();

		if (size == 100) {
			size = 10;
		}
		Cell[][] cells = new Cell[size][size];
		for (int y = 0; y < (size); y++) {
			for (int x = 0; x < (size); x++) {
				System.out.println("generating: X = " + x + " Y = " + y);
				
				cells[y][x] = new Cell(true, true, true, true);
				
				
				
					int random = randomiser.getRandomInt(4, 1);
					
					if (random == 1) {
						cells[y][x].setN(true);
						cells[y][x].setE(false);
					} else if (random == 2) {
						cells[y][x].setN(false);
						cells[y][x].setE(true);
					}else if (random == 3){
						cells[y][x].setN(false);
						cells[y][x].setE(false);
					}else{
						cells[y][x].setN(true);
						cells[y][x].setE(true);
					}
				
					if (x > 0) {
						if (cells[y][(x - 1)].isE()) {
							cells[y][x].setW(true);
						} else
							cells[y][x].setW(false);
					} else
						cells[y][x].setW(true);
				if (y > 0) {
					if (cells[(y - 1)][x].isN()) {
						cells[y][x].setS(true);
					} else {
						cells[y][x].setS(false);
					}
				} else {
					cells[y][x].setS(true);
				}
				
				if(x == 0){
					cells[y][x].setW(true);
				}
				
				if(x == 9){
					cells[y][x].setE(true);
				}
				if(y == 0){
					cells[y][x].setS(true);
				}
				if(y == 9){
					cells[y][x].setN(true);
				}
				System.out.println(cells[y][x].toString());
			}
		}
		return cells;
	}

}
