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

import de.fhro.gui.common.Registry;
import de.fhro.gui.customercore.api.CustomerDto;
import de.fhro.gui.customercore.api.CustomerSearch;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author weigend
 */
public class CustomerSearchImplTest {
    
 
    /**
     * Test of searchCustomers method, of class CustomerSearchImpl.
     */
    @Test
    public void testSearchCustomers() {
        CustomerSearchImpl instance = new CustomerSearchImpl();
        String query = "*";
        List<CustomerDto> result = instance.searchCustomers(query);
    }
    
    
    /**
     * Test of searchCustomers method by using CDI.
     */
    @Test
    public void testSearchCustomersCDI() {
        CustomerSearch api = Registry.getService(CustomerSearch.class);
        String query = "*";
        List<CustomerDto> result = api.searchCustomers(query);
    }
}
