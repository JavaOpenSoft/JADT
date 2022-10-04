package jadt.core;

import javax.swing.*;

@SuppressWarnings("FieldMayBeFinal")
public class RadioButtonMenuItem {
    @SuppressWarnings("FieldMayBeFinal")
    private JRadioButtonMenuItem jRadioButtonMenuItem = new JRadioButtonMenuItem();
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
    public JRadioButtonMenuItem getComponent(){
        return jRadioButtonMenuItem;
    }

}
