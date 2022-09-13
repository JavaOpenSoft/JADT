package jadt.core.url;

import javax.swing.JButton;
import javax.swing.Icon;

public class ButtonLink {
    public short PositionX;
    public short PositionY;
    private short SizeX;
    private short SizeY;
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
    public void setSize(short SizeX, short SizeY){
        this.SizeX = SizeX;
        this.SizeY = SizeY;
        button.setSize(SizeX, SizeY);
    }
    public void directToURLWhenClicked(boolean isDirectable){
    }
    public String getURL(){
        return button.getText();
    }
}
