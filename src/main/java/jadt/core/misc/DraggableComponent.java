package jadt.core.misc;

import javax.swing.JComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.security.InvalidParameterException;
import java.util.InvalidPropertiesFormatException;
import java.util.Objects;

@SuppressWarnings("ALL")
public class DraggableComponent {
    private volatile int positionX = 0;
    private volatile int positionY = 0;
    private volatile int sizeX = 0;
    private volatile int sizeY = 0;
    private boolean isDraggable = false;
    private JComponent component;

    private MouseListener mouseListener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) { }

        @Override
        public void mousePressed(MouseEvent e) {
            positionX = e.getXOnScreen();
            positionY = e.getYOnScreen();

            sizeX = component.getX();
            sizeY = component.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) { }

        @Override
        public void mouseEntered(MouseEvent e) { }

        @Override
        public void mouseExited(MouseEvent e) { }
    };
    @SuppressWarnings("FieldMayBeFinal")
    private MouseMotionListener mouseMotionListener = new MouseMotionListener() {
        @Override
        public void mouseDragged(MouseEvent e) {
            int deltaX = e.getXOnScreen() - positionX;
            int deltaY = e.getYOnScreen() - positionY;

            component.setLocation(sizeX + deltaX, sizeY + deltaY);
        }

        @Override
        public void mouseMoved(MouseEvent e) { }
    };
    public DraggableComponent(JComponent component){
        setJComponent(component);
        getJComponent().addMouseListener(mouseListener);
        getJComponent().addMouseMotionListener(mouseMotionListener);
        component = getJComponent();
        isDraggable = true;
    }
    public DraggableComponent(){
        isDraggable  = false;
    }
    public void setJComponent(JComponent component) {
        this.component = component;
    }
    public JComponent getJComponent() {
        return component;
    }
    public MouseMotionListener getMouseMotionListener() {
        return mouseMotionListener;
    }

    public MouseListener getMouseListener() {
        return mouseListener;
    }
    public void enableDraggingAbilities() throws InvalidPropertiesFormatException {
        if(component.equals(null)){
            throw new InvalidPropertiesFormatException("JComponent is null. Add a JComponent using the setJComponent() method.");
        }
        getJComponent().addMouseListener(mouseListener);
        getJComponent().addMouseMotionListener(mouseMotionListener);
        component = getJComponent();
        setJComponent(null);
        isDraggable = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DraggableComponent)) return false;
        DraggableComponent draggableComponent = (DraggableComponent) o;
        return positionX == draggableComponent.positionX && positionY == draggableComponent.positionY && sizeX == draggableComponent.sizeX && sizeY == draggableComponent.sizeY && isDraggable == draggableComponent.isDraggable && Objects.equals(component, draggableComponent.component) && Objects.equals(mouseListener, draggableComponent.mouseListener) && Objects.equals(mouseMotionListener, draggableComponent.mouseMotionListener);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionX, positionY, sizeX, sizeY, isDraggable, component, mouseListener, mouseMotionListener);
    }

    @Override
    public String toString() {
        return "DraggableComponent{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                ", isDraggable=" + isDraggable +
                ", component=" + component +
                ", mouseListener=" + mouseListener +
                ", mouseMotionListener=" + mouseMotionListener +
                '}';
    }

    public void removeDraggingAbilities() throws InvalidParameterException {
        if(component.equals(null)){
            throw new InvalidParameterException("JComponent is null. Add a JComponent using the setJComponent() method");
        }
        getJComponent().removeMouseListener(mouseListener);
        getJComponent().removeMouseMotionListener(mouseMotionListener);
        component = getJComponent();
        setJComponent(null);
        isDraggable = true;
    }
}
