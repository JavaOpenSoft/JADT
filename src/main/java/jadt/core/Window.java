package jadt.core;
//Dependencies from AWT
import java.awt.*;
//Components from JADT to be added
import jadt.JADTComponent;
import jadt.core.constants.WindowConstants;
import jadt.core.hyperlink.HyperLinkButton;
import jadt.core.hyperlink.Hyperlink;
import jadt.core.misc.Shape;
import jadt.events.*;
import jadt.graphics.Gradient;
import jadt.layouts.FreeFormLayout;
import jadt.layouts.BoxLayout;
import jadt.layouts.GridBagLayout;
import jadt.templates.clock.Clock;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.security.InvalidParameterException;
import org.jetbrains.annotations.NotNull;
@SuppressWarnings("all")
public class Window extends JADTComponent implements WindowConstants {
    private static JFrame window = new JFrame();
    private final Dimension screenSize = Toolkit.getDefaultToolkit ().getScreenSize();
    private int positionX = (int) screenSize.width/2;
    private int positionY = (int) screenSize.height/2;
    private int sizeX = 300;
    private int sizeY = 300;


    public Window() {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(sizeX, sizeY);
        window.setLocation(positionX, positionY);
        this.setLocationOnScreen(Window.centre);
        setLayout(new FreeFormLayout());
        window.setVisible(true);
    }
    public Window(String Title) {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(Title);
        window.setSize(400,400);
        window.setLayout(null);
        this.setLocationOnScreen(Window.centre);
        setLayout(new FreeFormLayout());
    }
    public Window(String Title, int sizeX, int sizeY)
    {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle(Title);
        window.setSize(sizeX,sizeY);
        this.setLocationOnScreen(Window.centre);
        setLayout(new FreeFormLayout());
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        window.setVisible(true);
    }

