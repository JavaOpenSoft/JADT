package jadt.core.hyperlink;

import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

public class HyperLinkButton {
    private short positionX;
    private short positionY;
    private short sizeX;
    private short sizeY;
    public final java.awt.Color URL_Colour = new java.awt.Color(0, 143, 241);
    public final java.awt.Color ClickedURL_Colour = new java.awt.Color(176, 86, 242);
    private final JButton button = new JButton();
    @SuppressWarnings("SpellCheckingInspection")
    private boolean isDirectable;
    private String url;
    public JButton getComponent() {
        return button;
    }
    public HyperLinkButton(){
        button.setForeground(URL_Colour);
    }
    public HyperLinkButton(String Url){

    }
    public HyperLinkButton(String Url, Icon icon){
        button.setIcon(icon);
        button.setText(Url);
        this.url = Url;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(isDirectable)Desktop.getDesktop().browse(URI.create(button.getText()));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public void setText(String Text){
        button.setText(Text);
    }
    public void setSize(short sizeX, short sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        button.setSize(sizeX, sizeY);
    }
    @SuppressWarnings("SpellCheckingInspection")
    public void directToURLWhenClicked(boolean isDirectable){
        this.isDirectable = isDirectable;
    }
    public String getText(){
        return button.getText();
    }
    public String getURL(){return url;}
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
