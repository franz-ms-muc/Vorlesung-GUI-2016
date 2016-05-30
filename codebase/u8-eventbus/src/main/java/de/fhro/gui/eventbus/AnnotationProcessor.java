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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class AnnotationProcessor.
 */
public class AnnotationProcessor {

    /**
     * Checks a given object for event bus subscription.
     * @param object the object.
     */
    public static void process(final Object object) {
        Class clazz = object.getClass();
        Method[] methods = clazz.getMethods();
        for (final Method method : methods) {
            if (method.isAnnotationPresent(EventSubscriber.class)) {
                EventSubscriber s = method.getAnnotation(EventSubscriber.class);
                SimpleEventBus.getBus().subscribe(s.eventClass(), (Object event) -> {
                    try {
                        return (Boolean) method.invoke(object, event);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | IllegalStateException e) {
                        throw new IllegalStateException(e);
                    }
                });
            }
        }
    }
}
