package de.fhro.gui.vui.swing;

import de.fhro.gui.vui.*;

/**
 * Factory fuer Swing-Adapter.
 */
public class SwingFactory implements IFactory {

    @Override
    public IButton createButton() {
        return new SwingButton();
    }

    @Override
    public IFrame createFrame() {
        return new SwingFrame();
    }

    @Override
    public ITextField createTextField() {
        return new SwingTextField();
    }

    @Override
    public ILayoutManager createFlowLayout() {
        return new SwingFlowLayout();
    }

    @Override
    public String toString() {
        return "SWING-Factory";
    }
}