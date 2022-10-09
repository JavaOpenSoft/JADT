package jadt.core.misc;

import javax.swing.JComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.InvalidPropertiesFormatException;

@SuppressWarnings("ALL")
public class Draggable {
    private volatile int positionX = 0;
    private volatile int positionY = 0;
    private volatile int sizeX = 0;
    private volatile int sizeY = 0;

    private JComponent component;
    @SuppressWarnings("FieldMayBeFinal")
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
    public Draggable(JComponent component){
        setJComponent(component);
        getJComponent().addMouseListener(mouseListener);
        getJComponent().addMouseMotionListener(mouseMotionListener);
        component = getJComponent();
    }
    public Draggable(){

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
    }
    public void removeDraggingAbilities() throws InvalidPropertiesFormatException {
        if(component.equals(null)){
            throw new InvalidPropertiesFormatException("JComponent is null. Add a JComponent using the setJComponent() method");
        }
        getJComponent().removeMouseListener(mouseListener);
        getJComponent().removeMouseMotionListener(mouseMotionListener);
        component = getJComponent();
        setJComponent(null);
    }

}
