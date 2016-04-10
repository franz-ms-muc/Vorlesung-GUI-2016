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

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Header Controller.
 *
 * @author weigend
 */
public class HeaderController implements Initializable {

    private static final Logger LOG = Logger.getLogger(HeaderController.class.getName());

    @FXML
    private ComboBox series;
    @FXML
    private ComboBox measurement;
    @FXML
    private ComboBox host;
    @FXML
    private ComboBox process;
    @FXML
    private ComboBox type;
    @FXML
    private ComboBox metric;
    @FXML
    private TextField exclude;
    @FXML
    private TextArea expertModeArea;
    @FXML
    private CheckBox expertMode;
    @FXML
    private ComboBox sampling;
    @FXML
    private ComboBox aggregation;
    @FXML
    private ComboBox graph;
    @FXML
    private DatePicker from;
    @FXML
    private DatePicker until;
    @FXML
    private Button generateGraph;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        generateGraph.addEventHandler(ActionEvent.ACTION, e -> onGenerateGraph(e));
    }

    /**
     * Button "Generate Graph" was clicked.
     *
     * @param e an action event.
     */
    public void onGenerateGraph(ActionEvent e) {
        LOG.log(Level.INFO, "Generate Graph: {0}", toSettings());
        HeaderSettings settings = toSettings();
        settings.setExpertMode(!settings.getExpertMode()); // check this
        fromSettings(settings);
    }

    /**
     * Button "Generate Graph" was clicked.
     *
     * @param e an action event.
     */
    public void onCreateBookmark(ActionEvent e) {
        LOG.log(Level.INFO, "Create Bookmark{0}", toSettings());
    }

    /**
     * Button "Generate Graph" was clicked.
     *
     * @param e an action event.
     */
    public void onAddToGraph(ActionEvent e) {
        LOG.log(Level.INFO, "Add to Graph{0}", toSettings());
    }

    /**
     * Gets all current settings in the dialog.
     *
     * @return a HeaderSettings PoJo
     */
    HeaderSettings toSettings() {

        HeaderSettings settings = new HeaderSettings();

        // editable combo boxes
        settings.setSeries(series.getEditor().getText());
        settings.setMeasurement(measurement.getEditor().getText());
        settings.setHost(host.getEditor().getText());
        settings.setProcess(process.getEditor().getText());
        settings.setType(type.getEditor().getText());
        settings.setMetric(metric.getEditor().getText());
        settings.setExclude(exclude.getText());
        settings.setExpertMode(expertMode.isSelected());

        // non editable combo boxes
        settings.setSampling(sampling.getSelectionModel().getSelectedItem() != null
                ? sampling.getSelectionModel().getSelectedItem().toString() : "");
        settings.setAggregation(aggregation.getSelectionModel().getSelectedItem() != null
                ? aggregation.getSelectionModel().getSelectedItem().toString() : "");
        settings.setGraph(graph.getSelectionModel().getSelectedItem() != null
                ? graph.getSelectionModel().getSelectedItem().toString() : "");

        // data fiels
        settings.setFrom(from.getEditor().getText());
        settings.setUntil(until.getEditor().getText());
        return settings;
    }

    /**
     * Fills the UI with values.
     *
     * @param settings the Settings PoJo.
     */
    void fromSettings(HeaderSettings settings) {

        // editable combo boxes
        series.getEditor().setText(settings.getSeries());
        measurement.getEditor().setText(settings.getMeasurement());
        host.getEditor().setText(settings.getHost());
        process.getEditor().setText(settings.getProcess());
        type.getEditor().setText(settings.getType());
        metric.getEditor().setText(settings.getMetric());
        exclude.setText(settings.getExclude());
        expertMode.setSelected(settings.getExpertMode());

        // non editable combo boxes
        sampling.getSelectionModel().select(settings.getSampling());
        aggregation.getSelectionModel().select(settings.getAggregation());
        graph.getSelectionModel().select(settings.getGraph());

        // data fields
        from.getEditor().setText(settings.getFrom());
        until.getEditor().setText(settings.getUntil());
    }
}
