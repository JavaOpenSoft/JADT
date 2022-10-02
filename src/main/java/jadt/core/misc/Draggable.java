package jadt.core.misc;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Draggable {
    private volatile int positionX = 0;
    private volatile int positionY = 0;
    private volatile int sizeX = 0;
    private volatile int sizeY = 0;

    public Draggable(JComponent component){
        component.setBorder(new LineBorder(Color.BLUE, 3));
        component.setBackground(Color.WHITE);
        component.setBounds(0, 0, 100, 100);
        component.setOpaque(false);

        component.addMouseListener(new MouseListener() {

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

        });
        component.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getXOnScreen() - positionX;
                int deltaY = e.getYOnScreen() - positionY;

                component.setLocation(sizeX + deltaX, sizeY + deltaY);
            }

            @Override
            public void mouseMoved(MouseEvent e) { }

        });
    }
}
