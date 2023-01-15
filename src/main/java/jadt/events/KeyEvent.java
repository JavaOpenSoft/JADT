package jadt.events;

import java.awt.*;
import java.awt.event.KeyListener;

public abstract class KeyEvent implements KeyListener {
    public void keyTyped(Keys e) {

    }

    public void keyPressed(Keys e) {

    }
    public void keyReleased(Keys e) {

    }
    @Override
    public String toString() {
        return "KeyEvent{java.awt.event.KeyListener}";
    }
}