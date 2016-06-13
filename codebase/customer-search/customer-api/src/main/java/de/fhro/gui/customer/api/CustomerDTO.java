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

/**
 *
 * @author weigend
 */


public class CustomerDTO {
    private final String id;
    private final String name;
    private final String address;

    public CustomerDTO(String id, String name, String address) {
        this.name = name;
        this.address = address;
        this.id = id;
    }
  
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" + "name=" + name + ", address=" + address + '}';
    }
    
}
