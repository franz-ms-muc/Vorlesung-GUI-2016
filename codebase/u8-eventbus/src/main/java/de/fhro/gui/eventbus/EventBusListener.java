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

/**
 * The callback interface.
 * @param <T> the event type which will be published.
 */
public interface EventBusListener<T> {

    /**
     * Method will be called by the bus if the event type is subscribed by this
     * listener.
     *
     * @param event the event.
     * @return true if the event was consumed.
     */
    boolean eventPublished(T event);
}