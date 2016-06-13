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

package u8.parallel.chart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Chart Application Main.
 * @author weigend
 */
public class ChartApplication extends Application {
    
    /**
     * Main to start the chart application inclusive header.
     * @param args not used.
     */
    public static void main(String[] args) {
       Application.launch(args);
    }

    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Chart.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();   }
}
