/*
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

package u4.mvc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author weigend
 */
public class HeaderFilterModel {

    private static final String WILDCARD = "*";
    
    private final ObservableList series = FXCollections.observableArrayList();
    private final ObservableList hosts = FXCollections.observableArrayList();
    private final ObservableList processes = FXCollections.observableArrayList();
    private final ObservableList measurements = FXCollections.observableArrayList();
    private final ObservableList metrics = FXCollections.observableArrayList();
    private final ObservableList types = FXCollections.observableArrayList();
    private final ObservableList graphs = FXCollections.observableArrayList();
    private final ObservableList samplings = FXCollections.observableArrayList();
    private final ObservableList aggregations = FXCollections.observableArrayList();
     
    public HeaderFilterModel() {
        
        series.add(WILDCARD);
        hosts.add(WILDCARD);
        processes.add(WILDCARD);
        measurements.add(WILDCARD);
        metrics.add(WILDCARD);
        types.add(WILDCARD);
        
        graphs.addAll("Line", "Sum", "Point");
        samplings.addAll("None", "Days", "Hours", "Minutes");
        aggregations.addAll("None", "Avg", "Min", "Max");              
    }


    public ObservableList getSeries() {
        return series;
    }

    public ObservableList getHosts() {
        return hosts;
    }

    public ObservableList getProcesses() {
        return processes;
    }

    public ObservableList getMeasurements() {
        return measurements;
    }

    public ObservableList getMetrics() {
        return metrics;
    }

    public ObservableList getTypes() {
        return types;
    }

    public ObservableList getGraphs() {
        return graphs;
    }

    public ObservableList getSamplings() {
        return samplings;
    }

    public ObservableList getAggregations() {
        return aggregations;
    }    
}
