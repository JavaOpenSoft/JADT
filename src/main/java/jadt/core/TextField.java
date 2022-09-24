package jadt.core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TextField extends AppComponent{
    private final JTextField jTextField = new JTextField();
    public TextField(Icon icon) {

    }
    public void setText(String text) {
        jTextField.setText(text);
    }
    public JTextField getComponent() {
        return jTextField;
    }
    public String getText() {
        return jTextField.getText();
    }
    public boolean isEditable() {
        return jTextField.isEditable();
    }
    public void editable(boolean isEditable) {
        jTextField.setEditable(isEditable);
    }
    public void setHint(String hint, AppComponent appComponent) {
        jTextField.setForeground(Color.gray);
        jTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextField.setText("");
            }
        });
        appComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextField.setText(hint);
                jTextField.setEditable(false);
            }
        });
        jTextField.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                jTextField.setText(hint);
            }
        });
    }


}
