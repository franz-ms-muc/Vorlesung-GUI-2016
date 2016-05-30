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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Class EventSubscriber.
 */
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface EventSubscriber {

    Class eventClass();
}
