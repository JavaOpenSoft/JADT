package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import jadt.events.*;

@SuppressWarnings("FieldMayBeFinal")
public class TextPane extends JADTComponent {
    @SuppressWarnings("FieldMayBeFinal")
    private JTextPane textPane = new JTextPane();
    private DraggableComponent draggableComponent;
    public void setSize(int sizeX, int sizeY) {textPane.setSize(sizeX, sizeY);}
    public void setText(String text) {textPane.setText(text);}
    public void append(String text) {textPane.setText(textPane.getText()+text);}
    public void replace(char oldChar, char newChar) {textPane.setText(textPane.getText().replace(oldChar,newChar));}
    public void setPosition(int positionX, int positionY){textPane.setLocation(positionX,positionY);}
    public void setBounds(int sizeX, int sizeY, int positionX, int positionY){textPane.setBounds(positionX,positionY,sizeX,sizeY);}
    public JTextPane getComponent() {
        return textPane;
    }

    public void addAncestorEvent(@NotNull AncestorEvent event){
        textPane.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){
        textPane.removeAncestorListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){
        textPane.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){
        textPane.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){
        textPane.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){
        textPane.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){
        textPane.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){
        textPane.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){
        textPane.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){
        textPane.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){
        textPane.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){
        textPane.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){
        textPane.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){
        textPane.removeInputMethodListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){
        textPane.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){
        textPane.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){
        textPane.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){
        textPane.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){
        textPane.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){
        textPane.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){
        textPane.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){
        textPane.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){
        textPane.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){
        textPane.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggableComponent = new DraggableComponent(textPane);
        }
        else if(!isDraggable){
            draggableComponent.removeDraggingAbilities();
        }
    }

}
