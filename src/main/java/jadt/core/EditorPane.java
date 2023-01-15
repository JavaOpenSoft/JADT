package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import jadt.events.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.event.HyperlinkListener;


@SuppressWarnings("FieldMayBeFinal")
public class EditorPane extends JADTComponent {
    @SuppressWarnings("FieldMayBeFinal")
    private JEditorPane editorPane = new JEditorPane();
    private short sizeX = 600;
    private short sizeY = 600;
    private short positionY = 0;
    private short positionX = 0;
    private boolean isVisible = true;
    private DraggableComponent draggableComponent;
    public boolean isShown() {
        return isVisible;
    }
    public void addAncestorEvent(@NotNull AncestorEvent event){editorPane.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){editorPane.removeAncestorListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){editorPane.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){editorPane.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){editorPane.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){editorPane.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){editorPane.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){editorPane.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){editorPane.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){editorPane.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){editorPane.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){editorPane.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){editorPane.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){editorPane.removeInputMethodListener(event);}


    public void addKeyEvent(@NotNull KeyEvent event){editorPane.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){editorPane.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){editorPane.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){editorPane.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){editorPane.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){editorPane.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){editorPane.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){editorPane.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){editorPane.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){editorPane.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggableComponent = new DraggableComponent(editorPane);
        }
        else if(!isDraggable){
            draggableComponent.removeDraggingAbilities();
        }
    }
    public void show() {
        editorPane.setVisible(true);
        this.isVisible = true;
    }
    public void hide() {
        editorPane.setVisible(false);
        this.isVisible = false;
    }
    public void addHyperLinkListener(HyperlinkListener listener)
    {
        editorPane.addHyperlinkListener(listener);
    }
    public void removeHyperLinkListener(HyperlinkListener listener)
    {
        editorPane.removeHyperlinkListener(listener);
    }
    public void setPosition(short positionX, short positionY){
        editorPane.setBounds(positionX, positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setSize(short sizeX, short sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        editorPane.setSize(sizeX,sizeY);
    }
    public void setBounds(short sizeX, short sizeY, short positionX, short positionY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.positionX = positionX;
        this.positionY = positionY;
        editorPane.setBounds(positionX, positionY, sizeX, sizeY);
    }
    public void cut(){editorPane.cut();}
    public void copy(){editorPane.copy();}
    public void paste(){editorPane.paste();}
    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public short getPositionY() {
        return positionY;
    }

    public short getPositionX() {
        return positionX;
    }
    public JEditorPane getComponent(){
        return editorPane;
    }
}