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

/**
 * Customer Transport Object
 * @author johannes.weigend
 */
public class CustomerDto {
    
    private final String id;
    private final String name;
    private final String address;

    public CustomerDto(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }
    
}
