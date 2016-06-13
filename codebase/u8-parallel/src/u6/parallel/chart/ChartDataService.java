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

package u6.parallel.chart;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 * Service for generating sample data.
 * @author weigend
 */
public class ChartDataService extends Service {

    /**
     * Our logger.
     */
    private static final Logger LOG = Logger.getLogger (ChartDataService.class.getName());
    
    /** 
     * The model which will be filled.
     */
    private final ChartModel model;
    
    /**
     * The only constructor needs a model.
     * @param model the model.
     */
    public ChartDataService(ChartModel model) {
        this.model = model;
    }

    @Override
    protected Task createTask() {
        return new ChartDataTask();
    }
 
    private class ChartDataTask extends Task {
        @Override
        protected Object call() throws Exception {
            doSearch("Starting search...", 20);
            doSearch("Getting filters...", 40);
            doSearch("Mapping results...", 60);
            doSearch("Finalizing ...", 100);
            return "Search was successful. Duration: 5s.";
        }
        
        @Override
        protected void succeeded() {
            model.fillWithRandomData();
            try {
                super.updateMessage(super.get().toString());
            } catch (InterruptedException | ExecutionException ex) {
                LOG.log(Level.SEVERE, null, ex);
            }
        }
        
        @Override
        protected void cancelled() {
            super.updateMessage("Cancelled.");
        }
        
        @Override
        protected void done() {
            super.updateProgress(0, 0);
        }
              
        /**
         * Simulate some long running search logic. 
         * @param message a message.
         * @param percent the progress in percent.
         * @throws InterruptedException if the task was cancelled.
         */
        private void doSearch(String message, double percent) throws InterruptedException {
            super.updateMessage(message);
            super.updateProgress(percent, 100);
            Thread.sleep(1000);
        }
       
    } 
}
