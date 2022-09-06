package juit.Core;
import javax.swing.*;
import java.security.InvalidParameterException;

public class ScrollBar {
    JScrollPane scrollPane;
    JScrollBar jScrollBar= new JScrollBar();
    JScrollBar BottomScrollBar = new JScrollBar();
    public void setPosition(String Position)
    {
        jScrollBar = scrollPane.getVerticalScrollBar();
        BottomScrollBar = scrollPane.createHorizontalScrollBar();
        jScrollBar.setValue(jScrollBar.getMinimum());
        BottomScrollBar.setValue(BottomScrollBar.getMinimum());
        if (Position.equals("VERTICAL")) jScrollBar.setVisible(true);
        if(Position.equals("HORIZONTAL"))BottomScrollBar.setVisible(true);
        if (Position.equals("VERTICAL AND HORIZONTAL"))
        {
            jScrollBar.setVisible(true);
            BottomScrollBar.setVisible(true);
        }
        else throw new InvalidParameterException("The setPosition() function parameter must give either " +
                "'HORIZONTAL' OR 'VERTICAL' or 'VERTICAL AND HORIZONTAL'" );
    }
    public void setSize(int SizeX, int SizeY,String Type)
    {
        if (Type.equals("VERTICAL")) jScrollBar.setSize(SizeX,SizeY);
        else  if(Type.equals("HORIZONTAL"))BottomScrollBar.setSize(SizeX,SizeY);
        else throw new InvalidParameterException("The setSize() function 'Type' parameter must give either " +
                    "'HORIZONTAL' OR 'VERTICAL");
    }
}
