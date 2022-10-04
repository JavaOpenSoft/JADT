package jadt.core;

import javax.swing.*;

@SuppressWarnings("FieldMayBeFinal")
public class ExpandableButton {
    @SuppressWarnings("FieldMayBeFinal")
    private JButton expandableButton = new JButton();
    public JButton getComponent(){
        return expandableButton;
    }
}
