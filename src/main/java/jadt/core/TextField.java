package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import jadt.events.*;

public class TextField extends JADTComponent {
    private final JTextField textField = new JTextField();
    private DraggableComponent draggable;
    public TextField(Icon icon) {

    }
    public void setText(String text) {
        textField.setText(text);
    }
    public JTextField getComponent() {
        return textField;
    }
    public String getText() {
        return textField.getText();
    }
    public boolean isEditable() {
        return textField.isEditable();
    }
    public void setEditable(boolean isEditable) {
        textField.setEditable(isEditable);
    }
    public void setBorder(Border border){
        textField.setBorder(border);
    }
    public void setHoverText(String text){
        textField.setToolTipText(text);
    }
    public void addActionEvent(@NotNull ActionEvent event)
    {
        textField.addActionListener(event);
    }
    public void removeActionEvent(@NotNull ActionEvent event){textField.removeActionListener(event);}

    public void addAncestorEvent(@NotNull AncestorEvent event){textField.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){textField.removeAncestorListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){textField.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){textField.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){textField.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){textField.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){textField.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){textField.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){textField.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){textField.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){textField.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){textField.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){textField.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){textField.removeInputMethodListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){textField.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){textField.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){textField.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){textField.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){textField.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){textField.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){textField.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){textField.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){textField.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){textField.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggable = new DraggableComponent(textField);
        }
        else if(!isDraggable){
            draggable.removeDraggingAbilities();
        }
    }
    public void setPreferredSize(int sizeX, int sizeY) { textField.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { textField.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { textField.setMinimumSize(new Dimension(sizeX, sizeY)); }

    public void setShape(Shape shape){
        textField.setMixingCutoutShape(shape);
    }
    public void setFont(String FontName,String FontType,int size)
    {
        if(FontType.equals("Plain"))textField.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))textField.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))textField.setFont(new Font(FontName, Font.ITALIC, size));
    }
    public String getFontName()
    {
        return textField.getFont().getFamily();
    }
    public String getFontType()
    {
        return textField.getFont().getFamily();
    }
    public int getFontSize()
    {
        return textField.getFont().getSize();
    }
    public Font getFont() {
        return textField.getFont();
    }

}
