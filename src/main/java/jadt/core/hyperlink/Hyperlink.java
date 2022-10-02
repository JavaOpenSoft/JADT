package jadt.core.hyperlink;
import jadt.core.AppComponent;

import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Hyperlink extends AppComponent {
    public final java.awt.Color URL_Colour = new java.awt.Color(0, 143, 241);
    public final java.awt.Color ClickedURL_Colour = new java.awt.Color(176, 86, 242);
    int sizeX;
    int sizeY;
    int positionX;
    int positionY;
    private final JLabel urlLabel = new JLabel();
    public Hyperlink(){
        urlLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI(urlLabel.getText()));
                    setClickedColor();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }
    public Hyperlink(String url) {
        resetColor();
        urlLabel.setText(url);
        urlLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI(urlLabel.getText()));
                    setClickedColor();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
                setClickedColor();
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

}
