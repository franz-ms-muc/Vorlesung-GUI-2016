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
package de.fhro.gui.customercore.impl;

import de.fhro.gui.customerapi.CustomerDto;
import de.fhro.gui.customerapi.CustomerSearch;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of the CustomerSearch interface with a static list.
 * @author johannes.weigend
 */
public class CustomerSearchImpl implements CustomerSearch {
   
    @Override
    public List<CustomerDto> searchCustomers(String query) {
 
        // todo: use dataaccess layer
        List<CustomerDto> customers = new ArrayList<>();
        customers.add(new CustomerDto("1", "Weigend", "Rosenheim"));
        customers.add(new CustomerDto("2", "Huber", "Kolbermoor"));
        customers.add(new CustomerDto("3", "Wolf", "Muenchen"));
        customers.add(new CustomerDto("4", "Andersch", "Kolbermoor"));
        customers.add(new CustomerDto("5", "Peter", "Rosenheim"));
        customers.add(new CustomerDto("6", "Stephan", "Bruckmuehl"));
        customers.add(new CustomerDto("7", "Anders", "Kolbermoor"));
        customers.add(new CustomerDto("8", "Koch", "Kolbermoor"));
        customers.add(new CustomerDto("9", "Kasten", "Kolbermoor"));
        // ...
        return customers.stream().filter(c -> 
                c.getName().startsWith(query)
        ).collect(Collectors.toList());
    }   
}
