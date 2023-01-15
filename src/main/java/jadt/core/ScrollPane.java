package jadt.core;

import jadt.JADTComponent;

import javax.swing.*;
import java.security.InvalidParameterException;

@SuppressWarnings("FieldMayBeFinal")
public class ScrollPane extends JADTComponent {
    @SuppressWarnings("FieldMayBeFinal")
    private JScrollPane scrollPane = new JScrollPane();
    public void add(ScrollBar scrollBar,String Position)
    {
        if(Position.equals("VERTICAL")) scrollPane.add(scrollBar.getComponent(ScrollBar.VERTICAL));
        else if (Position.equals("HORIZONTAL")) scrollPane.add(scrollBar.getComponent(ScrollBar.HORIZONTAL));
        else throw new InvalidParameterException("The add() function Position parameter must give either " +
            "'HORIZONTAL' OR 'VERTICAL' or 'VERTICAL AND HORIZONTAL'" );
    }
    public JScrollPane getComponent() { return scrollPane; }
    public void show(){
        scrollPane.setVisible(true);
    }
    public void hide(){
        scrollPane.setVisible(false);
    }
    public boolean isShown(){
        return scrollPane.isVisible();
    }
    public void setAutoscroll(boolean autoscroll){
        scrollPane.setAutoscrolls(autoscroll);
    }
    public void add(JADTComponent component){

    }
    public boolean isAutoscrollEnabled(){
        return scrollPane.getAutoscrolls();
    }

}
