package de.fhro.gui.vui.awt;

import de.fhro.gui.vui.ILayoutManager;

import java.awt.*;

/**
 * FlowLayout-Adapter
 */
public class AWTFlowLayout extends FlowLayout implements ILayoutManager {
    public AWTFlowLayout() {
        super(FlowLayout.LEFT);
    }
}