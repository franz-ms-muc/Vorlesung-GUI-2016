package de.fhro.gui.vui;

import java.awt.event.ActionListener;

/**
 * Simple button interface.
 */
public interface IButton extends IComponent {

    /**
     * Add action listener.
     * @param al a awt action listener.
     */
    public void addActionListener(ActionListener al);

    /**
     * Removes a listener if already added.
     * @param al the listener.
     */
    public void removeActionListener(ActionListener al);
}
