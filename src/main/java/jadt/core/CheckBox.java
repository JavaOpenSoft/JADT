package jadt.core;

import jadt.JADTComponent;
import jadt.events.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("all")
public class CheckBox extends JADTComponent {
    private final JCheckBox jCheckBox = new JCheckBox();

    private String FontName = "SansSerif";
    private short FontSize = 13;
    private String FontType = "Plain";
    private final short  sizeX = 100;
    private final short  sizeY = 30;
    private final short positionX = 0;
    private final short positionY = 0;
    public CheckBox(){
        jCheckBox.setFont(new Font(FontName, Font.PLAIN, FontSize));
        jCheckBox.setBounds(positionX,positionY, sizeX, sizeY);
        jCheckBox.setForeground(new java.awt.Color(50,100,250));
    }
    public CheckBox(String Text){
        jCheckBox.setText(Text);
        jCheckBox.setFont(new Font(FontName, Font.PLAIN, FontSize));
        jCheckBox.setBounds(positionX,positionY, sizeX, sizeY);
        jCheckBox.setForeground(new jadt.graphics.Color(50,100,250));
    }
    public CheckBox(Icon icon){
        jCheckBox.setFont(new Font(FontName, Font.PLAIN, FontSize));
        jCheckBox.setBounds(positionX,positionY, sizeX, sizeY);
        jCheckBox.setForeground(new jadt.graphics.Color(50,100,250));
        jCheckBox.setIcon(icon);
    }
    public CheckBox(String Text,Icon icon){
        jCheckBox.setText(Text);
        jCheckBox.setFont(new Font(FontName, Font.PLAIN, FontSize));
        jCheckBox.setBounds(positionX,positionY, sizeX, sizeY);
        jCheckBox.setForeground(new jadt.graphics.Color(50,100,250));
        jCheckBox.setIcon(icon);
    }
    public JCheckBox getComponent() {
        return jCheckBox;
    }
    public String getFontName() {
        return jCheckBox.getFont().getFamily();
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

    public boolean isOpaque(){
        return jCheckBox.isOpaque();
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
    public void addActionEvent(@NotNull ActionEvent event)
    {
        jCheckBox.addActionListener(event);
    }
    public void removeActionEvent(@NotNull ActionEvent event){jCheckBox.removeActionListener(event);}

    public void addAncestorEvent(@NotNull AncestorEvent event){jCheckBox.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){jCheckBox.removeAncestorListener(event);}

    public void addChangeEvent(@NotNull ChangeEvent event){jCheckBox.addChangeListener(event);}
    public void removeChangeEvent(@NotNull ChangeEvent event){jCheckBox.removeChangeListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){jCheckBox.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){jCheckBox.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){jCheckBox.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){jCheckBox.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){jCheckBox.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){jCheckBox.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){jCheckBox.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){jCheckBox.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){jCheckBox.addHierarchyBoundsListener(event);}
    public void removeHeirarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){jCheckBox.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){jCheckBox.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){jCheckBox.removeInputMethodListener(event);}

    public void addItemEvent(@NotNull ItemEvent event){jCheckBox.addItemListener(event);}
    public void removeItemEvent(@NotNull ItemEvent event){jCheckBox.removeItemListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){jCheckBox.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){jCheckBox.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){jCheckBox.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){jCheckBox.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){jCheckBox.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){jCheckBox.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){jCheckBox.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){jCheckBox.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){jCheckBox.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){jCheckBox.removeVetoableChangeListener(event);}
}