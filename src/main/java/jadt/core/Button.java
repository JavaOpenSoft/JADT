package jadt.core;
import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import jadt.events.*;
import jadt.graphics.Color;
import org.jetbrains.annotations.NotNull;
import javax.swing.JButton;
import javax.swing.Icon;
import java.util.Objects;

@SuppressWarnings("ALL")
public class Button  extends JADTComponent {
    private JButton jButton = new JButton();
    private DraggableComponent draggableComponent;
    private String Text;
    private int positionY = 0;
    private int positionX = 0;
    private int sizeX = 100;
    private int sizeY = 50;
    private boolean isVisible = false;

    public Button(String Text, Icon icon) {
        jButton.setText(Text);
        jButton.setSize(positionX,positionY);
        jButton.setVisible(true);
        this.Text = Text;
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public Button(String Text){
        jButton.setText(Text);
        jButton.setVisible(true);
        this.Text = Text;
    }
    public void showComponent(){
        jButton.setVisible(true);
        this.isVisible = true;
    }
    public void hideComponent() {
        jButton.setVisible(false);
        this.isVisible = false;
    }
    public Button(){
        jButton.setVisible(true);
    }

    public String getText()
    {return Text;}
    public int GetPositionX()
    {return positionX;}
    public int GetPositionY()
    {return positionY;}
    public int getSizeX()
    {return sizeX;}
    public int getSizeY()
    {return sizeY;}

    //Add or remove "event" methods
    public void addActionEvent(@NotNull ActionEvent event)
    {
        jButton.addActionListener(event);
    }
    public void removeActionEvent(@NotNull ActionEvent event){jButton.removeActionListener(event);}
    public void addAncestorEvent(@NotNull AncestorEvent event){jButton.addAncestorListener(event);}

    public void removeAncestorEvent(@NotNull AncestorEvent event){jButton.removeAncestorListener(event);}
    public void addChangeEvent(@NotNull ChangeEvent event){jButton.addChangeListener(event);}

    public void removeChangeEvent(@NotNull ChangeEvent event){jButton.removeChangeListener(event);}
    public void addComponentEvent(@NotNull ComponentEvent event){jButton.addComponentListener(event);}

    public void removeComponentEvent(@NotNull ComponentEvent event){jButton.removeComponentListener(event);}
    public void addContainerEvent(@NotNull ContainerEvent event){jButton.addContainerListener(event);}

    public void removeContainerEvent(@NotNull ContainerEvent event){jButton.removeContainerListener(event);}
    public void addFocusEvent(@NotNull FocusEvent event){jButton.addFocusListener(event);}

    public void removeFocusEvent(@NotNull FocusEvent event){jButton.removeFocusListener(event);}
    public void addHierarchyEvent(@NotNull HierarchyEvent event){jButton.addHierarchyListener(event);}

    public void removeHierarchyEvent(@NotNull HierarchyEvent event){jButton.removeHierarchyListener(event);}
    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){jButton.addHierarchyBoundsListener(event);}

    public void removeHeirarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){jButton.addHierarchyBoundsListener(event);}
    public void addInputMethodEvent(@NotNull InputMethodEvent event){jButton.addInputMethodListener(event);}

    public void removeInputMethodEvent(@NotNull InputMethodEvent event){jButton.removeInputMethodListener(event);}
    public void addItemEvent(@NotNull ItemEvent event){jButton.addItemListener(event);}

    public void removeItemEvent(@NotNull ItemEvent event){jButton.removeItemListener(event);}
    public void addKeyEvent(@NotNull KeyEvent event){jButton.addKeyListener(event);}

    public void removeKeyEvent(@NotNull KeyEvent event){jButton.removeKeyListener(event);}
    public void addMouseEvent(@NotNull MouseEvent event){jButton.addMouseListener(event);}

    public void removeMouseEvent(@NotNull MouseEvent event){jButton.removeMouseListener(event);}
    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){jButton.addMouseMotionListener(event);}

    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){jButton.removeMouseMotionListener(event);}
    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){jButton.addMouseWheelListener(event);}

    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){jButton.removeMouseWheelListener(event);}
    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){jButton.addVetoableChangeListener(event);}

    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){jButton.removeVetoableChangeListener(event);}
    public void setText(String text) {jButton.setText(text);}
    public void removeIcon(){
        jButton.setIcon(null);
    }
    public void setIcon(jadt.core.icon.Icon icon) {jButton.setIcon(icon);}
    public void setButtonSize(int sizeX,int sizeY)
    {
        jButton.setSize(sizeX,sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public boolean isVisible(){
        return isVisible;
    }
    public void setColor(Color color){
        jButton.setBackground(color);
    }
    public void setTextColor(Color color){
        jButton.setForeground(color);
    }
    public void setDraggable(boolean isDraggable) {
        if(isDraggable) {
            draggableComponent = new DraggableComponent(jButton);
        }
        else if(!isDraggable){
            draggableComponent.removeDraggingAbilities();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Button)) return false;
        Button button = (Button) o;
        return positionY == button.positionY && positionX == button.positionX && sizeX == button.sizeX && sizeY == button.sizeY && isVisible == button.isVisible && jButton.equals(button.jButton) && Objects.equals(draggableComponent, button.draggableComponent) && Objects.equals(Text, button.Text);
    }

    @Override
    public String toString() {
        return "Button{" +
                "jButton=" + jButton +
                ", draggableComponent=" + draggableComponent +
                ", Text='" + Text + '\'' +
                ", positionY=" + positionY +
                ", positionX=" + positionX +
                ", sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                ", isVisible=" + isVisible +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(jButton, draggableComponent, Text, positionY, positionX, sizeX, sizeY, isVisible);
    }

    public JButton getButton() {
        return jButton;
    }

}
