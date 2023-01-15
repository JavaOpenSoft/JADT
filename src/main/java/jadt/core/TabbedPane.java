package jadt.core;
import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import jadt.events.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("FieldMayBeFinal")
public class TabbedPane extends JADTComponent {
    @SuppressWarnings("FieldMayBeFinal")
    private DraggableComponent draggable = new DraggableComponent();
    private JTabbedPane tabbedPane = new JTabbedPane();
    private DraggableComponent component;
    public JTabbedPane getComponent() {
        return tabbedPane;
    }
    public void addTab(String name, JComponent component) {
        tabbedPane.addTab(name,component);
    }
    public void addTab(Icon icon,String name, JComponent component) {
       tabbedPane.addTab(name,icon,component);
    }
    public void addTab(Icon icon,String name, JComponent component, String tip){
        tabbedPane.addTab(name,icon,component,tip);
    }
    public int getNumberOffTabs(){
        return tabbedPane.getTabCount();
    }
    public void add(PopupMenu popupMenu){
        tabbedPane.add(popupMenu.getComponent());
    }
    public void add(){

    }
    public void addAncestorEvent(@NotNull AncestorEvent event){tabbedPane.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){tabbedPane.removeAncestorListener(event);}

    public void addChangeEvent(@NotNull ChangeEvent event){tabbedPane.addChangeListener(event);}
    public void removeChangeEvent(@NotNull ChangeEvent event){tabbedPane.removeChangeListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){tabbedPane.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){tabbedPane.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){tabbedPane.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){tabbedPane.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){tabbedPane.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){tabbedPane.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){tabbedPane.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){tabbedPane.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){tabbedPane.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){tabbedPane.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){tabbedPane.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){tabbedPane.removeInputMethodListener(event);}


    public void addKeyEvent(@NotNull KeyEvent event){tabbedPane.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){tabbedPane.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){tabbedPane.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){tabbedPane.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){tabbedPane.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){tabbedPane.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){tabbedPane.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){tabbedPane.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){tabbedPane.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){tabbedPane.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggable = new DraggableComponent(tabbedPane);
        }
        else if(!isDraggable){
            draggable.removeDraggingAbilities();
        }
    }
    public void setPreferredSize(int sizeX, int sizeY) { tabbedPane.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { tabbedPane.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { tabbedPane.setMinimumSize(new Dimension(sizeX, sizeY)); }
    public void setShape(Shape shape){
        tabbedPane.setMixingCutoutShape(shape);
    }
    public void setFont(String FontName,String FontType,int size)
    {
        if(FontType.equals("Plain"))tabbedPane.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))tabbedPane.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))tabbedPane.setFont(new Font(FontName, Font.ITALIC, size));
    }
    public String getFontName()
    {
        return tabbedPane.getFont().getFamily();
    }
    public String getFontType()
    {
        return tabbedPane.getFont().getFamily();
    }
    public int getFontSize()
    {
        return tabbedPane.getFont().getSize();
    }
    public Font getFont() {
        return tabbedPane.getFont();
    }

}
