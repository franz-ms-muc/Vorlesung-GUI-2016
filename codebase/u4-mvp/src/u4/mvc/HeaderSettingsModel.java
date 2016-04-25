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

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * PoJo which represents the selected data in the header.
 *
 * @author weigend
 */
public class HeaderSettingsModel {

    private final StringProperty series = new SimpleStringProperty("*");
    private final StringProperty measurement = new SimpleStringProperty("*");
    private final StringProperty host = new SimpleStringProperty("*");
    private final StringProperty process = new SimpleStringProperty("*");
    private final StringProperty type = new SimpleStringProperty("*");
    private final StringProperty metric = new SimpleStringProperty("*");
    private final StringProperty exclude = new SimpleStringProperty("*");
    private final StringProperty sampling = new SimpleStringProperty("*");
    private final StringProperty aggregation = new SimpleStringProperty("*");
    private final StringProperty graph = new SimpleStringProperty("Line");
    private final StringProperty from = new SimpleStringProperty();
    private final StringProperty until = new SimpleStringProperty();
    private final BooleanProperty expertMode = new SimpleBooleanProperty();

    private final HeaderFilterModel filters = new HeaderFilterModel();
    
    public HeaderFilterModel getFilters() {
        return filters;
    }
    
    public String getSeries() {
        return series.get();
    }

    public StringProperty getSeriesProperty() {
        return series;
    }

    public void setSeries(String series) {
        this.series.setValue(series);
    }

    public String getMeasurement() {
        return measurement.get();
    }

    public StringProperty getMeasurementProperty() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement.setValue(measurement);
    }

    public String getHost() {
        return host.get();
    }

    public StringProperty getHostProperty() {
        return host;
    }

    public void setHost(String host) {
        this.host.setValue(host);
    }

    public String getProcess() {
        return process.get();
    }

    public StringProperty getProcessProperty() {
        return process;
    }

    public void setProcess(String process) {
        this.process.setValue(process);
    }

    public String getType() {
        return type.get();
    }

    public StringProperty getTypeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.setValue(type);
    }

    public String getMetric() {
        return metric.get();
    }

    public StringProperty getMetricProperty() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric.setValue(metric);
    }

    public String getExclude() {
        return exclude.get();
    }

    public StringProperty getExcludeProperty() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude.setValue(exclude);
    }

    public String getSampling() {
        return sampling.get();
    }

    public StringProperty getSamplingProperty() {
        return sampling;
    }

    public void setSampling(String sampling) {
        this.sampling.setValue(sampling);
    }

    public String getAggregation() {
        return aggregation.get();
    }

    public StringProperty getAggregationProperty() {
        return aggregation;
    }

    public void setAggregation(String aggregation) {
        this.aggregation.setValue(aggregation);
    }

    public String getGraph() {
        return graph.get();
    }

    public StringProperty getGraphProperty() {
        return graph;
    }

    public void setGraph(String graph) {
        this.graph.setValue(graph);
    }

    public String getFrom() {
        return from.get();
    }

    public StringProperty getFromProperty() {
        return from;
    }

    public void setFrom(String from) {
        this.from.setValue(from);
    }

    public String getUntil() {
        return until.get();
    }

    public StringProperty getUntilProperty() {
        return until;
    }

    public void setUntil(String until) {
        this.until.setValue(until);
    }

    public void setExpertMode(boolean expertMode) {
        this.expertMode.setValue(expertMode);
    }

    public boolean getExpertMode() {
        return expertMode.get();
    }

    public BooleanProperty getExpertModeProperty() {
        return expertMode;
    }

    @Override
    public String toString() {
        return "HeaderSettings{"
                + "\n\tseries=" + series
                + "\n\tmeasurement=" + measurement
                + "\n\thost=" + host
                + "\n\tprocess=" + process
                + "\n\ttype=" + type
                + "\n\tmetric=" + metric
                + "\n\texclude=" + exclude
                + "\n\tsampling=" + sampling
                + "\n\taggregation=" + aggregation
                + "\n\tgraph=" + graph
                + "\n\tfrom=" + from
                + "\n\tuntil=" + until
                + "\n}";
    }
}
