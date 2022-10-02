package jadt.core;
import jadt.graphics.Color;

import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.util.Objects;

@SuppressWarnings("ALL")
public class Button extends AppComponent {
    private JButton jButton = new JButton();

    private String Text;
    private int positionY = 0,
    positionX = 0,
    sizeX = 100,
    sizeY = 50;
    private boolean isVisible = false;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Button)) return false;
        Button button = (Button) o;
        return positionY == button.positionY && positionX == button.positionX && sizeX == button.sizeX && sizeY == button.sizeY && isVisible == button.isVisible && Objects.equals(jButton, button.jButton) && Objects.equals(Text, button.Text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jButton, Text, positionY, positionX, sizeX, sizeY, isVisible);
    }

    @Override
    public String toString() {
        return "Button{" +
                "JButton=" + jButton +
                ", Text='" + Text + '\'' +
                ", PositionY=" + positionY +
                ", PositionX=" + positionX +
                ", SizeX=" + sizeX +
                ", sizeY=" + sizeY +
                ", isVisible=" + isVisible +
                '}';
    }

    public Button(String Text, Icon icon) {
        jButton.setText(Text);
        jButton.setSize(positionX,positionY);
        jButton.setVisible(true);
        this.Text = Text;
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public Button(String Text){
        jButton.setText(Text);
        jButton.setVisible(true);
        this.Text = Text;
    }
    public void showComponent(){
        jButton.setVisible(true);
        this.isVisible = true;
    }
    public void hideComponent() {
        jButton.setVisible(false);
        this.isVisible = false;
    }
    public Button(){
        jButton.setVisible(true);
    }

    public String getText()
    {return Text;}
    public int GetPositionX()
    {return positionX;}
    public int GetPositionY()
    {return positionY;}
    public int getSizeX()
    {return sizeX;}
    public int getSizeY()
    {return sizeY;}

    public JButton getButton() {
        return jButton;
    }

    public void setText(String text) {jButton.setText(text);}
    public void setButtonSize(int sizeX,int sizeY)
    {
        jButton.setSize(sizeX,sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void addActionListener(ActionListener actionListener)
    {
        jButton.addActionListener(actionListener);
    }

    public boolean isVisible(){
        return isVisible;
    }
    public void setColor(Color color){
        jButton.setBackground(color);
    }
    public void setTextColor(Color color){
        jButton.setForeground(color);
    }

}
