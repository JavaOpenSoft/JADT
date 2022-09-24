package jadt.core.url;

import javax.swing.JButton;
import javax.swing.Icon;

public class ButtonLink {
    private short positionX;
    private short positionY;
    private short sizeX;
    private short sizeY;
    public final java.awt.Color URL_Colour = new java.awt.Color(0, 143, 241);
    public final java.awt.Color ClickedURL_Colour = new java.awt.Color(176, 86, 242);
    private final JButton button = new JButton();
    public JButton getComponent() {
        return button;
    }
    public ButtonLink(){
        button.setForeground(URL_Colour);
    }
    public ButtonLink(String Url){

    }
    public ButtonLink(String Url, Icon icon){

    }
    public void setText(String Text){
        button.setText(Text);
    }
    public void setSize(short sizeX, short sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        button.setSize(sizeX, sizeY);
    }
    public void directToURLWhenClicked(boolean isDirectable){
    }
    public String getURL(){
        return button.getText();
    }

    public short getPositionX() {
        return positionX;
    }

    public short getPositionY() {
        return positionY;
    }

    public short getSizeX() {
        return sizeX;
    }

    public short getSizeY() {
        return sizeY;
    }
}
