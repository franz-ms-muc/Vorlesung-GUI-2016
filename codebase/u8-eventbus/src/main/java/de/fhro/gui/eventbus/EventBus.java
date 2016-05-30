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

import java.util.EventObject;

/**
 * The event bus for loose coupling of separate ui components.
 * @param <T> the type of the event.
 */
public interface EventBus<T extends EventObject> {

    /**
     * Publish a event to all registered listeners. The event ist dispatched by
     * using event.getClass().
     *
     * @param event the event.
     * @return false if the event was not correct published.
     */
    boolean publish(T event);

    /**
     * Subscribe for a given type of event. The type is not polymorphic. You
     * have to make a separate subscription for every concrete type.
     *
     * @param type the event type to subscribe.
     * @param listener your listener, which will be called if a event happens.
     */
    void subscribe(Class<T> type, EventBusListener<T> listener);
}
