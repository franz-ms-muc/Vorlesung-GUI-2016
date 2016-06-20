package de.fhro.gui.vui;

/**
 * Widget Factory (Abstract Factory Pattern)
 */
public interface IFactory {
   
    /**
     * Creates a button.
     * @return a button.
     */
    public IButton createButton();

    /**
     * Creates a text field.
     * @return a textfield.
     */
    public ITextField createTextField();

    /**
     * Creates a frame.
     * @return a frame.
     */
    public IFrame createFrame();


    /**
     * Create a flow layout.
     * @return a flow layout.
     */
    public ILayoutManager createFlowLayout();
}