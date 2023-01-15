package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import jadt.events.*;
@SuppressWarnings("all")
public class MenuBar extends JADTComponent {
    private JMenuBar menuBar = new JMenuBar();
    private DraggableComponent draggableComponent;
    private int positionX;
    private int positionY;
    private int sizeX;
    private int sizeY;

    public void add(Menu menu){
        menuBar.add(menu.getComponent());
    }

    public void remove(Menu menu)
    {
        menuBar.remove(menu.getComponent());
    }
    public void setSize(int sizeX, int sizeY)
    {
        menuBar.setSize(sizeX, sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX, int positionY)
    {
        menuBar.setLocation(positionX, positionY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setBounds(int positionX, int positionY, int sizeX, int sizeY){
        menuBar.setBounds(positionX, positionY, sizeX, sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public JMenuBar getComponent(){
        return menuBar;
    }

    public void addAncestorEvent(@NotNull AncestorEvent event){menuBar.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){menuBar.removeAncestorListener(event);}


    public void addComponentEvent(@NotNull ComponentEvent event){menuBar.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){menuBar.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){menuBar.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){menuBar.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){menuBar.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){menuBar.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){menuBar.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){menuBar.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){menuBar.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){menuBar.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){menuBar.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){menuBar.removeInputMethodListener(event);}


    public void addKeyEvent(@NotNull KeyEvent event){menuBar.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){menuBar.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){menuBar.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){menuBar.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){menuBar.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){menuBar.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){menuBar.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){menuBar.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){menuBar.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){menuBar.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggableComponent = new DraggableComponent(menuBar);
        }
        else if(!isDraggable){
            draggableComponent.removeDraggingAbilities();
        }
    }
}
