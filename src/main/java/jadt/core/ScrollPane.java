package jadt.core;

import javax.swing.*;
import java.security.InvalidParameterException;

public class ScrollPane {
    private JScrollPane jScrollPane = new JScrollPane();
    public void add(ScrollBar scrollBar,String Position)
    {
        if(Position.equals("VERTICAL"))jScrollPane.add(scrollBar.jScrollBar);
        else if (Position.equals("HORIZONTAL"))jScrollPane.add(scrollBar.BottomScrollBar);
        else throw new InvalidParameterException("The add() function Position parameter must give either " +
            "'HORIZONTAL' OR 'VERTICAL' or 'VERTICAL AND HORIZONTAL'" );
    }
    public JScrollPane getComponent() { return jScrollPane; }
}
