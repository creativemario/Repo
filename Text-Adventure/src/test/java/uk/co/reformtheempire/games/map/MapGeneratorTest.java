package uk.co.reformtheempire.games.map;

import static org.junit.Assert.*;

import org.junit.Test;

public class MapGeneratorTest {

	@Test
	public void test() {
		
		Map map = new Map(MapGenerator.generateMap(1000));
		System.out.println(map.toString());
	}

}
