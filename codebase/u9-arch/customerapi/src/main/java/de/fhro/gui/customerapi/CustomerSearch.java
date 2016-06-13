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
     * Search for customers by matching the name with a given regex query string.
     * @param query the regex query string.
     * @return a list of customers - never null.
     */
    List<CustomerDto> searchCustomers(String query);
}
