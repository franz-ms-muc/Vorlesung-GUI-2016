/*
 * _____________________________________________________________________________
 * 
 *           Project:    GUI 2016
 * _____________________________________________________________________________
 * 
 *        Created by:    Johannes Weigend, QAware GmbH
 *     Creation date:    March - July 2016
 * _____________________________________________________________________________
 * 
 *         Copyright:    Hochschule Rosenheim
 * _____________________________________________________________________________ 
 */
package de.fhro.gui.customerapi;

import java.util.List;

/**
 * Customer API
 * @author johannes.weigend
 */
public interface CustomerSearch {
    
    /**
     * Search for customers by matching the name with a given query string.
     * @param query the syntax and semantic of the query depends on the 
     * implementation component. Implementation components can support different 
     * query languges.
     * @return a list of customers - never null.
     */
    List<CustomerDto> searchCustomers(String query);
}
