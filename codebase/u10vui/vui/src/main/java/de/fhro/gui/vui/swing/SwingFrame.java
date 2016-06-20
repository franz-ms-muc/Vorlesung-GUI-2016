package de.fhro.gui.vui.swing;

import de.fhro.gui.vui.IComponent;
import de.fhro.gui.vui.IFrame;
import de.fhro.gui.vui.ILayoutManager;

import javax.swing.*;
import java.awt.*;

/**
 * Swing-Frame-Adapter.
 */
public class SwingFrame extends JFrame implements IFrame {

    @Override
    public void setText(String text) {
        super.setTitle(text);
    }

    @Override
    public void setLayout(ILayoutManager lm) {
        super.getContentPane().setLayout((LayoutManager) lm);
    }

    @Override
    public void add(IComponent c) {
        super.getContentPane().add((JComponent) c);
    }

    @Override
    public void add(IComponent c, Object constraints) {
        super.getContentPane().add((JComponent) c, constraints);
    }
}