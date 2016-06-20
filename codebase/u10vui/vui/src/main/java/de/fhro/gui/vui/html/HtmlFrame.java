package de.fhro.gui.vui.html;

import de.fhro.gui.vui.IFrame;

import java.io.*;

/**
 * HTML-Frame-Adapter
 */
public class HtmlFrame extends HtmlContainer implements IFrame {

    @Override
    public void pack() {
    }

    @Override
    protected String toHtml() {
        return "<html><title>" + text + "</title><body>" + super.toHtml() + "</body></html>";
    }

    @Override
    public void setVisible(boolean b) {
        if (b) {
            // Test only
            try {
                File tempFile = File.createTempFile("VUI", ".html");
                try (OutputStream os = new FileOutputStream(tempFile); BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os))) {
                    bw.write(toHtml());
                }
                // "open" only works for OSX.
                Process p = Runtime.getRuntime().exec("open " + tempFile.getAbsolutePath());
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}