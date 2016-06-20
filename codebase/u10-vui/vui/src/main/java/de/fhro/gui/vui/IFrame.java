package de.fhro.gui.vui;

/**
 * Frame window interface.
 */
public interface IFrame extends IContainer {
    
    /** 
     * Resizes the window to the preferred size of all controls.
     */
    public void pack();
}