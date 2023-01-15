package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import jadt.events.*;
@SuppressWarnings("ALL")
public class Menu extends JADTComponent {
    private final JMenu menu = new JMenu();
    private DraggableComponent draggableComponent;
    public Menu() {}
    public Menu(String Text)
    {
        menu.setText(Text);

    }
    public void setText(String Text)
    {
        menu.setText(Text);
    }
    public void setFont(String FontName,String FontType,int size)
    {
        if(FontType.equals("Plain"))menu.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))menu.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))menu.setFont(new Font(FontName, Font.ITALIC, size));
    }
    public String getFontName()
    {
        return menu.getFont().getFamily();
    }
    public String getFontType()
    {
        return menu.getFont().getFamily();
    }
    public int getFontSize()
    {
        return menu.getFont().getSize();
    }
    public Font getFont() {
        return menu.getFont();
    }
    public String getText()
    {
        return menu.getText();
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
    public void addActionEvent(@NotNull ActionEvent event)
    {
        menu.addActionListener(event);
    }
    public void removeActionEvent(@NotNull ActionEvent event){menu.removeActionListener(event);}

    public void addAncestorEvent(@NotNull AncestorEvent event){menu.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){menu.removeAncestorListener(event);}

    public void addChangeEvent(@NotNull ChangeEvent event){menu.addChangeListener(event);}
    public void removeChangeEvent(@NotNull ChangeEvent event){menu.removeChangeListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){menu.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){menu.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){menu.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){menu.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){menu.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){menu.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){menu.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){menu.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){menu.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){menu.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){menu.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){menu.removeInputMethodListener(event);}

    public void addItemEvent(@NotNull ItemEvent event){menu.addItemListener(event);}
    public void removeItemEvent(@NotNull ItemEvent event){menu.removeItemListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){menu.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){menu.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){menu.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){menu.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){menu.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){menu.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){menu.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){menu.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){menu.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){menu.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggableComponent = new DraggableComponent(menu);
        }
        else if(!isDraggable){
            draggableComponent.removeDraggingAbilities();
        }
    }
}
