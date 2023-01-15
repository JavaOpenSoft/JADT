package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import jadt.core.misc.Shape;
import jadt.templates.notifications.SuccessNotification;
import jadt.events.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Objects;
import javax.swing.ImageIcon;
import java.awt.Image;


@SuppressWarnings("FieldMayBeFinal")
public class ImageFrame extends JADTComponent {
    @SuppressWarnings("FieldMayBeFinal")
    private JLabel imageFrame = new JLabel();
    private DraggableComponent draggableComponent;
    private int sizeX,sizeY,positionX,positionY;
    private final Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    private final int posX = size.width;
    private final int posY = size.height;
    public void setBounds(int positionX, int positionY,int sizeX,int sizeY) {
        imageFrame.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void setImage(String filePathWithName)
    {
        imageFrame.setIcon(new ImageIcon(Objects.requireNonNull(SuccessNotification.class.getResource(filePathWithName))));
        imageFrame.setVisible(true);
    }
    public void setImage(Image image)
    {
        imageFrame.setIcon(new ImageIcon(image));
        imageFrame.setVisible(true);
    }
    public void setSize(int sizeX, int sizeY){
        imageFrame.setSize(sizeX,sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX, int positionY){
        imageFrame.setBounds(positionX,positionY,getSizeX(),getSizeY());
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public ImageFrame(Image image)
    {
        setImage(image);
    }
    public ImageFrame(String filePathWithName, int SizeX, int sizeY,int PositionX,int PositionY)
    {
        setImage(filePathWithName);
        setPosition(PositionX,PositionY);
        setSize(SizeX,sizeY);
    }
    public ImageFrame(String filePathWithName)
    {
        setImage(filePathWithName);
    }
    public ImageFrame(String filePathWithName, int SizeX, int sizeY)
    {
        setImage(filePathWithName);
        setSize(SizeX,sizeY);
    }
    public ImageFrame(String filePathWithName,short positionX,short positionY)
    {
        setImage(filePathWithName);
        setPosition(positionX,positionY);
    }
    public JLabel getImageFrame() {
        return imageFrame;
    }

    public int getSizeX() {
        return sizeX;
    }


    public int getSizeY() {
        return sizeY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
    public JLabel getComponent(){
        return imageFrame;
    }

    public void addAncestorEvent(@NotNull AncestorEvent event){imageFrame.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){imageFrame.removeAncestorListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){imageFrame.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){imageFrame.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){imageFrame.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){imageFrame.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){imageFrame.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){imageFrame.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){imageFrame.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){imageFrame.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){imageFrame.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){imageFrame.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){imageFrame.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){imageFrame.removeInputMethodListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){imageFrame.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){imageFrame.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){imageFrame.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){imageFrame.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){imageFrame.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){imageFrame.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){imageFrame.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){imageFrame.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){imageFrame.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){imageFrame.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggableComponent = new DraggableComponent(imageFrame);
        }
        else if(!isDraggable){
            draggableComponent.removeDraggingAbilities();
        }
    }
    public void removeIcon(){
        imageFrame.setIcon(null);
    }
    public void setPreferredSize(int sizeX, int sizeY) { imageFrame.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { imageFrame.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { imageFrame.setMinimumSize(new Dimension(sizeX, sizeY)); }
    public void setShape(Shape shape){
        imageFrame.setMixingCutoutShape(shape);
    }
}
