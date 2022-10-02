package jadt.core;

import jadt.templates.notifications.SuccessNotification;

import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Objects;
import javax.swing.ImageIcon;
import java.awt.Image;


public class ImageFrame extends AppComponent{
    private JLabel imageFrame = new JLabel();
    private int sizeX,sizeY,positionX,positionY;
    private final Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    private final int posX = size.width;
    private final int posY = size.height;
    public void setLocationOnScreen(Window frame, String Location)
    {
        JLabel temp = new JLabel();
        if(Location.equals("CENTRE"))frame.getComponent().setLocationRelativeTo(null);
        if(Location.equals("LEFT_CENTRE")){
            temp.setBounds(0, posY /2,0,0);
            frame.getComponent().setLocationRelativeTo(temp);
        }
        if(Location.equals("RIGHT_CENTRE")){
            temp.setBounds(posX, posY /2,0,0);
            frame.getComponent().setLocationRelativeTo(temp);
        }
        if(Location.equals("DOWN_CENTRE")){
            temp.setBounds(posX /2, posY,0,0);
            frame.getComponent().setLocationRelativeTo(temp);
        }
        if(Location.equals("UP_CENTRE")){
            temp.setBounds(posX,0,0,0);
            frame.getComponent().setLocationRelativeTo(temp);
        }
        if(Location.equals("RIGHT_DOWN_CORNER")){
            temp.setBounds(0, posY,0,0);
            frame.getComponent().setLocationRelativeTo(temp);
        }
        if(Location.equals("RIGHT_UP_CORNER")){
            temp.setBounds(0,0,0,0);
            frame.getComponent().setLocationRelativeTo(temp);
        }
        if(Location.equals("LEFT_UP_CORNER")){
            temp.setBounds(posX, posY /2,0,0);
            frame.getComponent().setLocationRelativeTo(temp);
        }
        if(Location.equals("LEFT_DOWN_CORNER")){
            temp.setBounds(posX, posY,0,0);
            frame.getComponent().setLocationRelativeTo(temp);
        }
    }
    public void setPositionAndSize(int positionX, int positionY,int sizeX,int sizeY) {
        imageFrame.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
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
    public void setSize(int sizeX, int sizeY){
        imageFrame.setSize(sizeX,sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX, int positionY){
        imageFrame.setBounds(positionX,positionY,getSizeX(),getSizeY());
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public ImageFrame(Image image)
    {
        setImage(image);
    }
    public ImageFrame(String filePathWithName, int SizeX, int sizeY,int PositionX,int PositionY)
    {
        setImage(filePathWithName);
        setPosition(PositionX,PositionY);
        setSize(SizeX,sizeY);
    }
    public ImageFrame(String filePathWithName)
    {
        setImage(filePathWithName);
    }
    public ImageFrame(String filePathWithName, int SizeX, int sizeY)
    {
        setImage(filePathWithName);
        setSize(SizeX,sizeY);
    }
    public ImageFrame(String filePathWithName,short positionX,short positionY)
    {
        setImage(filePathWithName);
        setPosition(positionX,positionY);
    }
    public JLabel getImageFrame() {
        return imageFrame;
    }

    public int getSizeX() {
        return sizeX;
    }


    public int getSizeY() {
        return sizeY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
    public JLabel getComponent(){
        return imageFrame;
    }
}