    public Window(String Title, int sizeX, int sizeY, int positionX, int positionY)
    {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle(Title);
        window.setBounds(positionX,positionY,sizeX,sizeY);
        window.setLayout(null);
        this.setLocationOnScreen(Window.centre);
        setLayout(new FreeFormLayout());
        window.setVisible(true);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public String getTitle(){
        return window.getTitle();
    }
    public void setTitleBarIcon(@NotNull ImageIcon iconPath){
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
    public void add(@NotNull HyperLinkButton hyperLinkButton){window.add(hyperLinkButton.getComponent());}
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
        if(clock.getClockType().equals("Analog"))window.add(clock.getAnalogClock().getComponent());
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


    public void add(@NotNull FormattedTextField formattedTextField){window.add(formattedTextField.getComponent());}

    public void add(@NotNull ImageFrame imageFrame){window.add(imageFrame.getComponent());}

    public void add(@NotNull PopupMenu popupMenu){window.add(popupMenu.getComponent());}

    public void add(@NotNull ProgressBar progressBar){
        window.add(progressBar.getComponent());}

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

    public void remove(@NotNull Button button) {window.remove(button.getButton());}

    public void remove(@NotNull Label label) {window.remove(label.getComponent());}

    public void remove(@NotNull Clock clock)
    {
        if(clock.getClockType().equals("Digital"))window.remove(clock.getDigitalClock());
        if(clock.getClockType().equals("Analog"))window.remove(clock.getAnalogClock());
    }
    public void remove(@NotNull Spinner spinner) {window.remove(spinner.getComponent());}

    public void remove(@NotNull CheckBox checkBox) {window.remove(checkBox.getComponent());}

    public void remove(@NotNull MenuBar menuBar)
    {
        window.remove(menuBar.getComponent());
    }

    public void remove(@NotNull PasswordField passwordField) {window.remove(passwordField.getComponent());}

    public void remove(@NotNull Slider slider)
    {
        window.remove(slider.getComponent());
    }

    public void remove(@NotNull TextField textField) {window.remove(textField.getComponent());}

    public void remove(@NotNull ToggleSwitch toggleSwitch) {window.remove(toggleSwitch.getComponent());}

    public void remove(@NotNull Panel panel) {window.remove(panel.getComponent());}

    public void remove(@NotNull Hyperlink hyperlink){window.remove(hyperlink.getComponent());}

    public void remove(@NotNull EditorPane editorPane){window.remove(editorPane.getComponent());}


    public void remove(@NotNull FormattedTextField formattedTextField){window.remove(formattedTextField.getComponent());}

    public void remove(@NotNull ImageFrame imageFrame){window.remove(imageFrame.getComponent());}

    public void remove(@NotNull PopupMenu popupMenu){window.remove(popupMenu.getComponent());}

    public void remove(@NotNull ProgressBar progressBar){window.remove(progressBar.getComponent());}

    public void remove(@NotNull RadioButton radioButton){window.remove(radioButton.getComponent());}

    public void remove(@NotNull ScrollPane scrollPane){window.remove(scrollPane.getComponent());}

    public void remove(@NotNull ScrollBar scrollBar, byte Type){window.remove(scrollBar.getComponent(Type));}

    public void remove(@NotNull Separator separator){window.remove(separator.getComponent());}

    public void remove(@NotNull TabbedPane tabbedPane){window.remove(tabbedPane.getComponent());}

    public void remove(@NotNull TextArea textArea){window.remove(textArea.getComponent());}

    public void remove(@NotNull TextPane textPane){window.remove(textPane.getComponent());}

    public void remove(@NotNull MacOSScreenMenuBar macOsScreenMenuBar){
        macOsScreenMenuBar.disableScreenMenuBar();
    }

    public void addComponentEvent(@NotNull ComponentEvent event){window.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){window.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){window.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){window.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){window.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){window.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){window.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){window.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){window.addHierarchyBoundsListener(event);}
    public void removeHeirarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){window.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){window.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){window.removeInputMethodListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){window.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){window.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){window.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){window.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){window.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){window.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){window.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){window.removeMouseWheelListener(event);}

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
    public void setLocationOnScreen(byte location)
    {
        if(location == Window.centre)window.setLocationRelativeTo(null);
        else if(location== Window.leftCentre)
            window.setLocation(0,screenSize.height/2);

        else if(location==Window.rightCentre)
            window.setLocation(screenSize.width,screenSize.height/2);

        else if(location == Window.downCentre)
            window.setLocation(screenSize.width/2,screenSize.height);

        else if(location == Window.upCentre)
            window.setLocation(screenSize.height/2,0);

        else if(location ==Window.rightDownCorner)
            window.setLocation(screenSize.width, screenSize.height);

        else if(location == Window.rightUpCorner)
            window.setLocation(screenSize.width,0);

        else if(location == Window.leftUpCorner)
            window.setLocation(0, 0);

        else if(location == Window.leftDownCorner)
            window.setLocation(0, positionY);

    }
    public void setLocation(int positionX, int positionY){
        window.setLocation(positionX, positionY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setTitle(String Title) {
        window.setTitle(Title);
    }
    public void setDefaultCloseOperation(int index) {
        window.setDefaultCloseOperation(index);
    }
    public boolean isShown(){
        return window.isVisible();
    }
    public void setMenuBar(MenuBar menuBar) {
        window.setJMenuBar(menuBar.getComponent());
    }
    public Dimension getScreenSize() { return window.getSize();}
    public void setFocusable(boolean focusable) { window.setFocusable(focusable); }
    public void setForeground(java.awt.Color foreground) { window.setForeground(foreground); }
    public void setBackground(java.awt.Color background) { window.setBackground(background); }
    public Container getContentPane() { return window.getContentPane(); }
    public void packComponentsTogether() { window.pack();}
    public void setPreferredSize(int sizeX, int sizeY) { window.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { window.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { window.setMinimumSize(new Dimension(sizeX, sizeY)); }
    public void setTranslucency(int value){
        window.setOpacity(value/100);
    }
    public void setShape(Shape shape){
        window.setShape(shape);
    }
    public void setForeground(Gradient background){

    }
    public void setTransperancy(int value){
        window.setBackground(new Color(1.0f, 1.0f, 1.0f, value/100));
    }
    public void setTransperancy(jadt.graphics.Color color, int value){
        window.setBackground(new Color(color.getRed(),color.getGreen(),color.getBlue(),value/100 ));
    }
    public void setTransperancy(int r, int g, int b, int value){
        window.setBackground(new Color(r,g,b,value/100 ));
    }
    public void hideDecorations(){
        window.setUndecorated(true);
    }
    public void showDecorations() {
        window.setUndecorated(false);
    }

}