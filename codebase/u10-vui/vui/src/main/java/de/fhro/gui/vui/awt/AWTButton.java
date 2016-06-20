package de.fhro.gui.vui.awt;

import de.fhro.gui.vui.IButton;

import java.awt.*;

/**
 * AWT-Button-Adapter
 */
public class AWTButton extends Button implements IButton {

    @Override
    public void setText(String text) {
        super.setLabel(text);
    }
}