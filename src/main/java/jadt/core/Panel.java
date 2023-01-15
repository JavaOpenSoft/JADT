package jadt.core;

import jadt.JADTComponent;
import jadt.core.hyperlink.HyperLinkButton;
import jadt.core.hyperlink.Hyperlink;
import jadt.core.misc.DraggableComponent;
import jadt.layouts.*;
import jadt.layouts.BoxLayout;
import jadt.layouts.GridBagLayout;
import jadt.templates.clock.Clock;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.security.InvalidParameterException;
import jadt.events.*;

public class Panel extends JADTComponent {
    @SuppressWarnings("FieldMayBeFinal")
    private DraggableComponent draggableComponent;
    private JPanel panel = new JPanel();
    private final Dimension size = Toolkit.getDefaultToolkit ().getScreenSize();
    public Panel(){
        panel.setBounds(size.width / 2, size.height / 2, 300, 300);
        setLayout(new FreeFormLayout());
    }

    public int getPositionX() {
        return panel.getX();
    }

    public int getPositionY() {
        return panel.getY();
    }

    public int getSizeX() {
        return panel.getWidth();
    }
    public int getSizeY() {
        return panel.getHeight();
    }
    public Dimension getScreenSize() { return size; }
    public JPanel getComponent() { return panel; }

    public void add(Button button) {
        panel.add(button.getButton());
    }

    public void add(Label label) {
        panel.add(label.getComponent());
    }

    public void add(Clock clock) {
        if (clock.getClockType().equals("Digital")) panel.add(clock.getDigitalClock());
        if (clock.getClockType().equals("Analog")) panel.add(clock.getAnalogClock());
    }

    public void add(Spinner spinner) {
        panel.add(spinner.getComponent());
    }

    public void add(CheckBox checkBox) {
        panel.add(checkBox.getComponent());
    }

    public void add(MenuBar menuBar) {
        panel.add(menuBar.getComponent());
    }

    public void add(PasswordField passwordField) {
        panel.add(passwordField.getComponent());
    }

    public void add(Slider slider) {
        panel.add(slider.getComponent());
    }

    public void add(TextField textField) {
        panel.add(textField.getComponent());
    }

    public void add(ToggleSwitch toggleSwitch) {
        panel.add(toggleSwitch.getComponent());
    }

    public void add(Panel panel) {
        this.panel.add(panel.panel);
    }
    public void add(HyperLinkButton hyperLinkButton) {panel.add(hyperLinkButton.getComponent());}
    public void remove(@NotNull Button button) {
        panel.remove(button.getButton());}

    public void remove(@NotNull Label label) {
        panel.remove(label.getComponent());}

    public void remove(@NotNull Clock clock)
    {
        if(clock.getClockType().equals("Digital")) panel.remove(clock.getDigitalClock());
        if(clock.getClockType().equals("Analog")) panel.remove(clock.getAnalogClock());
    }
    public void remove(@NotNull Spinner spinner) {
        panel.remove(spinner.getComponent());}

    public void remove(@NotNull CheckBox checkBox) {
        panel.remove(checkBox.getComponent());}

    public void remove(@NotNull MenuBar menuBar)
    {
        panel.remove(menuBar.getComponent());
    }

    public void remove(@NotNull PasswordField passwordField) {
        panel.remove(passwordField.getComponent());}
    public void remove(@NotNull HyperLinkButton hyperLinkButton){panel.remove(hyperLinkButton.getComponent());}
    public void remove(@NotNull Slider slider)
    {
        panel.remove(slider.getComponent());
    }

    public void remove(@NotNull TextField textField) {
        panel.remove(textField.getComponent());}

    public void remove(@NotNull ToggleSwitch toggleSwitch) {
        panel.remove(toggleSwitch.getComponent());}

    public void remove(@NotNull Panel panel) {
        this.panel.remove(panel.getComponent());}

    public void remove(@NotNull Hyperlink hyperlink){
        panel.remove(hyperlink.getComponent());}

    public void remove(@NotNull EditorPane editorPane){
        panel.remove(editorPane.getComponent());}



    public void remove(@NotNull FormattedTextField formattedTextField){
        panel.remove(formattedTextField.getComponent());}

    public void remove(@NotNull ImageFrame imageFrame){
        panel.remove(imageFrame.getComponent());}

