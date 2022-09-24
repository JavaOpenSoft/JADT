package jadt.core;

import jadt.core.constants.WindowConstants;
import jadt.core.url.URL;
import jadt.layouts.*;
import jadt.layouts.GridBagLayout;
import jadt.templates.clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.security.InvalidParameterException;

public class Window implements WindowConstants {
    private static final JFrame window = new JFrame();
    private final Dimension size = Toolkit.getDefaultToolkit ().getScreenSize();
    private int positionX = size.width;
    private int positionY = size.height;
    private int sizeX;
    private int sizeY;
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

    private void setPosition(int positionX, int positionY) {
        window.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getpositionX() {
        return positionX;
    }

    public int getpositionY() {
        return positionY;
    }

    public Window(String Title, int sizeX, int sizeY)
    {
        window.setTitle(Title);
        window.setVisible(true);
        window.setSize(sizeX,sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.Title = Title;
    }
    public Window(String Title, int sizeX, int sizeY, int positionX, int positionY)
    {
        window.setTitle(Title);
        window.setVisible(true);
        window.setBounds(positionX,positionY,sizeX,sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.positionX = positionX;
        this.positionY = positionY;
        this.Title = Title;
    }
    public JFrame getComponent() {
        return window;
    }
    public void setCloseOperation(int WindowNumber)
    {
        if(WindowNumber == Window.doNothingOnClose) window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        if(WindowNumber == Window.hideOnClose) window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        if(WindowNumber == Window.disposeOnClose) window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        if(WindowNumber == Window.exitOnClose) window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int getSizeX(){return sizeX;}
    public int getSizeY() {return sizeY;}
    public void add(Button button)
    {
        window.add(button.getButton());
    }
    public void add(Label label)
    {
        window.add(label.getComponent());
    }
    public void add(Clock clock)
    {
        if(clock.getClockType().equals("Digital"))window.add(clock.getDigitalClock());
        if(clock.getClockType().equals("Analog"))window.add(clock.getAnalogClock());
    }
    public void add(Spinner spinner)
    {
        window.add(spinner.getComponent());
    }
    public void add(CheckBox checkBox)
    {
        window.add(checkBox.getComponent());
    }
    public void add(MenuBar menuBar)
    {
        window.add(menuBar.getComponent());
    }
    public void add(PasswordField passwordField)
    {
        window.add(passwordField.getComponent());
    }
    public void add(Slider slider)
    {
        window.add(slider.getComponent());
    }
    public void add(TextField textField)
    {
        window.add(textField.getComponent());
    }
    public void add(ToggleSwitch toggleSwitch)
    {
        window.add(toggleSwitch.getComponent());
    }
    public void add(Panel panel)
    {
        window.add(panel.getComponent());
    }
    public void add(URL url){window.add(url.getComponent());}
    public void add(EditorPane editorPane){window.add(editorPane.getComponent());}
    public void add(ExpandableButton expandableButton){window.add(expandableButton.getComponent());}
    public void add(FormattedTextField formattedTextField){window.add(formattedTextField.getComponent());}
    public void add(ImageFrame imageFrame){window.add(imageFrame.getComponent());}
    public void add(PopupMenu popupMenu){window.add(popupMenu.getComponent());}
    public void add(ProgressBar progressBar){window.add(progressBar.getComponent());}
    public void add(RadioButton radioButton){window.add(radioButton.getComponent());}
    public void add(ScrollPane scrollPane){window.add(scrollPane.getComponent());}
    public void add(ScrollBar scrollBar, byte Type){window.add(scrollBar.getComponent(Type));}
    public void add(Separator seperator){window.add(seperator.getComponent());}
    public void add(TabbedPane tabbedPane){window.add(tabbedPane.getComponent());}
    public void add(TextArea textArea){window.add(textArea.getComponent());}
    public void add(TextPane textPane){window.add(textPane.getComponent());}
    public void setLayout(jadt.layouts.FlowLayout flowLayout)
    {
        window.setLayout(flowLayout.getLayout());
    }
    public void setLayout(FreeFormLayout freeFormLayout)
    {
        window.setLayout((LayoutManager) freeFormLayout.getLayout());
    }
    public void setLayout(BoxLayouts boxLayouts, AppComponent pane, int AXIS)
    {
        window.setLayout(boxLayouts.getBoxLayout(pane,AXIS));
        if(AXIS != BoxLayouts.X_AXIS &&AXIS != BoxLayouts.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter Which is Invalid. Try To use'BoxLayouts.Y_AXIS' or 'BoxLayouts.X_AXIS'");
    }
    public void setLayout(jadt.layouts.CardLayout cardLayout)
    {
        window.setLayout(cardLayout.cardLayout);
    }
    public void setLayout(GridBagLayout gridBagLayouts)
    {
        window.setLayout(gridBagLayouts.getLayout());
    }
    public void setLayout(jadt.layouts.GridLayout gridLayouts)
    {
        window.setLayout(gridLayouts.getLayout());
    }
    public void setLayout(jadt.layouts.SpringLayout springLayouts)
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
            temp.setBounds(0, positionY /2,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location==Window.rightCentre){
            temp.setBounds(positionX, positionY /2,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location == Window.downCentre){
            temp.setBounds(positionX/2, positionY,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location == Window.upCentre){
            temp.setBounds(positionX,0,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location ==Window.rightDownCorner){
            temp.setBounds(0, positionY,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location == Window.rightUpCorner){
            temp.setBounds(0,0,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location == Window.leftUpCorner){
            temp.setBounds(positionX, positionY /2,0,0);
            window.setLocationRelativeTo(temp);
        }
        else if(location == Window.leftDownCorner){
            temp.setBounds(positionX, positionY,0,0);
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