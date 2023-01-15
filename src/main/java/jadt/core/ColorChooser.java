package jadt.core;

import jadt.JADTComponent;
import jadt.graphics.Color;
import javax.swing.JColorChooser;
import javax.swing.JComponent;

public class ColorChooser extends JADTComponent {
    private Color chosenColor;

    public ColorChooser(){
    }
    public java.awt.Color getColor(String title, Color startingColor){
        return JColorChooser.showDialog(null,title,startingColor);
    }
    public java.awt.Color getColor(String title){
        return JColorChooser.showDialog(null,title, Color.red);
    }
    public java.awt.Color getColor(JComponent component, String title, Color startingColor){
       return JColorChooser.showDialog(component,title,startingColor);
    }
    public java.awt.Color getColor(JComponent component, String title){
        return JColorChooser.showDialog(component,title, Color.red);
    }

}
