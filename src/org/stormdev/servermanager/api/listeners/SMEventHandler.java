package org.stormdev.servermanager.api.listeners;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //available at runtime so we can manage it
@Target(ElementType.METHOD) //can use in method only.

/**
 * Registers events inside your listener class
 *
 */
public @interface SMEventHandler {
		/**
		 * Event listening priority, called in the order:
		 * LOWEST, LOW, NORMAL, HIGH, HIGHEST, MONITOR
		 */
		public enum Priority {
			/** 
			 * Called first
			 */
		   LOWEST, 
		   /**
		    * Called second
		    */
		   LOW, 
		   /**
		    * Called third
		    */
		   NORMAL, 
		   /**
		    * Called fourth
		    */
		   HIGH, 
		   /**
		    * Called fifth
		    */
		   HIGHEST, 
		   /**
		    * Called last and should NOT modify the event in any way!
		    */
		   MONITOR;
		}
	 
		/**
		 * The priority of the event
		 */
		Priority priority() default Priority.NORMAL;
}
