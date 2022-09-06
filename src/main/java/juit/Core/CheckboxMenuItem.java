package juit.Core;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckboxMenuItem {
    String Text = "";
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem();
    public void addActionListener(ActionListener actionListener)
    {
        jCheckBoxMenuItem.addActionListener(actionListener);
    }

    public JCheckBoxMenuItem getjCheckBoxMenuItem() {
        return jCheckBoxMenuItem;
    }
    public void setText(String Text)
    {
        jCheckBoxMenuItem.setText(Text);
    }

    public String getText() {
        return Text;
    }
    public void isHighlighted(boolean bool)
    {
        jCheckBoxMenuItem.setState(bool);
    }
}
