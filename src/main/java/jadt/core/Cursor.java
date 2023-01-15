package jadt.core;

import jadt.JADTComponent;

import java.awt.*;

public class Cursor extends java.awt.Cursor {
    public Cursor(int type) {
        super(type);
    }

    protected Cursor(String name) {
        super(name);
    }
    public Cursor(Image image) {
        super(getDefaultCursor().getType());

    }

    public Cursor getHandCursor() {
        return new Cursor(HAND_CURSOR);
    }
    public Cursor getCrossHairCursor(){
        return new Cursor(CROSSHAIR_CURSOR);
    }
    public Cursor getCustomCursor() {
        return new Cursor(CUSTOM_CURSOR);
    }
    public Cursor getTextCursor() {
        return new Cursor(TEXT_CURSOR);
    }
    public Cursor getWaitCursor() {
        return new Cursor(WAIT_CURSOR);
    }
    public Cursor getSouthWestResizeCursor() {
        return new Cursor(SW_RESIZE_CURSOR);
    }
    public Cursor getSouthEastResizeCursor() {
        return new Cursor(SW_RESIZE_CURSOR);
    }
    public Cursor getNorthWestResizeCursor() {
        return new Cursor(NW_RESIZE_CURSOR);
    }
    public Cursor getNorthEastResizeCursor() {
        return new Cursor(NW_RESIZE_CURSOR);
    }
    public Cursor getNorthResizeCursor() {
        return new Cursor(N_RESIZE_CURSOR);
    }
    public Cursor getSouthResizeCursor() {
        return new Cursor(S_RESIZE_CURSOR);
    }
    public Cursor getEastResizeCursor() {
        return new Cursor(E_RESIZE_CURSOR);
    }
    public Cursor getWestResizeCursor() {
        return new Cursor(W_RESIZE_CURSOR);
    }
    public Cursor getMoveCursor() {
        return new Cursor(MOVE_CURSOR);
    }
    public static java.awt.Cursor getCustomCursor(String cursorName, Image image, int x, int y){
        return Toolkit.getDefaultToolkit().createCustomCursor(image , new Point(x,
                y), cursorName);
    }
}
