package jadt.graphics.canvas;

import jadt.core.Cursor;
import jadt.graphics.Color;

import java.util.Objects;


public class Brush extends Cursor {
    private jadt.graphics.Color color;

    private int brushSizeX;
    private int brushSizeY;
    public Brush(){
        super(CROSSHAIR_CURSOR);
    }
    public Brush(int type) {
        super(type);
    }
    public Color getColor() {
        return color;
    }
    public void setColor(jadt.graphics.Color color) {
        this.color = color;
    }
    public void resetColor() {
        color = (Color) Color.BLACK;
    }
    public void setBrushSize(int brushSizeX, int brushSizeY) {
        this.brushSizeX = brushSizeX;
        this.brushSizeY = brushSizeY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Brush brush)) return false;
        return brushSizeX == brush.brushSizeX && brushSizeY == brush.brushSizeY && Objects.equals(color, brush.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brushSizeX, brushSizeY);
    }

    public int getBrushSizeY(){
        return this.brushSizeY;
    }
    public int getBrushX(){
        return this.brushSizeX;
    }

}
