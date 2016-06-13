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

package de.fhro.gui.customer.api;

import java.util.List;

/**
 *
 * @author weigend
 */
public interface CustomerSearch {
        List<CustomerDTO> searchForCustomers(String expression);
}
