package ht.tm.dev.telstar.main;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TelstarStandaloneTest {

	//This is pointless. But I like code coverage to be high.
	@Test
	public void testMain() throws IOException {
		TelstarStandalone.main(null);
	}

}
