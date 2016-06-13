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
package u8.parallel.win;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import u8.parallel.chart.ChartController;

/**
 * FXML Controller class
 *
 * @author weigend
 */
public class WindowController implements Initializable {

    @FXML
    private ChartController chartController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
