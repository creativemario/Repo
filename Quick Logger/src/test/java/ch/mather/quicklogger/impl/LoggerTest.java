package ch.mather.quicklogger.impl;

import java.io.IOException;

import org.junit.Test;

public class LoggerTest {

	@Test
	public void everythingTest() {

		Logger LOG = LoggerFactory.getLogger(this);

		LOG.info("INFO TEST");

		LOG.debug("DEBUG TEST");

		LOG.error("ERROR TEST");

		Logger LOG2 = LoggerFactory.getLogger(this);

		LOG2.info("INFO TEST");

		LOG2.debug("DEBUG TEST");

		LOG2.error("ERROR TEST");

		try {

			IOException e = new IOException("ERROR");
			throw e;
		} catch (IOException e) {
			LOG.error("ERROR + EXCEPTION TEST", e);
		}

	}

}
