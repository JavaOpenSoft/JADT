package jadt.core;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Objects;
import javax.swing.ImageIcon;
import java.awt.Image;


public class ImageFrame {
    JLabel imageFrame = new JLabel();
    JFrame frame = new JFrame();
    private int SizeX,SizeY,PositionX,PositionY;
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    private final int posx = size.width;
    private final int posy = size.height;
    public void setLocationOnScreen(String Location)
    {
        JLabel temp = new JLabel();
        if(Location.equals("CENTRE"))frame.setLocationRelativeTo(null);
        if(Location.equals("LEFT_CENTRE")){
            temp.setBounds(0,posy/2,0,0);
            frame.setLocationRelativeTo(temp);
        }
        if(Location.equals("RIGHT_CENTRE")){
            temp.setBounds(posx,posy/2,0,0);
            frame.setLocationRelativeTo(temp);
        }
        if(Location.equals("DOWN_CENTRE")){
            temp.setBounds(posx/2,posy,0,0);
            frame.setLocationRelativeTo(temp);
        }
        if(Location.equals("UP_CENTRE")){
            temp.setBounds(posx,0,0,0);
            frame.setLocationRelativeTo(temp);
        }
        if(Location.equals("RIGHT_DOWN_CORNER")){
            temp.setBounds(0,posy,0,0);
            frame.setLocationRelativeTo(temp);
        }
        if(Location.equals("RIGHT_UP_CORNER")){
            temp.setBounds(0,0,0,0);
            frame.setLocationRelativeTo(temp);
        }
        if(Location.equals("LEFT_UP_CORNER")){
            temp.setBounds(posx,posy/2,0,0);
            frame.setLocationRelativeTo(temp);
        }
        if(Location.equals("LEFT_DOWN_CORNER")){
            temp.setBounds(posx,posy,0,0);
            frame.setLocationRelativeTo(temp);
        }
    }
    public void setPositionAndSize(int PositionX, int PositionY,int SizeX,int SizeY) {
        imageFrame.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setImage(String filePathWithName)
    {
        imageFrame.setIcon(new ImageIcon(Objects.requireNonNull(SuccessNotification.class.getResource(filePathWithName))));
        imageFrame.setVisible(true);
    }
    public void setImage(Image image)
    {
        imageFrame.setIcon(new ImageIcon(image));
        imageFrame.setVisible(true);
    }
    public void setSize(int SizeX, int SizeY){
        imageFrame.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY){
        imageFrame.setBounds(PositionX,PositionY,getSizeX(),getSizeY());
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public ImageFrame(Image image)
    {
        setImage(image);
    }
    public ImageFrame(String filePathWithName, int SizeX, int SizeY,int PositionX,int PositionY)
    {
        setImage(filePathWithName);
        setPosition(PositionX,PositionY);
        setSize(SizeX,SizeY);
    }
    public ImageFrame(String filePathWithName)
    {
        setImage(filePathWithName);
    }
    public ImageFrame(String filePathWithName, int SizeX, int SizeY)
    {
        setImage(filePathWithName);
        setSize(SizeX,SizeY);
    }
    public ImageFrame(String filePathWithName,short PositionX,short PositionY)
    {
        setImage(filePathWithName);
        setPosition(PositionX,PositionY);
    }
    public JLabel getImageFrame() {
        return imageFrame;
    }

    public int getSizeX() {
        return SizeX;
    }


    public int getSizeY() {
        return SizeY;
    }

    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }
}
