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
package de.fhro.gui.customerui;

import de.fhro.gui.common.Registry;
import de.fhro.gui.customerapi.CustomerDto;
import de.fhro.gui.customerapi.CustomerSearch;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * Customer Controller.
 *
 * @author johannes.weigend
 */
public class CustomerController {

    @FXML
    private ListView list;

    @FXML
    private TextField search;

    // make sure: beans.xml exists in customercore
    private final CustomerSearch customerSearch = Registry.getService(CustomerSearch.class);

    public void searchCustomer(ActionEvent e) {        
        List<CustomerDto> dto = customerSearch.searchCustomers(search.getText());
        list.getItems().clear();
        list.getItems().addAll(dto);
    }
}
