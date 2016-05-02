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
package u6.parallel.win;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.concurrent.Service;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import u6.parallel.chart.ChartController;

/**
 * FXML Controller class
 *
 * @author weigend
 */
public class WindowController implements Initializable {

    @FXML
    private Button btCancel;

    @FXML
    private TextField tfStatus;

    @FXML
    private ProgressBar pbProgress;

    @FXML
    private ChartController chartController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Service service = chartController.getService();
        tfStatus.textProperty().bind(service.messageProperty());
        pbProgress.progressProperty().bind(service.progressProperty());
        btCancel.setOnAction(e -> service.cancel());
        btCancel.disableProperty().bind(service.onReadyProperty());
    }
}
