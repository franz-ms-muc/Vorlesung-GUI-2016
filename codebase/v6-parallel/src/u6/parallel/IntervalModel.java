/*
 * _____________________________________________________________________________
 * 
 *           Project:    GUI 2015
 * _____________________________________________________________________________
 * 
 *        Created by:    Johannes Weigend, QAware GmbH
 *     Creation date:    March - July 2015
 * _____________________________________________________________________________
 * 
 *         Copyright:    Hochschule Rosenheim
 * _____________________________________________________________________________ 
 */
package u6.parallel;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * Simple Model
 *
 * @author weigend
 */
public class IntervalModel {

    private final IntegerProperty value = new SimpleIntegerProperty();
    
    private final BooleanBinding atEnd;
    
    private final BooleanBinding atStart;
   
    private final int maxValue;

    /**
     * Counts from 0 until N
     *
     * @param maxValue the maximum N
     */
    IntervalModel(int maxValue) {
        this.maxValue = maxValue;
        this.atEnd = this.value.greaterThan(maxValue - 1);
        this.atStart = this.value.isEqualTo(0);
    }

    int getValue() {
        return value.get();
    }

    IntegerProperty valueProperty() {
        return this.value;
    }
    
    BooleanBinding atEnd() {
        return atEnd;
    }

    BooleanBinding atStart() {
        return atStart;
    }

    void increase() {
        if (getValue() < maxValue) {
            this.value.setValue(getValue() + 1);
        }
    }

    void decrease() {
        if (getValue() > 0) {
            this.value.setValue(getValue() - 1);
        }
    }
}
