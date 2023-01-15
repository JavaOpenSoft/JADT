package jadt.graphics;

import java.util.ArrayList;

public class Gradient{
    private ArrayList<Color> colorList = new ArrayList<Color>();
    private int direction = 0;
    public static final int vertical = 0;
    public static final int horizontal = 1;
    public static final int diagonalUp = 2;
    public static final int diagonalDown = 3;
    public static final int rotatingGradient = 4;
    public static final int undefinedGradient = 5;


    public void addColor(Color color) {
        colorList.add(color);
    }

    public Gradient(int direction) {
        this.direction = direction;
    }

    public ArrayList<Color> getColors() {
        return colorList;
    }
    public void setColors(ArrayList<Color> colorList) {
        this.colorList = colorList;
    }
    public void setDirection(int direction) {
        this.direction = direction;
    }
    public String getDirection() {
        if(direction == 0)return "Vertical";
        else if(direction == 1)return "Horizontal";
        else if(direction == 2)return "Diagonal Up";
        else if(direction == 3)return "Diagonal Down";
        else if(direction == 4)return "Rotating Gradient";
        else if(direction == 5)return "Undefined Gradient";
        return null;
    }
    public int getDirectionValue() { return direction; }

}
