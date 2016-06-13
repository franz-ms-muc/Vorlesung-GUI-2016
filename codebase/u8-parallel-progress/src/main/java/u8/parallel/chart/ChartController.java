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

import java.net.URL;
import java.util.ResourceBundle;
import javafx.concurrent.Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import u8.parallel.header.HeaderController;

/**
 * Chart controller.
 * @author weigend
 */
public class ChartController implements Initializable {

    @FXML
    private HeaderController headerController;

    @FXML
    private LineChart chart;
    
    /** 
     * Asnchronous data service.
     */
    private Service chartDataService;
    
    /**
     * Chart model can only be created after the headerModel is available.
     */
    private ChartModel model;

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = new ChartModel(headerController.getModel());
        chart.setData(model.getChartData());
        chartDataService = new ChartDataService(model);
        headerController.getGenerateGraph().addEventHandler(ActionEvent.ACTION,
                event -> chartDataService.restart()
        );
    }
}
