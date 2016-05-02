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
package u6.parallel;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
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

    private CounterService service;

    private static final int COUNT = 100;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        model = new IntervalModel(COUNT); // could be injected

        pgValue.progressProperty().bind(model.valueProperty().divide((double) COUNT));

        tfValue.textProperty().bind(model.valueProperty().asString());

        btUp.setOnAction((ActionEvent event) -> {
            model.increase();
        });
        btUp.disableProperty().bind(model.atEnd());

        btDown.setOnAction((ActionEvent event) -> {
            model.decrease();
        });
        btDown.disableProperty().bind(model.atStart());

        service = new CounterService();
    }

    /**
     * Click on button.
     * @param e an Action Event.
     */
    public void onClick(ActionEvent e) {
        service.restart();
    }

    /**
     * The Service.
     */
    private class CounterService extends Service {
        @Override
        protected Task createTask() {
            return new Task<Void>() {
                @Override
                protected Void call() throws Exception {
                    // reset model
                    model.valueProperty().set(0);
                    for (int i = 0; i < COUNT; i++) {
                        
                        // update progress property
                        super.updateProgress(i, COUNT);
                        
                        // check for exit
                        if (Thread.currentThread().isInterrupted()) {
                            break; // exit on interrupt
                        }
                        
                        // update model
                        model.increase();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(IntervalPresenter.class.getName()).log(Level.SEVERE, null, ex);
                            break; // exit on interrupt
                        }
                    }
                    return null;
                }
            };
        }
    }
}
