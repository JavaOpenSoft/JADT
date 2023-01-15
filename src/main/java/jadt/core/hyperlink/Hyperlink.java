package jadt.core.hyperlink;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Hyperlink  {
    public final java.awt.Color urlColour = new java.awt.Color(0, 143, 241);
    public final java.awt.Color clickedURL_Colour = new java.awt.Color(176, 86, 242);
    public final java.awt.Color mouseOnHoverColor = new java.awt.Color(0,113,241);
    private int sizeX;
    private int sizeY;
    private int positionX;
    private int positionY;
    private final JLabel urlLabel = new JLabel();
    private boolean isClicked = false;
    public Hyperlink(){
        urlLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().browse(new URI(urlLabel.getText()));
                        setClickedColor();
                    }
                    else System.err.println("The java.awt.Desktop class does not support Hyperlinks on this system");
                    isClicked = true;
                } catch (IOException | URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        urlLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                urlLabel.setForeground(mouseOnHoverColor);
            }
            public void mouseExited(MouseEvent me) {
                if(isClicked)urlLabel.setForeground(urlColour);
                else urlLabel.setForeground(clickedURL_Colour);
            }
        });
    }
    public Hyperlink(String urlToDirect, String text) {
        resetColor();
        urlLabel.setText(text);
        urlLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI(urlLabel.getText()));
                    setClickedColor();
                    isClicked = true;
                } catch (IOException | URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        urlLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                urlLabel.setForeground(mouseOnHoverColor);
            }
            public void mouseExited(MouseEvent me) {
                if(isClicked)urlLabel.setForeground(urlColour);
                else urlLabel.setForeground(clickedURL_Colour);
            }
        });
    }
    public void resetColor(){
        urlLabel.setForeground(new Color(0, 143, 241));
    }
    public void setClickedColor(){
        urlLabel.setForeground(new Color(176, 86, 242));
    }
    public String getUrl() {
        return urlLabel.getText();
    }
    public void setUrl(String url) {
        urlLabel.setText(url);
    }
    public JLabel getComponent() {
        return urlLabel;
    }
    public void setSize(int sizeX, int sizeY){
        urlLabel.setSize(sizeX, sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX, int positionY){
        urlLabel.setBounds(sizeX,sizeY,positionX, positionY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public int getSizeX(){
        return this.sizeX;
    }
    public int getSizeY(){
        return this.sizeY;
    }
    public int getPositionX(){
        return this.positionX;
    }
    public int getPositionY(){
        return this.positionY;
    }
    public boolean isClicked(){
        return this.isClicked;
    }
}
