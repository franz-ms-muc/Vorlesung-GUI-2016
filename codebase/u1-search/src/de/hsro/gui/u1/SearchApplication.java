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

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * SearchApplication
 * @author weigend
 */
public class SearchApplication extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SearchApplication.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {     
        Scene scene = new Scene(new SearchView());
        primaryStage.setScene(scene);
        primaryStage.show();
    }  
}
