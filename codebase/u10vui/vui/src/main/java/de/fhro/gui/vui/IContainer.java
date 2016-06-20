package de.fhro.gui.vui;

/**
 * Container interface.
 */
public interface IContainer extends IComponent {
    
    /**
     * Sets the layout manager.
     * @param layout a layout manager.
     */
    public void setLayout(ILayoutManager layout);

    /**
     * Adds a component.
     * @param component a component.
     */
    public void add(IComponent component);

    /**
     * Adds a component with layout params.
     * @param component the component.
     * @param layoutParams the layoutParams.
     */
    public void add(IComponent component, Object layoutParams);
}