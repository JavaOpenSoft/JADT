package juit.Core;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckBox {
    JCheckBox jCheckBox = new JCheckBox();
    public void addActionListener(ActionListener actionListener)
    {
        jCheckBox.addActionListener(actionListener);
    }
}
