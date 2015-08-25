package com.assignment;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author abaghe
 * 
 */
public final class Light {

	/**
	 * light
	 */
	private static int lightspeed;
	/**
	 * light
	 */
	private static int days;
	/**
	 * light
	 */
	private static int seconds;
	/**
	 * light
	 */
	private static int distance;
	/**
	 * light speed days seconds distance
	 */
	private static String str;

	/**
	 * String to remove delimiter str is the String
	 */
	private static Class<Light> cls;
    /**
	 * cls class variable
	 */
	public final static Logger LOG=Logger.getLogger(str);;
	/**
	 * log
	 */
	private Light() {

	}
    static {
		lightspeed = 186000;
		days = 1000;
	}

	/**
	 * 
	 * @param args
	 */

	public static void main(final String... args) {

		seconds = days * 24 * 60 * 60;

		distance = lightspeed * seconds; // compute distance

		cls = Light.class;
		str = cls.getName();
		final Level level = Level.FINE;
		final boolean condition = LOG.isLoggable(level);
			if(condition){
			LOG.fine("In " + days);
			}
			if(condition){
			LOG.fine(" days light will travel about ");
			}
			if(condition){
			LOG.fine(distance + " miles.");
			}
	}
}
