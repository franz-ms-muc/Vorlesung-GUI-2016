/*
 * _____________________________________________________________________________
 * 
 *           Project:    GUI 2015
 * _____________________________________________________________________________
 * 
 *        Created by:    Johannes Weigend, QAware GmbH
 *     Creation date:    March - July 2015
 * _____________________________________________________________________________
 * 
 *         Copyright:    Hochschule Rosenheim
 * _____________________________________________________________________________ 
 */
package de.fhro.gui.customercore.api;

import java.util.List;

/**
 * Customer API
 * @author johannes.weigend
 */
public interface CustomerSearch {
    List<CustomerDto> searchCustomers(String query);
}
