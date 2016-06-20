package de.fhro.gui.vui.html;

import de.fhro.gui.vui.IButton;

import java.awt.event.ActionListener;

/**
 * Html-Button-Adapter
 */
public class HtmlButton extends HtmlComponent implements IButton {

    @Override
    public String toHtml() {
        return "<input id=\"" + getId() + "\" type=\"submit\" value=\"" + text + "\" name=\"Button" + getId() + "\">";
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