package de.fhro.gui.vui;

import java.awt.event.ActionListener;

public class VButton extends VComponent {
    public VButton() {
        super(VFactory.getInstance().createButton());
    }

    public void addActionListener(ActionListener al) {
        ((IButton) delegate).addActionListener(al);
    }

    public void removeActionListener(ActionListener al) {
        ((IButton) delegate).removeActionListener(al);
    }
}