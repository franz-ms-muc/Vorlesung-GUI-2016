package de.fhro.gui.vui;

/**
 */

public class VFactory implements IFactory {

    private VFactory() {
        this.factory = new de.fhro.gui.vui.swing.SwingFactory(); // DEFAULT
    }

    @Override
    public IButton createButton() {
        return factory.createButton();
    }

    @Override
    public ITextField createTextField() {
        return factory.createTextField();
    }

    @Override
    public IFrame createFrame() {
        return factory.createFrame();
    }

    @Override
    public ILayoutManager createFlowLayout() {
        return factory.createFlowLayout();
    }

    public static VFactory getInstance() {
        return instance == null ? instance = new VFactory() : instance;
    }

    public void setFactory(IFactory factory) {
        this.factory = factory;
    }

    private IFactory factory;
    private static VFactory instance;
}