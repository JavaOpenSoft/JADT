package jadt.core;
import jadt.JADTComponent;

import javax.swing.*;
import java.security.InvalidParameterException;

public class ScrollBar extends JADTComponent {
    public static final byte VERTICAL = 0;
    public static final byte HORIZONTAL = 1;
    private JScrollPane scrollPane;
    private JScrollBar HorizontalScrollBar = new JScrollBar();
    private JScrollBar BottomScrollBar = new JScrollBar();
    private int sizeX;
    private int sizeY;
    private int positionX;
    private int positionY;

    public void setPosition(String Position)
    {
        HorizontalScrollBar = scrollPane.getVerticalScrollBar();
        BottomScrollBar = scrollPane.createHorizontalScrollBar();
        HorizontalScrollBar.setValue(HorizontalScrollBar.getMinimum());
        BottomScrollBar.setValue(BottomScrollBar.getMinimum());
        if (Position.equals("VERTICAL")) HorizontalScrollBar.setVisible(true);
        if(Position.equals("HORIZONTAL"))BottomScrollBar.setVisible(true);
        if (Position.equals("VERTICAL AND HORIZONTAL"))
        {
            HorizontalScrollBar.setVisible(true);
            BottomScrollBar.setVisible(true);
        }
        else throw new InvalidParameterException("The setPosition() function parameter must give either " +
                "'HORIZONTAL' OR 'VERTICAL' or 'VERTICAL AND HORIZONTAL'" );
    }
    public void setSize(int sizeX, int sizeY,String Type)
    {
        if (Type.equals("VERTICAL")) HorizontalScrollBar.setSize(sizeX,sizeY);
        else  if(Type.equals("HORIZONTAL"))BottomScrollBar.setSize(sizeX,sizeY);
        else throw new InvalidParameterException("The setSize() function 'Type' parameter must give either " +
                    "'HORIZONTAL' OR 'VERTICAL");
    }
    public void setPosition(int positionX,int positionY) {
        HorizontalScrollBar.setBounds(positionX,positionY,sizeX,sizeY);
        BottomScrollBar.setBounds(positionX,positionY,sizeX,sizeY);
    }
    public void setBounds(int sizeX,int sizeY,int positionX,int positionY) {
        HorizontalScrollBar.setBounds(positionX,positionY,sizeX,sizeY);
        BottomScrollBar.setBounds(positionX,positionY,sizeX,sizeY);
    }
    public void showHorizontalScrollBar(){
        HorizontalScrollBar.setVisible(true);
    }
    public void showVerticalScrollBar(){
        BottomScrollBar.setVisible(true);
    }
    public void hideHorizontalScrollBar(){
        HorizontalScrollBar.setVisible(false);
    }
    public void hideVerticalScrollBar(){
        BottomScrollBar.setVisible(false);
    }
    public JScrollBar getComponent(byte type){
        JScrollBar scrollBar = null;
        if(type == ScrollBar.VERTICAL)scrollBar = BottomScrollBar;
        else if (type == ScrollBar.HORIZONTAL)scrollBar = HorizontalScrollBar;
        return scrollBar;
    }
}