    public void remove(@NotNull PopupMenu popupMenu){
        panel.remove(popupMenu.getComponent());}

    public void remove(@NotNull ProgressBar progressBar){
        panel.remove(progressBar.getComponent());}

    public void remove(@NotNull RadioButton radioButton){
        panel.remove(radioButton.getComponent());}

    public void remove(@NotNull ScrollPane scrollPane){
        panel.remove(scrollPane.getComponent());}

    public void remove(@NotNull ScrollBar scrollBar, byte Type){
        panel.remove(scrollBar.getComponent(Type));}

    public void remove(@NotNull Separator separator){
        panel.remove(separator.getComponent());}

    public void remove(@NotNull TabbedPane tabbedPane){
        panel.remove(tabbedPane.getComponent());}

    public void remove(@NotNull TextArea textArea){
        panel.remove(textArea.getComponent());}

    public void remove(@NotNull TextPane textPane){
        panel.remove(textPane.getComponent());}

    public void remove(@NotNull MacOSScreenMenuBar macOsScreenMenuBar){
        macOsScreenMenuBar.disableScreenMenuBar();
    }

    public void setLayout(jadt.layouts.@NotNull FlowLayout flowLayout)
    {
        panel.setLayout(flowLayout.getLayout());
    }
    public void setLayout(@NotNull FreeFormLayout freeFormLayout)
    {
        panel.setLayout((LayoutManager) freeFormLayout.getLayout());
    }
    public void setLayout(@NotNull BoxLayout boxLayout, @NotNull Window pane, int AXIS)
    {
        panel.setLayout(boxLayout.getBoxLayout(pane.getComponent(), AXIS));
        if(AXIS != BoxLayout.X_AXIS &&AXIS != BoxLayout.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter is Invalid. Try To use 'BoxLayout.Y_AXIS' or 'BoxLayout.X_AXIS'");
    }
    public void setLayout(@NotNull BoxLayout boxLayout, @NotNull Panel pane, int AXIS)
    {
        panel.setLayout(boxLayout.getBoxLayout(pane.getComponent(), AXIS));
        if(AXIS != BoxLayout.X_AXIS &&AXIS != BoxLayout.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter is Invalid. Try To use 'BoxLayout.Y_AXIS' or 'BoxLayout.X_AXIS'");
    }
    public void setLayout(jadt.layouts.@NotNull CardLayout cardLayout)
    {
        panel.setLayout(cardLayout.cardLayout);
    }
    public void setLayout(@NotNull GridBagLayout gridBagLayouts)
    {
        panel.setLayout(gridBagLayouts.getLayout());
    }
    public void setLayout(jadt.layouts.@NotNull GridLayout gridLayouts)
    {
        panel.setLayout(gridLayouts.getLayout());
    }
    public void setLayout(jadt.layouts.@NotNull SpringLayout springLayouts) {
        panel.setLayout(springLayouts.getLayout());}
    public void setLayout(jadt.layouts.@NotNull BorderLayout borderLayouts) {
        panel.setLayout(borderLayouts.getLayout());}
    public void setSize(int sizeX, int sizeY) {
        panel.setSize(sizeX,sizeY);}
    public void setLocation(int positionX, int positionY){
        panel.setLocation(positionX,positionY);}
    public void setBounds(int sizeX, int sizeY, int positionX, int positionY){
        panel.setBounds(positionX,positionY,sizeX,sizeY);}
    public Rectangle getBounds(){return new Rectangle(getPositionX(),getPositionY(),getSizeX(),getSizeY());}

    public void addAncestorEvent(@NotNull AncestorEvent event){panel.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){panel.removeAncestorListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){panel.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){panel.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){panel.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){panel.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){panel.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){panel.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){panel.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){panel.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){panel.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){panel.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){panel.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){panel.removeInputMethodListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){panel.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){panel.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){panel.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){panel.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){panel.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){panel.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){panel.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){panel.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){panel.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){panel.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggableComponent = new DraggableComponent(panel);
        }
        else if(!isDraggable){
            draggableComponent.removeDraggingAbilities();
        }
    }
    public void setPreferredSize(int sizeX, int sizeY) { panel.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { panel.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { panel.setMinimumSize(new Dimension(sizeX, sizeY)); }

}
