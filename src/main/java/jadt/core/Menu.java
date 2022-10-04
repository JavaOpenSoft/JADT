package jadt.core;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("ALL")
public class Menu {
    private final JMenu menu = new JMenu();
    private String Text;
    private String FontName;
    private String FontType;
    private short fontSize;
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
        this.fontSize = size;
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
        return this.fontSize;
    }
    public void add(RadioButtonMenuItem radioButtonMenuItem){
        menu.add(radioButtonMenuItem.getComponent());
    }
    public void add(CheckboxMenuItem checkboxMenuItem)
    {
        menu.add(checkboxMenuItem.getComponent());
    }
    public void add(Menu menu){
        this.menu.add(menu.getComponent());
    }
    public void add(MenuItem menuItem){menu.add(menuItem.getComponent());}
    public JMenu getComponent(){
        return menu;
    }
}
