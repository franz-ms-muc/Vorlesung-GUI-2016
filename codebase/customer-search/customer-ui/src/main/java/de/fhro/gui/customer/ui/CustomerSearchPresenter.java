package de.fhro.gui.customer.ui;

import de.fhro.gui.common.Registry;
import de.fhro.gui.customer.api.CustomerDTO;
import de.fhro.gui.customer.api.CustomerSearch;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class CustomerSearchPresenter implements Initializable {
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws ClassNotFoundException {
        // doSearch
        Class c = Class.forName("de.fhro.gui.customer.api.CustomerSearch");
        System.out.println("Class found:" + c);
        
        CustomerSearch search = (CustomerSearch) Registry.getService(CustomerSearch.class);
        List<CustomerDTO> customers = search.searchForCustomers("*");
        // add to list
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
