package de.fhro.gui.vui;

public abstract class VComponent {
    public VComponent(IComponent delegate) {
        this.delegate = delegate;
    }

    public void setText(String text) {
        delegate.setText(text);
    }

    public void setVisible(boolean state) {
        delegate.setVisible(state);
    }

    protected IComponent delegate; // Bridge Pattern
}