package de.fhro.gui.vui.swing;

import de.fhro.gui.vui.ILayoutManager;

import java.awt.*;

/**
 * FlowLayout Adapter.
 */
class SwingFlowLayout extends FlowLayout implements ILayoutManager {
    public SwingFlowLayout() {
        super(FlowLayout.LEFT);
    }
}