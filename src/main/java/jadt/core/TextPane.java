package jadt.core;

import javax.swing.*;

public class TextPane extends AppComponent{
    private JTextPane jTextPane = new JTextPane();
    public JTextPane getComponent() {
        return jTextPane;
    }
}
