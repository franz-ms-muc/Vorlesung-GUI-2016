package de.fhro.gui.vui.html;

import de.fhro.gui.vui.ITextField;

import java.awt.event.ActionListener;

/**
 * HTML-TextField-Adapter
 */
public class HtmlTextField extends HtmlComponent implements ITextField {

    @Override
    public String toHtml() {
        return "<input id=\"" + getId() + "\" type=\"textfield\" value=\"" + text + "\" name=\"TextField" + getId() + "\">";
    }

    @Override
    public void addActionListener(ActionListener al) {
        // TODO
    }

    @Override
    public void removeActionListener(ActionListener al) {
        // TODO
    }
}