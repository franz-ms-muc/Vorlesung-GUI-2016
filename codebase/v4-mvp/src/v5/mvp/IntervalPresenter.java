/*
 * _____________________________________________________________________________
 * 
 *           Project:    GUI 2016
 * _____________________________________________________________________________
 * 
 *        Created by:    Johannes Weigend, QAware GmbH
 *     Creation date:    March - July 2015
 * _____________________________________________________________________________
 * 
 *         Copyright:    Hochschule Rosenheim
 * _____________________________________________________________________________ 
 */
package v5.mvp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

/**
 *
 * @author weigend
 */
public class IntervalPresenter implements Initializable {
    
    private IntervalModel model;
    @FXML
    private TextField tfValue;
    @FXML
    private ProgressBar pgValue;
    @FXML
    private Button btUp;
    @FXML
    private Button btDown;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        model = new IntervalModel(10); // could be injected
        
        pgValue.progressProperty().bind(model.valueProperty().divide(10d));
        
        tfValue.textProperty().bind(model.valueProperty().asString());
                  
        btUp.setOnAction((ActionEvent event) -> {
           model.increase();
        });
        btUp.disableProperty().bind(model.atEnd());
        
        btDown.setOnAction((ActionEvent event) -> {
            model.decrease();
        });
        btDown.disableProperty().bind(model.atStart());
    }    
}
