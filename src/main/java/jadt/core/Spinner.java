package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import jadt.events.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

public class Spinner extends JADTComponent {
    private JSpinner jSpinner;
    private DraggableComponent draggable;

    public Spinner(int initValue, int minimum,int maximum,int interval){
        SpinnerModel value = new SpinnerNumberModel(initValue, minimum, maximum, interval);
        jSpinner = new JSpinner();
    }
    int value,minimum,maximum,interval;
    int initValue;
    int positionX,positionY,sizeX,sizeY;

    public int getPositionX() {
        return positionX;
    }
    public  void setSize(int sizeX, int sizeY)
    {
        jSpinner.setSize(sizeX,sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void  setPosition(int positionX, int positionY)
    {
        jSpinner.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
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


    public int getInitValue() {
        return initValue;
    }

    public void setInitValue(int initValue) {
        this.initValue = initValue;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void setValue(int value)
    {
        jSpinner.setValue(value);
        this.value = value;
    }
    public void addValue(int addValue)
    {
        this.value += addValue;
        jSpinner.setValue(value);

    }
    public int getValue()
    {
        return value;
    }

    public JSpinner getComponent() {
        return jSpinner;
    }

    public void addAncestorEvent(@NotNull AncestorEvent event){jSpinner.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){jSpinner.removeAncestorListener(event);}

    public void addChangeEvent(@NotNull ChangeEvent event){jSpinner.addChangeListener(event);}
    public void removeChangeEvent(@NotNull ChangeEvent event){jSpinner.removeChangeListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){jSpinner.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){jSpinner.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){jSpinner.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){jSpinner.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){jSpinner.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){jSpinner.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){jSpinner.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){jSpinner.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){jSpinner.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){jSpinner.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){jSpinner.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){jSpinner.removeInputMethodListener(event);}


    public void addKeyEvent(@NotNull KeyEvent event){jSpinner.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){jSpinner.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){jSpinner.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){jSpinner.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){jSpinner.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){jSpinner.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){jSpinner.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){jSpinner.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){jSpinner.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){jSpinner.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggable = new DraggableComponent(jSpinner);
        }
        else if(!isDraggable){
            draggable.removeDraggingAbilities();
        }
    }
    public void setPreferredSize(int sizeX, int sizeY) { jSpinner.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { jSpinner.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { jSpinner.setMinimumSize(new Dimension(sizeX, sizeY)); }
    public void setShape(Shape shape){
        jSpinner.setMixingCutoutShape(shape);
    }
    public void setFont(String FontName,String FontType,int size)
    {
        if(FontType.equals("Plain"))jSpinner.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))jSpinner.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))jSpinner.setFont(new Font(FontName, Font.ITALIC, size));
    }
    public String getFontName()
    {
        return jSpinner.getFont().getFamily();
    }
    public String getFontType()
    {
        return jSpinner.getFont().getFamily();
    }
    public int getFontSize()
    {
        return jSpinner.getFont().getSize();
    }
    public Font getFont() {
        return jSpinner.getFont();
    }
}
