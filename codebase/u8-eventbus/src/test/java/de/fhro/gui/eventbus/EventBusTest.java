//______________________________________________________________________________
//
//          Project:    Graphical User Interface (GUI) 
//______________________________________________________________________________
//
//       created by:    $Author: Weigend $ 
//       creation date: 27.04.11
//       changed by:    $Author: $
//       change date:   $Date: $
//       revision:      $Revision:  $
//       description:   central event bus.
//______________________________________________________________________________
//
//        Copyright:    University of Applied Science Rosenheim Germany
//______________________________________________________________________________
package de.fhro.gui.eventbus;

import java.util.*;
import javafx.scene.input.MouseEvent;
import org.junit.Assert;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Class EventBusTest.
 */
public class EventBusTest {

    private boolean eventPublished = false;
    
    private boolean annotationPublished = false;
    
    @Test
    public void testProgramaticSubscription() {

        EventBus bus = SimpleEventBus.getBus();
        bus.publish(new EventObject(""));
        assertFalse(eventPublished);

        bus.subscribe(EventObject.class, new EventBusListener() {
            @Override
            public boolean eventPublished(Object event) {
                eventPublished = true;
                return true;
            }
        });

        boolean result = bus.publish(new EventObject(""));
        assertTrue(result);
        assertTrue(eventPublished);
    }    
   
    @Test
    public void testAnnotationDescription() {
        EventBus bus = SimpleEventBus.getBus();
        bus.publish(new EventObject(""));
        assertFalse(annotationPublished);
        
        // subscribe this
        AnnotationProcessor.process(this);

        bus.publish(new EventObject(""));
        assertTrue(annotationPublished);
    }

    @EventSubscriber(eventClass = EventObject.class)
    public boolean eventHappend(EventObject e) {
        annotationPublished = true;
        return true;
    }
    
    @EventSubscriber(eventClass = MouseEvent.class)
    public boolean mouseEventHappend(EventObject e) {
        Assert.fail("No mouse events are fired.");
        return false;
    }
}
