package jadt.core.url;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class URL{
    public final java.awt.Color URL_Colour = new java.awt.Color(0, 143, 241);
    public final java.awt.Color ClickedURL_Colour = new java.awt.Color(176, 86, 242);
    int SizeX;
    int SizeY;
    int PositionX;
    int PositionY;
    private final JLabel urlLabel = new JLabel();
    public URL(){
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
    public URL(String url) {
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
    public void setSize(int SizeX, int SizeY){
        urlLabel.setSize(SizeX, SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY){
        urlLabel.setBounds(SizeX,SizeY,PositionX, PositionY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public int getSizeX(){
        return this.SizeX;
    }
    public int getSizeY(){
        return this.SizeY;
    }
    public int getPositionX(){
        return this.PositionX;
    }
    public int getPositionY(){
        return this.PositionY;
    }

}
