package jadt.core;

import jadt.JADTComponent;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeListener;
import javax.swing.event.MenuDragMouseListener;
import javax.swing.event.MenuKeyListener;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
public class CheckboxMenuItem extends JADTComponent {
    private final JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem();
    public void setText(String Text)
    {
        jCheckBoxMenuItem.setText(Text);
    }

    public String getText() {
        return jCheckBoxMenuItem.getText();
    }
    public void isHighlighted(boolean bool)
    {
        jCheckBoxMenuItem.setState(bool);
    }

    public boolean isHighlighted() {
        return jCheckBoxMenuItem.getState();
    }
    public JCheckBoxMenuItem getComponent() {
        return jCheckBoxMenuItem;
    }
    public void setColor(jadt.graphics.Color color){
        jCheckBoxMenuItem.setForeground(color);
    }
    public void addAncestorListener(AncestorListener listener){
        jCheckBoxMenuItem.addAncestorListener(listener);
    }
    public void removeAncestorListener(AncestorListener listener){
        jCheckBoxMenuItem.removeAncestorListener(listener);
    }
    public void addActionListener(ActionListener actionListener)
    {
        jCheckBoxMenuItem.addActionListener(actionListener);
    }
    public void removeActionListener(ActionListener listener){
        jCheckBoxMenuItem.removeActionListener(listener);
    }
    public void setState(boolean state) {
        jCheckBoxMenuItem.setState(state);
    }
    public boolean getState() {
        return jCheckBoxMenuItem.getState();
    }
    public void addMouseListener(MouseListener listener) {
        jCheckBoxMenuItem.addMouseListener(listener);
    }
    public void removeMouseListener(MouseListener listener) {
        jCheckBoxMenuItem.removeMouseListener(listener);
    }
    public void addChangeListener(ChangeListener listener) {
        jCheckBoxMenuItem.addChangeListener(listener);
    }
    public void removeChangeListener(ChangeListener listener) {
        jCheckBoxMenuItem.removeChangeListener(listener);
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        jCheckBoxMenuItem.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        jCheckBoxMenuItem.removePropertyChangeListener(listener);
    }
    public void addKeyListener(KeyListener listener){
        jCheckBoxMenuItem.addKeyListener(listener);
    }
    public void removeKeyListener(KeyListener listener){
        jCheckBoxMenuItem.removeKeyListener(listener);
    }
    public void addMouseWheelListener(MouseWheelListener listener){
        jCheckBoxMenuItem.addMouseWheelListener(listener);
    }
    public void addItemListener(ItemListener listener) {

        jCheckBoxMenuItem.addItemListener(listener);
    }
    public void removeItemListener(ItemListener listener) {
        jCheckBoxMenuItem.removeItemListener(listener);
    }
    public void addMenuDragMouseListener(MenuDragMouseListener listener) {
        jCheckBoxMenuItem.addMenuDragMouseListener(listener);
    }
    public void addMenuKeyListener(MenuKeyListener listener) {
        jCheckBoxMenuItem.addMenuKeyListener(listener);
    }
    public void removeMenuDragMouseListener(MenuDragMouseListener listener) {
        jCheckBoxMenuItem.removeMenuDragMouseListener(listener);
    }

}
