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

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;
import u8.parallel.header.HeaderSettingsModel;

/**
 * Model
 *
 * @author weigend
 */
public class ChartModel {

    /** 
     * The embedded header model.
     */
    private final HeaderSettingsModel headerModel;

    /**
     * The chart graph data.
     */
    private final ObservableList chartData = FXCollections.observableArrayList();

    /** 
     * Construct a chart model by a given header model.
     * @param headerModel the header model.
     */
    public ChartModel(HeaderSettingsModel headerModel) {
        this.headerModel = headerModel;
    }

    /**
     * Getter to bind the chart ui to the model.
     * @return the graph data.
     */
    public ObservableList getChartData() {
        return chartData;
    }

    /**
     * Action to fill the data with samples. 
     * Later we will implement our search adapter here!
     */
    public void fillWithRandomData() {
        XYChart.Series series = new XYChart.Series();
        series.setName(headerModel.getMetric());
        series.getData().clear();
        for (int i = 0; i < 100; i++) {
            series.getData().add(new XYChart.Data(i, Math.random() * i));
        }
        chartData.add(series);
    }
}
