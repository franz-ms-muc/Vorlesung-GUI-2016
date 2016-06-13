/*
 _____________________________________________________________________________
 
            Project:    GUI 2016
  _____________________________________________________________________________
  
         Created by:    Johannes Weigend, QAware GmbH
      Creation date:    March 2016
  _____________________________________________________________________________
  
          License:      Apache License 2.0
  _____________________________________________________________________________ 
 */

package de.fhro.gui.common;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author weigend
 */
public class Registry {

    private static WeldContainer weld;

    public static void init() {
        weld = new Weld().initialize();
    }

    public static <T> T getService(Class<T> clazz) {
        if (weld == null) {
            init();
        }
        return weld.instance().select(clazz).get();
    }
   
    
}
