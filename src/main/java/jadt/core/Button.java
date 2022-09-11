package jadt.core;
import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.util.Objects;

@SuppressWarnings("ALL")
public class Button {
    private JButton jButton = new JButton();

    private String Text;
    private int PositionY = 50, PositionX = 100, SizeX = 100,SizeY = 50;
    private boolean isVisible = false;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Button)) return false;
        Button button = (Button) o;
        return PositionY == button.PositionY && PositionX == button.PositionX && SizeX == button.SizeX && SizeY == button.SizeY && isVisible == button.isVisible && Objects.equals(jButton, button.jButton) && Objects.equals(Text, button.Text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jButton, Text, PositionY, PositionX, SizeX, SizeY, isVisible);
    }

    @Override
    public String toString() {
        return "Button{" +
                "JButton=" + jButton +
                ", Text='" + Text + '\'' +
                ", PositionY=" + PositionY +
                ", PositionX=" + PositionX +
                ", SizeX=" + SizeX +
                ", SizeY=" + SizeY +
                ", isVisible=" + isVisible +
                '}';
    }

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
