package jadt.Core;

import jadt.Core.Constants.WindowConstants;
import jadt.Layouts.*;
import jadt.Layouts.GridBagLayout;
import jadt.utils.Clock.Clock;
import juit.Layouts.*;

import javax.swing.*;
import java.awt.*;
import java.security.InvalidParameterException;

public class Window implements WindowConstants {
    private static JFrame window = new JFrame();
    private Dimension size = Toolkit.getDefaultToolkit ().getScreenSize();
    private int PositionX = size.width;
    private int PositionY = size.height;
    private int SizeX;
    private int SizeY;
    private String Title;
    private boolean isVisible;


    public Window() {
        window.setVisible(true);
        window.setSize(400,400);
        this.setLocationOnScreen(Window.centre);

    }
    public static void setTitleBarIcon(ImageIcon iconPath){
        window.setIconImage(iconPath.getImage());
    }
    public void showWindow() {
        window.setVisible(true);
    }
    public void hideWindow() {
        window.setVisible(false);
    }
    public Window(String Title) {
        setTitle(Title);
        window.setSize(400,400);

    }

    private void setPosition(int PositionX, int PositionY) {
        window.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }

    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public Window(String Title, int SizeX, int SizeY)
    {
        window.setTitle(Title);
        window.setVisible(true);
        window.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
        this.Title = Title;
    }
    public Window(String Title, int SizeX, int SizeY, int PositionX, int PositionY)
    {
        window.setTitle(Title);
        window.setVisible(true);
        window.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.Title = Title;
    }
    public JFrame getWindow() {
        return window;
    }
    public void setCloseOperation(int WindowNumber)
    {
        if(WindowNumber == Window.doNothingOnClose) window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        if(WindowNumber == Window.hideOnClose) window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        if(WindowNumber == Window.disposeOnClose) window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        if(WindowNumber == Window.exitOnClose) window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int GetSizeX(){return SizeX;}
    public int GetSizeY() {return SizeY;}
    public void add(Button button)
    {
        window.add(button.getButton());
    }
    public void add(Label label)
    {
        window.add(label.label);
    }
    public void add(Clock clock)
    {
        if(clock.getClockType().equals("Digital"))window.add(clock.getDigitalClock());
        if(clock.getClockType().equals("Analog"))window.add(clock.getAnalogClock());
    }
    public void add(Spinner spinner)
    {
        window.add(spinner.jSpinner);
    }
    public void add(CheckBox checkBox)
    {
        window.add(checkBox.jCheckBox);
    }
    public void add(MenuBar menuBar)
    {
        window.add(menuBar.menuBar);
    }
    public void add(PasswordField passwordField)
    {
        window.add(passwordField.jPasswordField);
    }
    public void add(Slider slider)
    {
        window.add(slider.jSlider);
    }
    public void add(TextField textField)
    {
        window.add(textField.jTextField);
    }
    public void add(ToggleSwitch toggleSwitch)
    {
        window.add(toggleSwitch.jToggleButton);
    }
    public void add(Panel panel)
    {
        window.add(panel.jPanel);
    }
    public void setLayout(jadt.Layouts.FlowLayout flowLayout)
    {
        window.setLayout(flowLayout.getLayout());
    }
    public void setLayout(FreeFormLayout freeFormLayout)
    {
        window.setLayout((LayoutManager) freeFormLayout.getLayout());
    }
    public void setLayout(BoxLayouts boxLayouts, Container pane, int AXIS)
    {
        window.setLayout(boxLayouts.getBoxLayout(pane,AXIS));
        if(AXIS != BoxLayouts.X_AXIS &&AXIS != BoxLayouts.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter Which is Invalid. Try To use'BoxLayouts.Y_AXIS' or 'BoxLayouts.X_AXIS'");
    }
    public void setLayout(jadt.Layouts.CardLayout cardLayout)
    {
        window.setLayout(cardLayout.cardLayout);
    }
    public void setLayout(GridBagLayout gridBagLayouts)
    {
        window.setLayout(gridBagLayouts.getLayout());
    }
    public void setLayout(jadt.Layouts.GridLayout gridLayouts)
    {
        window.setLayout(gridLayouts.getLayout());
    }
    public void setLayout(jadt.Layouts.SpringLayout springLayouts)
    {
        window.setLayout(springLayouts.getLayout());
    }
    public void setLocationOnScreen(Component component)
    {
        window.setLocationRelativeTo(component);
    }
    public void setLocationOnScreen(byte location)
    {
        JLabel temp = new JLabel();
        if(location == Window.centre)window.setLocationRelativeTo(null);
        else if(location== Window.leftCentre){
            temp.setBounds(0, PositionY /2,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location==Window.rightCentre){
            temp.setBounds(PositionX, PositionY /2,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location == Window.downCentre){
            temp.setBounds(PositionX/2, PositionY,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location == Window.upCentre){
            temp.setBounds(PositionX,0,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location ==Window.rightDownCorner){
            temp.setBounds(0, PositionY,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location == Window.rightUpCorner){
            temp.setBounds(0,0,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location == Window.leftUpCorner){
            temp.setBounds(PositionX, PositionY /2,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location == Window.leftDownCorner){
            temp.setBounds(PositionX, PositionY,0,0);
            window.setLocationRelativeTo(temp);
        }

    }

    public void setTitle(String Title) {
        window.setTitle(Title);
        this.Title = Title;
    }

    public void setDefaultCloseOperation(int index) {
        window.setDefaultCloseOperation(index);
    }
    public boolean isShown(){
        return isVisible;
    }
}