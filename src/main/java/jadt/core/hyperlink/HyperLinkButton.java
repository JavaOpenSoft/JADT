package jadt.core.hyperlink;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.net.URI;
import java.util.Map;

public class HyperLinkButton {
    private short positionX;
    private short positionY;
    private short sizeX;
    private short sizeY;
    public final java.awt.Color urlColour = new java.awt.Color(0, 143, 241);
    public final java.awt.Color mouseOnHoverColor = new java.awt.Color(0,113, 241);
    public final java.awt.Color ClickedURL_Colour = new java.awt.Color(176, 86, 242);
    private final JButton button = new JButton();
    private boolean isClicked = false;
    @SuppressWarnings("SpellCheckingInspection")
    private boolean isDirectable;
    private String text;
    private String url;
    public JButton getComponent() {
        return button;
    }
    public HyperLinkButton(){
        button.setForeground(urlColour);
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
        button.getModel().addChangeListener(evt -> {
            ButtonModel model = (ButtonModel) evt.getSource();
            Font btnFont = button.getFont();
            Map attributes = btnFont.getAttributes();

            if (model.isRollover()) {
                attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            } else {
                attributes.put(TextAttribute.UNDERLINE, null);
            }
            btnFont = btnFont.deriveFont(attributes);
            button.setFont(btnFont);
        });
    }
    public HyperLinkButton(String Url){
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
        button.getModel().addChangeListener(evt -> {
            ButtonModel model = (ButtonModel) evt.getSource();
            Font btnFont = button.getFont();
            Map attributes = btnFont.getAttributes();

            if (model.isRollover()) {
                attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            } else {
                attributes.put(TextAttribute.UNDERLINE, null);
            }
            btnFont = btnFont.deriveFont(attributes);
            button.setFont(btnFont);
        });
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
        button.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                button.setForeground(mouseOnHoverColor);
            }
            public void mouseExited(MouseEvent me) {
                button.setForeground(urlColour);
            }
        });
        button.getModel().addChangeListener(evt -> {
            ButtonModel model = (ButtonModel) evt.getSource();
            Font btnFont = button.getFont();
            Map attributes = btnFont.getAttributes();

            if (model.isRollover()) {
                attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            } else {
                attributes.put(TextAttribute.UNDERLINE, null);
            }
            btnFont = btnFont.deriveFont(attributes);
            button.setFont(btnFont);
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
