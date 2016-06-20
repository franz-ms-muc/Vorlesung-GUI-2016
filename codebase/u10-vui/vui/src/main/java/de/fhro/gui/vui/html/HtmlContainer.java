package de.fhro.gui.vui.html;

import de.fhro.gui.vui.IComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Baseclass for all Html-Container
 */
public class HtmlContainer extends HtmlComponent {
    public void add(IComponent c) {
        components.add(c);
    }

    public void add(IComponent c, Object constraints) {
        components.add(c);
    }

    @Override
    protected String toHtml() {
        StringBuilder b = new StringBuilder();
        b.append("<form>");
        for (Iterator i = components.iterator(); i.hasNext();) {
            b.append(((HtmlComponent) i.next()).toHtml());
        }
        b.append("</form>");
        return b.toString();
    }

    private final ArrayList components = new ArrayList();

    /**
     * @link aggregation
     * @supplierCardinality 0..*
     */
    private HtmlComponent lnkHtmlComponent;
}