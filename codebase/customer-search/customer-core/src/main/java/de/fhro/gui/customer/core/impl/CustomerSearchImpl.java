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
package de.fhro.gui.customer.core.impl;

import de.fhro.gui.customer.api.CustomerDTO;
import de.fhro.gui.customer.api.CustomerSearch;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author weigend
 */
public class CustomerSearchImpl implements CustomerSearch {

    @Override
    public List<CustomerDTO> searchForCustomers(String expression) {
        return new ArrayList(); // todo
    }

}
