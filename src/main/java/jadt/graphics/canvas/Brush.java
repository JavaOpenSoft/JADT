package jadt.graphics.canvas;

import jadt.core.Cursor;
import jadt.graphics.Color;

import java.util.Objects;


public class Brush extends Cursor {
    private jadt.graphics.Color color;

    private int BrushsizeX;
    private int BrushsizeY;
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
    public void setBrushSize(int BrushsizeX, int BrushsizeY) {
        this.BrushsizeX = BrushsizeX;
        this.BrushsizeY = BrushsizeY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Brush brush)) return false;
        return BrushsizeX == brush.BrushsizeX && BrushsizeY == brush.BrushsizeY && Objects.equals(color, brush.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, BrushsizeX, BrushsizeY);
    }

    public int getBrushsizeY(){
        return this.BrushsizeY;
    }
    public int getBrushX(){
        return this.BrushsizeX;
    }

}
