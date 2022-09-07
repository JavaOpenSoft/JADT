package jadt.Core;
import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.*;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class Button {
    private JButton jButton = new JButton();
    private String Text;
    private int PositionY = 50, PositionX = 100, SizeX = 100,SizeY = 50;
    private boolean isVisible = false;

    public Button(String Text, Icon icon) {
        jButton.setText(Text);
        jButton.setSize(PositionX,PositionY);
        jButton.setVisible(true);
        this.Text = Text;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
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
    {return PositionX;}
    public int GetPositionY()
    {return PositionY;}
    public int GetSizeX()
    {return SizeX;}
    public int GetSizeY()
    {return SizeY;}

    public JButton getButton() {
        return jButton;
    }

    public void setText(String text) {jButton.setText(text);}
    public void setButtonSize(int SizeX,int SizeY)
    {
        jButton.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void addActionListener(ActionListener actionListener)
    {
        jButton.addActionListener(actionListener);
    }

    public boolean isVisible(){
        return isVisible;
    }

}
