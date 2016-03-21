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
package de.hsro.u1.search2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

/**
 *
 * @author weigend
 */
public class SearchViewController implements Initializable {
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    public void onSearchButtonClicked(ActionEvent e) {
        System.out.println(e);
    }
    
}
