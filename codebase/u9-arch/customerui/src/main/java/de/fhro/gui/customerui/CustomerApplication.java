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
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author johannes.weigend
 */
public class CustomerApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CustomerSearch.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Customer Search");
        stage.setScene(scene);
        stage.show();
    }
   
    public static void main(String [] args) {
        Registry.init();
        CustomerApplication.launch(new String[]{});
    }
}
