package uk.co.reformtheempire.games.main;

import static org.junit.Assert.*;

import org.junit.Test;
import uk.co.reformtheempire.games.main.Main;

public class MainTest {

	@Test
	public void test() {
		assertTrue("Should return\"Hello World.\"", Main.getHelloWorldText().equals("Hello World."));
	}

}
