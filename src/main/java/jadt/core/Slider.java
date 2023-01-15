package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import org.jetbrains.annotations.NotNull;
import jadt.events.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("FieldMayBeFinal")
public class Slider extends JADTComponent {
    @SuppressWarnings("FieldMayBeFinal")
    private JSlider slider = new JSlider();
    private DraggableComponent draggable;
    
    public JSlider getComponent(){
        return slider;
    }
    public int getValue(){
        return slider.getValue();
    }
    public void setValue(int value){
        slider.setValue(value);
    }

    public void addAncestorEvent(@NotNull AncestorEvent event){slider.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){slider.removeAncestorListener(event);}

    public void addChangeEvent(@NotNull ChangeEvent event){slider.addChangeListener(event);}
    public void removeChangeEvent(@NotNull ChangeEvent event){slider.removeChangeListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){slider.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){slider.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){slider.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){slider.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){slider.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){slider.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){slider.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){slider.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){slider.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){slider.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){slider.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){slider.removeInputMethodListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){slider.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){slider.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){slider.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){slider.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){slider.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){slider.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){slider.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){slider.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){slider.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){slider.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggable = new DraggableComponent(slider);
        }
        else if(!isDraggable){
            draggable.removeDraggingAbilities();
        }
    }
    public void setPreferredSize(int sizeX, int sizeY) { slider.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { slider.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { slider.setMinimumSize(new Dimension(sizeX, sizeY)); }
    public void setShape(Shape shape){
        slider.setMixingCutoutShape(shape);
    }
    public void setFont(String FontName,String FontType,int size)
    {
        if(FontType.equals("Plain"))slider.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))slider.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))slider.setFont(new Font(FontName, Font.ITALIC, size));
    }
    public String getFontName()
    {
        return slider.getFont().getFamily();
    }
    public String getFontType()
    {
        return slider.getFont().getFamily();
    }
    public int getFontSize()
    {
        return slider.getFont().getSize();
    }
    public Font getFont() {
        return slider.getFont();
    }

}
