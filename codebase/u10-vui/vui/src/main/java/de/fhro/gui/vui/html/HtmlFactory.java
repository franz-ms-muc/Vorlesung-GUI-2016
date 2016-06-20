package de.fhro.gui.vui.html;

import de.fhro.gui.vui.*;

/**
 * Factory fuer HTML-Adapter
 */
public class HtmlFactory implements IFactory {

    @Override
    public IButton createButton() {
        return new HtmlButton();
    }

    @Override
    public IFrame createFrame() {
        return new HtmlFrame();
    }

    @Override
    public ILayoutManager createFlowLayout() {
        return new HtmlFlowLayout();
    }

    @Override
    public ITextField createTextField() {
        return new HtmlTextField();
    }

    @Override
    public String toString() {
        return "HTML-Factory";
    }
}