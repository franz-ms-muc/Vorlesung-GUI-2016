package de.fhro.gui.vui;

public abstract class VContainer extends VComponent {
    public VContainer(IComponent delegate) {
        super(delegate);
    }

    public void setLayout(VLayoutManager lm) {
        ((IContainer) delegate).setLayout(lm.getLayout());
    }

    public void add(VComponent c) {
        ((IContainer) delegate).add(c.delegate);
    }

    public void add(VComponent c, Object constraints) {
        ((IContainer) delegate).add(c.delegate, constraints);
    }
}