package juit.Core;

import javax.swing.*;

public class RadioButtonMenuItem {
    JRadioButtonMenuItem jRadioButtonMenuItem = new JRadioButtonMenuItem();
    String Text;
    public RadioButtonMenuItem(String Text)
    {
        setText(Text);
    }
    public void setText(String Text)
    {
        jRadioButtonMenuItem.setText(Text);
        this.Text = Text;
    }

}
