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

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.StringProperty;
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

    private final HeaderSettingsModel model = new HeaderSettingsModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeBindings();
        generateGraph.addEventHandler(ActionEvent.ACTION, e -> onGenerateGraph(e));
    }

    /**
     * Button "Generate Graph" was clicked.
     *
     * @param e an action event.
     */
    public void onGenerateGraph(ActionEvent e) {
        LOG.log(Level.INFO, "Generate Graph: {0}", model);
    }

    /**
     * Button "Generate Graph" was clicked.
     *
     * @param e an action event.
     */
    public void onCreateBookmark(ActionEvent e) {
        LOG.log(Level.INFO, "Create Bookmark{0}", model);
    }

    /**
     * Button "Generate Graph" was clicked.
     *
     * @param e an action event.
     */
    public void onAddToGraph(ActionEvent e) {
        LOG.log(Level.INFO, "Add to Graph{0}", model);
    }

    /**
     * Helper binds all fields to the model.
     */
    private void initializeBindings() {

        // r/w Comboboxes: Editor value     
        series.getEditor().textProperty().bindBidirectional(model.getSeriesProperty());
        host.getEditor().textProperty().bindBidirectional(model.getHostProperty());
        process.getEditor().textProperty().bindBidirectional(model.getProcessProperty());
        type.getEditor().textProperty().bindBidirectional(model.getTypeProperty());
        measurement.getEditor().textProperty().bindBidirectional(model.getMeasurementProperty());
        metric.getEditor().textProperty().bindBidirectional(model.getMetricProperty());
        
        // r/w Comboboxes: Lists
        series.itemsProperty().bind(model.getFilters().getSeriesProperty());
        host.itemsProperty().bind(model.getFilters().getHostsProperty());
        process.itemsProperty().bind(model.getFilters().getProcessesProperty());
        type.itemsProperty().bind(model.getFilters().getTypesProperty());
        measurement.itemsProperty().bind(model.getFilters().getMeasurementsProperty());
        metric.itemsProperty().bind(model.getFilters().getMetricsProperty());
        
        // r/o Comboboxes: Selected value
        bindROComboBox(model.getSamplingProperty(), sampling);
        bindROComboBox(model.getAggregationProperty(), aggregation);
        bindROComboBox(model.getGraphProperty(), graph);
        
        // r/o Comboboxes: Lists
        sampling.itemsProperty().bind(model.getFilters().getSamplingsProperty());
        aggregation.itemsProperty().bind(model.getFilters().getAggregationsProperty());
        sampling.itemsProperty().bind(model.getFilters().getSamplingsProperty());
        
        // text 
        exclude.textProperty().bindBidirectional(model.getExcludeProperty());
        
        // checkbox
        expertMode.selectedProperty().bindBidirectional(model.getExpertModeProperty());
            
        // date picker
        from.getEditor().textProperty().bindBidirectional(model.getFromProperty());
        until.getEditor().textProperty().bindBidirectional(model.getUntilProperty());
    }

    /**
     * Helper to make a binding between combobox and a property.
     *
     * @param property the property property.
     * @param cbx a combobox.
     */
    private void bindROComboBox(StringProperty property, ComboBox cbx) {
        // cbx to property
        cbx.getSelectionModel().selectedItemProperty().addListener(
                v -> property.setValue(v.toString())
        );
    }
}
