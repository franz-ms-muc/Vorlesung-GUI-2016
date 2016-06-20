package de.fhro.gui.vui.awt;

import de.fhro.gui.vui.IComponent;
import de.fhro.gui.vui.IFrame;
import de.fhro.gui.vui.ILayoutManager;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * AWT-Frame-Adapter
 */
public class AWTFrame extends Frame implements IFrame {

    public AWTFrame() {
        // Like Swing Frame (Dispose on close)
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void setText(String text) {
        super.setTitle(text);
    }

    @Override
    public void setLayout(ILayoutManager lm) {
        super.setLayout((LayoutManager) lm);
    }

    @Override
    public void add(IComponent c) {
        super.add((Component) c);
    }

    @Override
    public void add(IComponent c, Object constraints) {
        super.add((Component) c, constraints);
    }
}