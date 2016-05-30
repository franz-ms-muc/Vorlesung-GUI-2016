// ______________________________________________________________________________
//
//           Project: Grafische Oberflaechen 2013
//              File: $Id$
//      last changed: $Revision$
// ______________________________________________________________________________
//
//        created by: johannes.weigend
//     creation date: 29.04.2013
// ______________________________________________________________________________
//         Copyright: (c) johannes.weigend
// ______________________________________________________________________________
package de.fhro.gui.eventbus;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class SimpleEventBus.
 */
public class SimpleEventBus implements EventBus {

    /**
     * Singleton
     */
    private static final SimpleEventBus BUS = new SimpleEventBus();

    /** 
     * Each event type has its own list of subscriptions.
     */
    private final Map<Class, List<EventBusListener>> subscriptions = new HashMap<>();    
 
    /**
     * Singleton constructor.
     */
    private SimpleEventBus() {
        // singleton
    }

    /**
     * Access the only instance.
     * @return the bus instance.
     */
    public static EventBus getBus() {
        return BUS;
    }

    /**
     * Publish an event.
     * @param event the event.
     * @return true if all subscribers return true.
     */
    @Override
    public boolean publish(EventObject event) {
        List<EventBusListener> subscriptionsForType = subscriptions.get(event.getClass());
        boolean result = true;
        if (subscriptionsForType != null) {
            for (EventBusListener next : subscriptionsForType) {
                result &= next.eventPublished(event);
            }
        }
        return result;
    }

    /**
     * Subscripe for an event of a given type.
     * @param type the type of the event to subscribe.
     * @param listener the callback listener which will be called when the event is published.
     */
    @Override
    public void subscribe(Class type, EventBusListener listener) {
        subscriptions.putIfAbsent(type, new ArrayList<>());
        subscriptions.get(type).add(listener);
    }
}
