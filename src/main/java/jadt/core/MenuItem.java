package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import jadt.events.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.JMenuItem;
import java.awt.*;

@SuppressWarnings("ALL")
public class MenuItem extends JADTComponent {
    private JMenuItem menuItem = new JMenuItem();
    private DraggableComponent draggable;
    public MenuItem(String Text)
    {
        setText(Text);
    }
    public void add(RadioButtonMenuItem radioButtonMenuItem){
        menuItem.add(radioButtonMenuItem.getComponent());
    }
    public void add(CheckboxMenuItem checkboxMenuItem)
    {
        menuItem.add(checkboxMenuItem.getComponent());
    }
    public void setFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))menuItem.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))menuItem.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))menuItem.setFont(new Font(FontName, Font.ITALIC, size));

    }
    public void setText(String Text)
    {
        menuItem.setText(Text);
    }
    public String getText(){
        return menuItem.getText();
    }
    public String getFontName()
    {
        return menuItem.getFont().getFamily();
    }
    public String getFontType()
    {
        if(menuItem.getFont().isBold())return "Bold";
        else if(menuItem.getFont().isItalic())return "Italic";
        else if(menuItem.getFont().isPlain())return "Regular";
        return null;
    }
    public int getFontSize()
    {
        return menuItem.getFont().getSize();
    }
    public Font getFont(){return menuItem.getFont();}
    public JMenuItem getComponent(){
        return menuItem;
    }
    public void addActionEvent(@NotNull ActionEvent event)
    {
        menuItem.addActionListener(event);
    }
    public void removeActionEvent(@NotNull ActionEvent event){menuItem.removeActionListener(event);}

    public void addAncestorEvent(@NotNull AncestorEvent event){menuItem.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){menuItem.removeAncestorListener(event);}

    public void addChangeEvent(@NotNull ChangeEvent event){menuItem.addChangeListener(event);}
    public void removeChangeEvent(@NotNull ChangeEvent event){menuItem.removeChangeListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){menuItem.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){menuItem.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){menuItem.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){menuItem.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){menuItem.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){menuItem.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){menuItem.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){menuItem.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){menuItem.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){menuItem.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){menuItem.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){menuItem.removeInputMethodListener(event);}

    public void addItemEvent(@NotNull ItemEvent event){menuItem.addItemListener(event);}
    public void removeItemEvent(@NotNull ItemEvent event){menuItem.removeItemListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){menuItem.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){menuItem.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){menuItem.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){menuItem.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){menuItem.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){menuItem.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){menuItem.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){menuItem.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){menuItem.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){menuItem.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggable = new DraggableComponent(menuItem);
        }
        else if(!isDraggable){
            draggable.removeDraggingAbilities();
        }
    }
    public void removeIcon(){
        menuItem.setIcon(null);
    }
    public void setPreferredSize(int sizeX, int sizeY) { menuItem.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { menuItem.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { menuItem.setMinimumSize(new Dimension(sizeX, sizeY)); }

    public void setShape(Shape shape){
        menuItem.setMixingCutoutShape(shape);
    }

}
