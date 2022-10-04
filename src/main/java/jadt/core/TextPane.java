package jadt.core;

import javax.swing.*;

@SuppressWarnings("FieldMayBeFinal")
public class TextPane {
    @SuppressWarnings("FieldMayBeFinal")
    private JTextPane jTextPane = new JTextPane();
    public JTextPane getComponent() {
        return jTextPane;
    }
}
