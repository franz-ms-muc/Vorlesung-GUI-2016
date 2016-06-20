package de.fhro.gui.vui;

import java.awt.event.ActionListener;


/**
 * Text field.
 * @author weigend
 */
public interface ITextField extends IComponent {
    
    /**
     * adds an action listener.
     * @param al the action listener.
     */
    public void addActionListener(ActionListener al);

    /**
     * removes an action listener.
     * @param al the action listener.
     */
    public void removeActionListener(ActionListener al);
}