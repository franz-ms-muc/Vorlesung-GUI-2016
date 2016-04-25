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
package u5.mvc.header;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

/**
 * Header Filter Model.
 * @author weigend
 */
public class HeaderFilterModel {

    private static final String WILDCARD = "*";

    private final ListProperty series = new SimpleListProperty(FXCollections.observableArrayList());
    private final ListProperty hosts = new SimpleListProperty(FXCollections.observableArrayList());
    private final ListProperty processes = new SimpleListProperty(FXCollections.observableArrayList());
    private final ListProperty measurements = new SimpleListProperty(FXCollections.observableArrayList());
    private final ListProperty metrics = new SimpleListProperty(FXCollections.observableArrayList());
    private final ListProperty types = new SimpleListProperty(FXCollections.observableArrayList());
    private final ListProperty graphs = new SimpleListProperty(FXCollections.observableArrayList());
    private final ListProperty samplings = new SimpleListProperty(FXCollections.observableArrayList());
    private final ListProperty aggregations = new SimpleListProperty(FXCollections.observableArrayList());

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

    public ListProperty getSeriesProperty() {
        return series;
    }

    public ListProperty getHostsProperty() {
        return hosts;
    }

    public ListProperty getProcessesProperty() {
        return processes;
    }

    public ListProperty getMeasurementsProperty() {
        return measurements;
    }

    public ListProperty getMetricsProperty() {
        return metrics;
    }

    public ListProperty getTypesProperty() {
        return types;
    }

    public ListProperty getGraphsProperty() {
        return graphs;
    }

    public ListProperty getSamplingsProperty() {
        return samplings;
    }

    public ListProperty getAggregationsProperty() {
        return aggregations;
    }
}
