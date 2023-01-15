package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import org.jetbrains.annotations.NotNull;
import jadt.events.*;
import javax.swing.*;

@SuppressWarnings("FieldMayBeFinal")
public class ToggleSwitch extends JADTComponent {
    private int positionX;
    private int positionY;
    private int sizeX;
    private int sizeY;
    private DraggableComponent draggableComponent;
    @SuppressWarnings("FieldMayBeFinal")
    private JToggleButton toggleButton = new JToggleButton();

    public String getText() {
        return toggleButton.getText();
    }
    public int getPositionX() {
        return positionX;
    }
    public int getPositionY() {
        return positionY;
    }
    public int getSizeX() {
        return sizeX;
    }
    public int getSizeY() {
        return sizeY;
    }
    public JToggleButton getComponent(){
        return toggleButton;
    }
    public void setState(boolean state){
        toggleButton.setEnabled(state);
    }
    public void show(){
        toggleButton.setVisible(true);
    }
    public void hide(){
        toggleButton.setVisible(false);
    }

    public void setBounds(int sizeX, int sizeY,int positionX, int positionY){
        toggleButton.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void addActionEvent(@NotNull ActionEvent event)
    {
        toggleButton.addActionListener(event);
    }
    public void removeActionEvent(@NotNull ActionEvent event){toggleButton.removeActionListener(event);}

    public void addAncestorEvent(@NotNull AncestorEvent event){toggleButton.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){toggleButton.removeAncestorListener(event);}

    public void addChangeEvent(@NotNull ChangeEvent event){toggleButton.addChangeListener(event);}
    public void removeChangeEvent(@NotNull ChangeEvent event){toggleButton.removeChangeListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){toggleButton.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){toggleButton.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){toggleButton.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){toggleButton.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){toggleButton.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){toggleButton.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){toggleButton.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){toggleButton.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){toggleButton.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){toggleButton.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){toggleButton.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){toggleButton.removeInputMethodListener(event);}

    public void addItemEvent(@NotNull ItemEvent event){toggleButton.addItemListener(event);}
    public void removeItemEvent(@NotNull ItemEvent event){toggleButton.removeItemListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){toggleButton.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){toggleButton.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){toggleButton.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){toggleButton.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){toggleButton.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){toggleButton.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){toggleButton.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){toggleButton.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){toggleButton.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){toggleButton.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggableComponent = new DraggableComponent(toggleButton);
        }
        else if(!isDraggable){
            draggableComponent.removeDraggingAbilities();
        }
    }
    
}
