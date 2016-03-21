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
package de.hsro.gui.u1;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * Simple View which shows two buttons.
 * @author weigend
 */
public class SearchView extends HBox {

    private final Button searchButton;
    private final TextField searchText;

    public SearchView() {

        searchText = new TextField();
        searchText.setPromptText("Enter a Expression");
       
        searchButton = new Button("Search");     
        searchButton.disableProperty().bind(
                searchText.textProperty().isEmpty()
        );
        
        getChildren().addAll(searchText, searchButton);
    }

}
