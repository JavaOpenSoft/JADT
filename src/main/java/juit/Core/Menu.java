package juit.Core;

import javax.swing.*;
import java.awt.*;

public class Menu {
    JMenu menu = new JMenu();
    String Text;
    String FontName;
    String FontType;
    short size;
    public Menu(String Text)
    {
        menu.setText(Text);
        this.Text = Text;

    }
    public void setText(String Text)
    {
        menu.setText(Text);
        this.Text = Text;
    }
    public void setFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))menu.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))menu.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))menu.setFont(new Font(FontName, Font.ITALIC, size));
        this.FontName = FontName;
        this.FontType = FontType;
        this.size = size;
    }
    public String getText()
    {
        return this.Text;
    }
    public String getFontName()
    {
        return this.FontName;
    }
    public String getFontType()
    {
        return this.FontType;
    }
    public short getFontSize()
    {
        return this.size;
    }
    public void add(RadioButtonMenuItem radioButtonMenuItem){
        menu.add(radioButtonMenuItem.jRadioButtonMenuItem);
    }
    public void add(CheckboxMenuItem checkboxMenuItem)
    {
        menu.add(checkboxMenuItem.jCheckBoxMenuItem);
    }
}
