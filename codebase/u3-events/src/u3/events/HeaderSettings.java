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
package u3.events;

import java.util.Objects;

/**
 * PoJo which represents the selected data in the header.
 *
 * @author weigend
 */
public class HeaderSettings {

    private String series;
    private String measurement;
    private String host;
    private String process;
    private String type;
    private String metric;
    private String exclude;
    private String sampling;
    private String aggregation;
    private String graph;
    private String from;
    private String until;
    private boolean expertMode;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getExclude() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude = exclude;
    }

    public String getSampling() {
        return sampling;
    }

    public void setSampling(String sampling) {
        this.sampling = sampling;
    }

    public String getAggregation() {
        return aggregation;
    }

    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    public String getGraph() {
        return graph;
    }

    public void setGraph(String graph) {
        this.graph = graph;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getUntil() {
        return until;
    }

    public void setUntil(String until) {
        this.until = until;
    }

    void setExpertMode(boolean expertMode) {
        this.expertMode = expertMode;
    }

    public boolean getExpertMode() {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.series);
        hash = 83 * hash + Objects.hashCode(this.measurement);
        hash = 83 * hash + Objects.hashCode(this.host);
        hash = 83 * hash + Objects.hashCode(this.process);
        hash = 83 * hash + Objects.hashCode(this.type);
        hash = 83 * hash + Objects.hashCode(this.metric);
        hash = 83 * hash + Objects.hashCode(this.exclude);
        hash = 83 * hash + Objects.hashCode(this.sampling);
        hash = 83 * hash + Objects.hashCode(this.aggregation);
        hash = 83 * hash + Objects.hashCode(this.graph);
        hash = 83 * hash + Objects.hashCode(this.from);
        hash = 83 * hash + Objects.hashCode(this.until);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HeaderSettings other = (HeaderSettings) obj;
        if (!Objects.equals(this.series, other.series)) {
            return false;
        }
        if (!Objects.equals(this.measurement, other.measurement)) {
            return false;
        }
        if (!Objects.equals(this.host, other.host)) {
            return false;
        }
        if (!Objects.equals(this.process, other.process)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.metric, other.metric)) {
            return false;
        }
        if (!Objects.equals(this.exclude, other.exclude)) {
            return false;
        }
        if (!Objects.equals(this.sampling, other.sampling)) {
            return false;
        }
        if (!Objects.equals(this.aggregation, other.aggregation)) {
            return false;
        }
        if (!Objects.equals(this.graph, other.graph)) {
            return false;
        }
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        if (!Objects.equals(this.until, other.until)) {
            return false;
        }
        return true;
    }
}
