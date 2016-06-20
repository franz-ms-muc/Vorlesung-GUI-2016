package de.fhro.gui.vui;

public class VFrame extends VContainer {
    public VFrame() {
        super(VFactory.getInstance().createFrame());
    }

    public void pack() {
        ((IFrame) delegate).pack();
    }
}