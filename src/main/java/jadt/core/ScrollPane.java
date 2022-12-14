package jadt.core;

import javax.swing.*;
import java.security.InvalidParameterException;

@SuppressWarnings("FieldMayBeFinal")
public class ScrollPane {
    @SuppressWarnings("FieldMayBeFinal")
    private JScrollPane jScrollPane = new JScrollPane();
    public void add(ScrollBar scrollBar,String Position)
    {
        if(Position.equals("VERTICAL"))jScrollPane.add(scrollBar.getComponent(ScrollBar.VERTICAL));
        else if (Position.equals("HORIZONTAL"))jScrollPane.add(scrollBar.getComponent(ScrollBar.HORIZONTAL));
        else throw new InvalidParameterException("The add() function Position parameter must give either " +
            "'HORIZONTAL' OR 'VERTICAL' or 'VERTICAL AND HORIZONTAL'" );
    }
    public JScrollPane getComponent() { return jScrollPane; }
    public void show(){
        jScrollPane.setVisible(true);
    }
    public void hide(){
        jScrollPane.setVisible(false);
    }
    public boolean isShown(){
        return jScrollPane.isVisible();
    }
}
