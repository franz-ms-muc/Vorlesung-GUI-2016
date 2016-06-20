package de.fhro.gui.vui;

/**
 * Bridge for the layout manager.
 */
public class VLayoutManager implements ILayoutManager {

    public VLayoutManager(ILayoutManager layout) {
        this.layout = layout;
    }

    public ILayoutManager getLayout() {
        return layout;
    }

    private final ILayoutManager layout;
}
