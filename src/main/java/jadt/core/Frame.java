package jadt.core;

import jadt.JADTComponent;
import jadt.core.hyperlink.HyperLinkButton;
import jadt.core.hyperlink.Hyperlink;
import jadt.core.misc.Shape;
import jadt.events.*;
import jadt.layouts.FreeFormLayout;
import jadt.layouts.GridBagLayout;
import jadt.templates.clock.Clock;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.security.InvalidParameterException;

public class Frame extends JADTComponent {
    private final JWindow window = new JWindow();
    private final Dimension screenSize = Toolkit.getDefaultToolkit ().getScreenSize();
    private int positionX = screenSize.width /2;
    private int positionY = screenSize.height /2;
    private int sizeX = 300;
    private int sizeY = 300;
    private boolean isVisible;


    public Frame() {
        window.setVisible(true);
        window.setSize(sizeX, sizeY);
        window.setLocation(positionX, positionY);
        this.setLocationOnScreen(Window.centre);
        setLayout(new FreeFormLayout());
    }
    public Frame(int sizeX, int sizeY)
    {
        window.setVisible(true);
        window.setSize(sizeX,sizeY);
        this.setLocationOnScreen(Window.centre);
        setLayout(new FreeFormLayout());
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public Frame(int sizeX, int sizeY, int positionX, int positionY)
    {
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
    @Override
    public JWindow getComponent() {
        return window;
    }

    public int getSizeX(){return sizeX;}
    public int getSizeY() {return sizeY;}
    public void add(@NotNull Clock clock)
    {
        if(clock.getClockType().equals("Digital"))window.add(clock.getDigitalClock());
        if(clock.getClockType().equals("Analog"))window.add(clock.getAnalogClock());
    }
    public void add(@NotNull Button button)
    {
        window.add(button.getButton());
    }
    public void add(@NotNull Label label)
    {
        window.add(label.getComponent());
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
    public void add(@NotNull ProgressBar progressBar){window.add(progressBar.getComponent());}
    public void add(@NotNull RadioButton radioButton){window.add(radioButton.getComponent());}
    public void add(@NotNull ScrollPane scrollPane){window.add(scrollPane.getComponent());}
    public void add(@NotNull ScrollBar scrollBar, byte Type){window.add(scrollBar.getComponent(Type));}
    public void add(@NotNull Separator separator){window.add(separator.getComponent());}
    public void add(@NotNull TabbedPane tabbedPane){window.add(tabbedPane.getComponent());}
    public void add(@NotNull TextArea textArea){window.add(textArea.getComponent());}
    public void add(@NotNull TextPane textPane){window.add(textPane.getComponent());}
    public void add(@NotNull HyperLinkButton hyperlink){window.add(hyperlink.getComponent());}
    public void add(@NotNull MacOSScreenMenuBar macOsScreenMenuBar){
        macOsScreenMenuBar.enableScreenMenuBar();
    }
    public void remove(@NotNull Clock clock)
    {
        if(clock.getClockType().equals("Digital"))window.remove(clock.getDigitalClock());
        if(clock.getClockType().equals("Analog"))window.remove(clock.getAnalogClock());
    }
    public void remove(@NotNull Button button)
    {
        window.remove(button.getButton());
    }
    public void remove(@NotNull Label label)
    {
        window.remove(label.getComponent());
    }
    public void remove(@NotNull Spinner spinner)
    {
        window.remove(spinner.getComponent());
    }
    public void remove(@NotNull CheckBox checkBox)
    {
        window.remove(checkBox.getComponent());
    }
    public void remove(@NotNull MenuBar menuBar)
    {
        window.remove(menuBar.getComponent());
    }
    public void remove(@NotNull PasswordField passwordField)
    {
        window.remove(passwordField.getComponent());
    }
    public void remove(@NotNull Slider slider)
    {
        window.remove(slider.getComponent());
    }
    public void remove(@NotNull TextField textField)
    {
        window.remove(textField.getComponent());
    }
    public void remove(@NotNull ToggleSwitch toggleSwitch)
    {
        window.remove(toggleSwitch.getComponent());
    }
    public void remove(@NotNull Panel panel)
    {
        window.remove(panel.getComponent());
    }
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
    public void remove(@NotNull HyperLinkButton hyperLinkButton){window.remove(hyperLinkButton.getComponent());}
    public void addComponentEvent(@NotNull ComponentEvent event){window.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){window.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){window.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){window.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){window.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){window.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){window.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){window.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){window.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){window.addHierarchyBoundsListener(event);}

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
    public void setLayout(@NotNull jadt.layouts.BoxLayout boxLayout, @NotNull Window pane, int AXIS)
    {
        window.setLayout(boxLayout.getBoxLayout(pane.getComponent(), AXIS));
        if(AXIS != jadt.layouts.BoxLayout.X_AXIS &&AXIS != jadt.layouts.BoxLayout.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter is Invalid. Try To use 'BoxLayout.Y_AXIS' or 'BoxLayout.X_AXIS'");
    }
    public void setLayout(@NotNull jadt.layouts.BoxLayout boxLayout, @NotNull Panel pane, int AXIS)
    {
        window.setLayout(boxLayout.getBoxLayout(pane.getComponent(), AXIS));
        if(AXIS != jadt.layouts.BoxLayout.X_AXIS &&AXIS != jadt.layouts.BoxLayout.Y_AXIS) throw new InvalidParameterException("setLayout()" +
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
    public void centreOf(){}
    public boolean isShown(){
        return window.isVisible();
    }
    public Dimension getScreenSize() { return window.getSize();}
    public void setFocusable(boolean isFocusable){
        window.setFocusable(isFocusable);
    }
    public boolean isFocusable(){
        return window.isFocusable();
    }
    public void packComponentsTogether() { window.pack();}
    public void setPreferredSize(int sizeX, int sizeY) { window.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { window.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { window.setMinimumSize(new Dimension(sizeX, sizeY)); }
    public void setTranslucency(int value){
        window.setOpacity(((float)value)/100);
    }
    public void setBackground(Image image){
        window.setIconImage(image);
    }
    public void setShape(Shape shape){
        window.setShape(shape);
    }

}
