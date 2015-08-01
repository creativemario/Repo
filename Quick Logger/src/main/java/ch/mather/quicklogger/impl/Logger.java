package ch.mather.quicklogger.impl;

import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.exception.ExceptionUtils;

import ch.mather.quicklogger.api.LoggerIF;

public class Logger implements LoggerIF {

	private final String className;

	private BufferedWriter out;

	final static private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public Logger(String className) {
		super();
		this.className = className;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		} catch (final UnsupportedEncodingException e) {
			error("COULD NOT INSTANTIATE CORRECTLY", e);
		}
	}

	public void info(String message) {
		try {

			out.write(sdf.format(new Date()));

			out.write(" INFO ");

			out.write(className);

			out.write(" - " + message);

			out.write('\n');

			out.flush();

		} catch (final IOException e) {
			error("COULD NOT LOG INFO", e);
		}
	}

	public void debug(String message) {
		try {

			out.write(sdf.format(new Date()));

			out.write(" DEBUG ");

			out.write(className);

			out.write(" - " + message);

			out.write('\n');

			out.flush();

		} catch (final IOException e) {
			error("COULD NOT LOG DEBUG", e);
		}
	}

	public void error(String error) {
		try {

			out.write(sdf.format(new Date()));

			out.write(" ERROR ");

			out.write(className);

			out.write(" - " + error);

			out.write('\n');

			out.flush();

		} catch (final IOException e) {
			error("COULD NOT LOG ERROR", e);
		}
	}

	public void error(String error, Exception e) {

		if (e == null || e.getMessage() == null || e.getLocalizedMessage() == null) {
			error(error);
		} else {

			try {

				out.write(sdf.format(new Date()));

				out.write(" ERROR ");

				out.write(className);

				out.write(" - " + error);

				out.write("\n");

				out.write(ExceptionUtils.getStackTrace(e));

				out.write('\n');

				out.flush();

			} catch (final IOException err) {
				error("COULD NOT LOG ERROR", err);
			}
		}
	}

}
