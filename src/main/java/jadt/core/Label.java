package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import org.jetbrains.annotations.NotNull;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.Icon;
import jadt.events.*;

public class Label extends JADTComponent {
    int positionX = 0;
    int positionY = 0;
    int sizeX = 100;
    int sizeY = 100;
    private final JLabel label = new JLabel();
    private String FontName;
    private String FontType;
    private short size;
    private DraggableComponent draggableComponent;

    public Label(String Text, int sizeX, int sizeY)
    {
        label.setText(Text);
        label.setSize(sizeX,sizeY);
    }
    public Label(String Text, int sizeX, int sizeY,int positionX,int positionY)
    {
        label.setText(Text);
        label.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public Label(String Text, Icon icon){
        label.setText(Text);
        label.setIcon(icon);
    }
    public Label(String Text) {
        label.setText(Text);
    }

    public void setLabelText(String Text)
    {
        label.setText(Text);
    }
    public JLabel getComponent()
    {return label;}
    public int GetPositionX()
    {return positionX;}
    public int GetPositionY()
    {
        return positionY;
    }
    public int getSizeX()
    {
        return sizeX;
    }
    public int getSizeY()
    {
        return sizeY;
    }
    public void SetPosition(int positionX,int positionY)
    {
        label.setBounds(this.sizeX,this.sizeY,positionX,positionY);
    }
    public String getText()
    {
        return label.getText();
    }
    @SuppressWarnings("DuplicatedCode")
    public void setFont(String FontName, String FontType, short size)
    {
        if(FontType.equals("Plain"))label.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))label.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))label.setFont(new Font(FontName, Font.ITALIC, size));
        this.FontName = FontName;
        this.FontType = FontType;
        this.size = size;
    }
    public String getFontName()
    {
        return label.getFont().getFamily();
    }
    public void setSize(int SizeX, int sizeY){
        label.setSize(SizeX, sizeY);
        this.sizeX = SizeX;

        this.sizeY = sizeY;
    }
    public String getFontType()
    {
        return this.FontType;
    }
    public short getFontSize()
    {
        return this.size;
    }
    public void setBounds(int sizeX, int sizeY, int positionX, int positionY){
        label.setBounds(positionX, positionY, sizeX, sizeY);
    }

    public void addAncestorEvent(@NotNull AncestorEvent event){label.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){label.removeAncestorListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){label.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){label.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){label.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){label.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){label.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){label.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){label.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){label.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){label.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){label.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){label.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){label.removeInputMethodListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){label.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){label.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){label.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){label.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){label.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){label.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){label.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){label.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){label.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){label.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggableComponent = new DraggableComponent(label);
        }
        else if(!isDraggable){
            draggableComponent.removeDraggingAbilities();
        }
    }
}
