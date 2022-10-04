package jadt.core;

import javax.swing.*;

@SuppressWarnings("FieldMayBeFinal")
public class FormattedTextField {
    @SuppressWarnings("FieldMayBeFinal")
    private JFormattedTextField formattedTextField = new JFormattedTextField();
    public JFormattedTextField getComponent() {
        return formattedTextField;
    }
}
