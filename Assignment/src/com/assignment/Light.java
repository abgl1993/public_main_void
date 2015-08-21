package com.assignment;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 
 * @author abaghe
 *
 */
final class Light {
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
	 * light speed
	 * days
	 * seconds
	 * distance
	 */
	static{
		 lightspeed = 186000;
		 days = 1000;
	}
	

public static void main(final String...args) {
	
	
	  
	    seconds = days * 24 * 60 * 60;
	  
    
    distance = lightspeed * seconds; // compute distance
    
    final Logger log = Logger.getLogger(Light.class.getName());
    if (log.isLoggable(Level.FINE)){
    log.fine("In " + days);
    }
    if (log.isLoggable(Level.FINE)){
    log.fine(" days light will travel about ");
    }
    if (log.isLoggable(Level.FINE)){
    log.fine(distance + " miles.");
    }
  }
}