package uk.co.reformtheempire.games.interfaces.text;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CommandInterpretorTest {

	@Test
	public void test() {
		String commands = "go north";
		
		ArrayList<String> response = CommandInterpretor.getCommands(commands);
		assertTrue(response.get(0).equals("go"));
		assertTrue(response.get(1).equals("north"));
	}

}
