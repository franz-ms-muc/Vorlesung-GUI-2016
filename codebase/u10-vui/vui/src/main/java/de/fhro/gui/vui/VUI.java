package de.fhro.gui.vui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Simple VUI Test
 */
public class VUI {

    /**
     * Portabler UI-CODE nutzt Komponenten �ber eine Factory direkt
     * @param fac die Fabrik.
     */
    public static void createUI(IFactory fac) {
        IFrame f = fac.createFrame();
        f.setLayout(fac.createFlowLayout());

        IButton b1 = fac.createButton();
        IButton b2 = fac.createButton();

        b1.setText("Name aendern");
        b1.addActionListener(System.out::println);

        b2.setText("Passwort aendern");
        b2.addActionListener(System.out::println);

        ITextField f1 = fac.createTextField();
        ITextField f2 = fac.createTextField();

        f1.setText("Johannes Weigend");
        f2.setText("Test 123");
        f.setText("VUI Test - (c) weigend software engineering 2001 - 20016");

        f.add(f1);
        f.add(b1);
        f.add(f2);
        f.add(b2);

        f.pack();
        f.setVisible(true);
    }

    /**
     * Portabler Code TEIL 2 - Entkopplung per Bridge
     */
    public static void createUI() {
        VFrame f = new VFrame();
        f.setLayout(new VFlowLayout());

        VButton b1 = new VButton();
        VButton b2 = new VButton();

        b1.setText("Name aendern");
        b1.addActionListener(System.out::println);

        b2.setText("Passwort aendern");
        b2.addActionListener(System.out::println);

        VTextField f1 = new VTextField();
        VTextField f2 = new VTextField();

        f1.setText("Johannes Weigend");
        f2.setText("Mary has a little lamb");
        f.setText("VUI Test - (c) weigend software engineering 2001 - 2016");

        f.add(f1);
        f.add(b1);
        f.add(f2);
        f.add(b2);

        f.pack();
        f.setVisible(true);
    }

    /**
     * Simple Test-GUI for Selection of different Factorys
     * @param args args.
     */
    public static void main(String[] args) {
        final IFactory[] fac = {new de.fhro.gui.vui.awt.AWTFactory(),
            new de.fhro.gui.vui.swing.SwingFactory(),
            new de.fhro.gui.vui.html.HtmlFactory(),
            new de.fhro.gui.vui.jfx.JfxFactory()};

        SwingUtilities.invokeLater(() -> new TestUI(fac).setVisible(true));
    }

    private static final class TestUI extends JDialog {

        TestUI(IFactory[] fac) {
            super.setTitle("Select Factory");
            combo = new JComboBox(fac);
            button = new JButton("create Dialog");
            button.addActionListener((ActionEvent e) -> {
                createUI((IFactory) combo.getSelectedItem());
            });
            super.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            Component add = super.getContentPane().add(combo);
            super.getContentPane().add(button, BorderLayout.SOUTH);
            super.pack();
        }

        private final JComboBox combo;
        private final JButton button;
    }
}
