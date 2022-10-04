package jadt.core;

import jadt.core.constants.WindowConstants;
import jadt.core.hyperlink.Hyperlink;
import jadt.layouts.*;
import jadt.layouts.BoxLayout;
import jadt.layouts.GridBagLayout;
import jadt.templates.clock.Clock;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.security.InvalidParameterException;
@SuppressWarnings("all")
public class Window  implements WindowConstants {
    private static final JFrame window = new JFrame();
    private final Dimension size = Toolkit.getDefaultToolkit ().getScreenSize();
    private int positionX = (int)size.width/2;
    private int positionY = (int)size.height/2;
    private int sizeX = 300;
    private int sizeY = 300;
    private boolean isVisible;


    public Window() {
        window.setVisible(true);
        window.setSize(sizeX, sizeY);
        window.setLocation(positionX, positionY);
        this.setLocationOnScreen(Window.centre);
        setLayout(new FreeFormLayout());
    }
    public Window(String Title) {
        setTitle(Title);
        window.setSize(400,400);
        window.setLayout(null);
        this.setLocationOnScreen(Window.centre);
        setLayout(new FreeFormLayout());
    }
    public Window(String Title, int sizeX, int sizeY)
    {
        window.setTitle(Title);
        window.setVisible(true);
        window.setSize(sizeX,sizeY);
        this.setLocationOnScreen(Window.centre);
        setLayout(new FreeFormLayout());
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public Window(String Title, int sizeX, int sizeY, int positionX, int positionY)
    {
        window.setTitle(Title);
        window.setVisible(true);
        window.setBounds(positionX,positionY,sizeX,sizeY);
        window.setLayout(null);
        this.setLocationOnScreen(Window.centre);
        setLayout(new FreeFormLayout());
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public String getTitle(){
        return window.getTitle();
    }
    public static void setTitleBarIcon(@NotNull ImageIcon iconPath){
        window.setIconImage(iconPath.getImage());
    }
    public void show() {
        window.setVisible(true);
    }
    public void hide() {
        window.setVisible(false);
    }
    public void setPosition(int positionX, int positionY) {
        window.setLocation(positionX,positionY);
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
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
    public void add(@NotNull Button button)
    {
        window.add(button.getButton());
    }
    public void add(@NotNull Label label)
    {
        window.add(label.getComponent());
    }
    public void add(@NotNull Clock clock)
    {
        if(clock.getClockType().equals("Digital"))window.add(clock.getDigitalClock());
        if(clock.getClockType().equals("Analog"))window.add(clock.getAnalogClock());
    }
    public void add(@NotNull Spinner spinner)
    {
        window.add(spinner.getComponent());
    }
    public void add(@NotNull CheckBox checkBox)
    {
        window.add(checkBox.getComponent());
    }
    public void add(@NotNull MenuBar menuBar)
    {
        window.add(menuBar.getComponent());
    }
    public void add(@NotNull PasswordField passwordField)
    {
        window.add(passwordField.getComponent());
    }
    public void add(@NotNull Slider slider)
    {
        window.add(slider.getComponent());
    }
    public void add(@NotNull TextField textField)
    {
        window.add(textField.getComponent());
    }
    public void add(@NotNull ToggleSwitch toggleSwitch)
    {
        window.add(toggleSwitch.getComponent());
    }
    public void add(@NotNull Panel panel)
    {
        window.add(panel.getComponent());
    }
    public void add(@NotNull Hyperlink hyperlink){window.add(hyperlink.getComponent());}
    public void add(@NotNull EditorPane editorPane){window.add(editorPane.getComponent());}
    public void add(@NotNull ExpandableButton expandableButton){window.add(expandableButton.getComponent());}
    public void add(@NotNull FormattedTextField formattedTextField){window.add(formattedTextField.getComponent());}
    public void add(@NotNull ImageFrame imageFrame){window.add(imageFrame.getComponent());}
    public void add(@NotNull PopupMenu popupMenu){window.add(popupMenu.getComponent());}
    public void add(@NotNull ProgressBar progressBar){window.add(progressBar.getComponent());}
    public void add(@NotNull RadioButton radioButton){window.add(radioButton.getComponent());}
    public void add(@NotNull ScrollPane scrollPane){window.add(scrollPane.getComponent());}
    public void add(@NotNull ScrollBar scrollBar, byte Type){window.add(scrollBar.getComponent(Type));}
    public void add(@NotNull Separator separator){window.add(separator.getComponent());}
    public void add(@NotNull TabbedPane tabbedPane){window.add(tabbedPane.getComponent());}
    public void add(@NotNull TextArea textArea){window.add(textArea.getComponent());}
    public void add(@NotNull TextPane textPane){window.add(textPane.getComponent());}
    public void add(@NotNull MacOSScreenMenuBar macOsScreenMenuBar){
        macOsScreenMenuBar.enableScreenMenuBar();
    }
    public void setLayout(jadt.layouts.@NotNull FlowLayout flowLayout)
    {
        window.setLayout(flowLayout.getLayout());
    }
    public void setLayout(@NotNull FreeFormLayout freeFormLayout)
    {
        window.setLayout((LayoutManager) freeFormLayout.getLayout());
    }
    public void setLayout(@NotNull BoxLayout boxLayout, @NotNull Window pane,@NotNull int AXIS)
    {
        window.setLayout(boxLayout.getBoxLayout(pane.getComponent(), AXIS));
        if(AXIS != BoxLayout.X_AXIS &&AXIS != BoxLayout.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter is Invalid. Try To use 'BoxLayout.Y_AXIS' or 'BoxLayout.X_AXIS'");
    }
    public void setLayout(@NotNull BoxLayout boxLayout, @NotNull Panel pane, @NotNull int AXIS)
    {
        window.setLayout(boxLayout.getBoxLayout(pane.getComponent(), AXIS));
        if(AXIS != BoxLayout.X_AXIS &&AXIS != BoxLayout.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter is Invalid. Try To use 'BoxLayout.Y_AXIS' or 'BoxLayout.X_AXIS'");
    }
    public void setLayout(jadt.layouts.@NotNull CardLayout cardLayout)
    {
        window.setLayout(cardLayout.cardLayout);
    }
    public void setLayout(@NotNull GridBagLayout gridBagLayouts)
    {
        window.setLayout(gridBagLayouts.getLayout());
    }
    public void setLayout(jadt.layouts.@NotNull GridLayout gridLayouts)
    {
        window.setLayout(gridLayouts.getLayout());
    }
    public void setLayout(jadt.layouts.@NotNull SpringLayout springLayouts) {window.setLayout(springLayouts.getLayout());}
    public void setLayout(jadt.layouts.@NotNull BorderLayout borderLayouts) {window.setLayout(borderLayouts.getLayout());}
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
    public void setLocation(int positionX, int positionY){
        window.setLocation(positionX, positionY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setTitle(String Title) {
        window.setTitle(Title);
    }
    public void centreOf(){}
    public void setDefaultCloseOperation(int index) {
        window.setDefaultCloseOperation(index);
    }
    public boolean isShown(){
        return isVisible;
    }
    public void setMenuBar(MenuBar menuBar) {
        window.setJMenuBar(menuBar.getComponent());
    }
}