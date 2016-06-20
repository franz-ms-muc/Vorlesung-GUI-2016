package de.fhro.gui.vui;

import java.awt.event.ActionListener;

public class VTextField extends VComponent {
    public VTextField() {
        super(VFactory.getInstance().createTextField());
    }

    public void addActionListener(ActionListener al) {
        ((ITextField) delegate).addActionListener(al);
    }

    public void removeActionListener(ActionListener al) {
        ((ITextField) delegate).removeActionListener(al);
    }
}