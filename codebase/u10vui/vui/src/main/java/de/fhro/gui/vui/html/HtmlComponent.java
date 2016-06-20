package de.fhro.gui.vui.html;

import de.fhro.gui.vui.IComponent;
import de.fhro.gui.vui.ILayoutManager;

/**
 * Baseclass for all Html-Components
 */
public abstract class HtmlComponent implements IComponent {

    protected abstract String toHtml();

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void setVisible(boolean state) {
        this.visible = state;
    }

    public void setLayout(ILayoutManager lm) {
        this.layout = lm;
    }

    public int getId() {
        return hashCode();
    }

    String text;
    private boolean visible;
    private ILayoutManager layout;
    private HtmlFlowLayout lnkHtmlFlowLayout;
}