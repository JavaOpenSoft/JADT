package jadt.core;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class CheckBox {
    private final JCheckBox jCheckBox = new JCheckBox();
    private String FontName = "SansSerif";
    private short FontSize = 13;
    private String FontType = "Plain";
    private final short  SizeX = 100;
    private final short  SizeY = 30;
    private final short PositionX = 0;
    private final short PositionY = 0;
    public CheckBox(){
        jCheckBox.setFont(new Font(FontName, Font.PLAIN, FontSize));
        jCheckBox.setBounds(PositionX,PositionY, SizeX, SizeY);
        jCheckBox.setForeground(new java.awt.Color(50,100,250));
    }
    public CheckBox(String Text){
        jCheckBox.setText(Text);
        jCheckBox.setFont(new Font(FontName, Font.PLAIN, FontSize));
        jCheckBox.setBounds(PositionX,PositionY, SizeX, SizeY);
        jCheckBox.setForeground(new jadt.graphics.Color(50,100,250));
    }
    public CheckBox(Icon icon){
        jCheckBox.setFont(new Font(FontName, Font.PLAIN, FontSize));
        jCheckBox.setBounds(PositionX,PositionY, SizeX, SizeY);
        jCheckBox.setForeground(new jadt.graphics.Color(50,100,250));
        jCheckBox.setIcon(icon);
    }
    public CheckBox(String Text,Icon icon){
        jCheckBox.setText(Text);
        jCheckBox.setFont(new Font(FontName, Font.PLAIN, FontSize));
        jCheckBox.setBounds(PositionX,PositionY, SizeX, SizeY);
        jCheckBox.setForeground(new jadt.graphics.Color(50,100,250));
        jCheckBox.setIcon(icon);
    }
    public JCheckBox getComponent() {
        return jCheckBox;
    }

    public void setChecked(boolean state) {
        jCheckBox.setSelected(state);
    }

    public boolean isChecked() {
        return jCheckBox.isSelected();
    }

    public void setColor(Color color) {
        jCheckBox.setForeground(color);
    }

    public void addActionListener(ActionListener actionListener) {
        jCheckBox.addActionListener(actionListener);
    }
    public boolean isOpaque(){
        return jCheckBox.isOpaque();
    }
    public void removeActionListener(ActionListener actionListener) {
        jCheckBox.removeActionListener(actionListener);
    }
    public void addMouseListener(MouseListener mouseListener) {
        jCheckBox.addMouseListener(mouseListener);
    }
    public void removeMouseListener(MouseListener mouseListener) {
        jCheckBox.removeMouseListener(mouseListener);
    }
    public void addAncestorListener(AncestorListener ancestorListener) {
        jCheckBox.addAncestorListener(ancestorListener);
    }
    public void removeAncestorListener(AncestorListener ancestorListener) {
        jCheckBox.removeAncestorListener(ancestorListener);
    }
    public void setTextFont(String FontName, String FontType, short size) {
        if(FontType.equals("Plain")) {
            jCheckBox.setFont(new Font(FontName, Font.PLAIN, size));
            this.FontType = "Plain";

        }
        if(FontType.equals("Bold"))jCheckBox.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))jCheckBox.setFont(new Font(FontName, Font.ITALIC, size));
    }
    public int getFontSize(){
        return jCheckBox.getFont().getSize();
    }
    public String getFontType(){
        return FontType;
    }
    public void loadCustomFont(String FontFile) throws IOException, FontFormatException {
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(FontFile)));
        this.FontName = new File(FontFile).getName();
    }
}