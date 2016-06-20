package de.fhro.gui.vui.awt;

import de.fhro.gui.vui.*;

/**
 * Factory fuer AWT-Adapter.
 */
public class AWTFactory implements IFactory {

    @Override
    public IButton createButton() {
        return new AWTButton();
    }

    @Override
    public ITextField createTextField() {
        return new AWTTextField();
    }

    @Override
    public IFrame createFrame() {
        return new AWTFrame();
    }

    @Override
    public ILayoutManager createFlowLayout() {
        return new AWTFlowLayout();
    }

    @Override
    public String toString() {
        return "AWT-Factory";
    }
}