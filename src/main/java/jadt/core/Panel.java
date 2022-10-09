package jadt.core;

import jadt.core.hyperlink.Hyperlink;
import jadt.layouts.*;
import jadt.layouts.BoxLayout;
import jadt.layouts.GridBagLayout;
import jadt.templates.clock.Clock;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.security.InvalidParameterException;

public class Panel {
    @SuppressWarnings("FieldMayBeFinal")
    private JPanel jPanel = new JPanel();
    private final Dimension size = Toolkit.getDefaultToolkit ().getScreenSize();
    private final int positionX = size.width /2;
    private final int positionY = size.height /2;

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }
    public Dimension getScreenSize() { return size; }
    private final int sizeX = 300;
    private final int sizeY = 300;
    public JPanel getComponent() { return jPanel; }

    public void add(Button button) {
        jPanel.add(button.getButton());
    }

    public void add(Label label) {
        jPanel.add(label.getComponent());
    }

    public void add(Clock clock) {
        if (clock.getClockType().equals("Digital")) jPanel.add(clock.getDigitalClock());
        if (clock.getClockType().equals("Analog")) jPanel.add(clock.getAnalogClock());
    }

    public void add(Spinner spinner) {
        jPanel.add(spinner.getComponent());
    }

    public void add(CheckBox checkBox) {
        jPanel.add(checkBox.getComponent());
    }

    public void add(MenuBar menuBar) {
        jPanel.add(menuBar.getComponent());
    }

    public void add(PasswordField passwordField) {
        jPanel.add(passwordField.getComponent());
    }

    public void add(Slider slider) {
        jPanel.add(slider.getComponent());
    }

    public void add(TextField textField) {
        jPanel.add(textField.getComponent());
    }

    public void add(ToggleSwitch toggleSwitch) {
        jPanel.add(toggleSwitch.getComponent());
    }

    public void add(Panel panel) {
        jPanel.add(panel.jPanel);
    }
    public void remove(@NotNull Button button) {jPanel.remove(button.getButton());}

    public void remove(@NotNull Label label) {jPanel.remove(label.getComponent());}

    public void remove(@NotNull Clock clock)
    {
        if(clock.getClockType().equals("Digital"))jPanel.remove(clock.getDigitalClock());
        if(clock.getClockType().equals("Analog"))jPanel.remove(clock.getAnalogClock());
    }
    public void remove(@NotNull Spinner spinner) {jPanel.remove(spinner.getComponent());}

    public void remove(@NotNull CheckBox checkBox) {jPanel.remove(checkBox.getComponent());}

    public void remove(@NotNull MenuBar menuBar)
    {
        jPanel.remove(menuBar.getComponent());
    }

    public void remove(@NotNull PasswordField passwordField) {jPanel.remove(passwordField.getComponent());}

    public void remove(@NotNull Slider slider)
    {
        jPanel.remove(slider.getComponent());
    }

    public void remove(@NotNull TextField textField) {jPanel.remove(textField.getComponent());}

    public void remove(@NotNull ToggleSwitch toggleSwitch) {jPanel.remove(toggleSwitch.getComponent());}

    public void remove(@NotNull Panel panel) {jPanel.remove(panel.getComponent());}

    public void remove(@NotNull Hyperlink hyperlink){jPanel.remove(hyperlink.getComponent());}

    public void remove(@NotNull EditorPane editorPane){jPanel.remove(editorPane.getComponent());}

    public void remove(@NotNull ExpandableButton expandableButton){jPanel.remove(expandableButton.getComponent());}

    public void remove(@NotNull FormattedTextField formattedTextField){jPanel.remove(formattedTextField.getComponent());}

    public void remove(@NotNull ImageFrame imageFrame){jPanel.remove(imageFrame.getComponent());}

    public void remove(@NotNull PopupMenu popupMenu){jPanel.remove(popupMenu.getComponent());}

    public void remove(@NotNull ProgressBar progressBar){jPanel.remove(progressBar.getComponent());}

    public void remove(@NotNull RadioButton radioButton){jPanel.remove(radioButton.getComponent());}

    public void remove(@NotNull ScrollPane scrollPane){jPanel.remove(scrollPane.getComponent());}

    public void remove(@NotNull ScrollBar scrollBar, byte Type){jPanel.remove(scrollBar.getComponent(Type));}

    public void remove(@NotNull Separator separator){jPanel.remove(separator.getComponent());}

    public void remove(@NotNull TabbedPane tabbedPane){jPanel.remove(tabbedPane.getComponent());}

    public void remove(@NotNull TextArea textArea){jPanel.remove(textArea.getComponent());}

    public void remove(@NotNull TextPane textPane){jPanel.remove(textPane.getComponent());}

    public void remove(@NotNull MacOSScreenMenuBar macOsScreenMenuBar){
        macOsScreenMenuBar.disableScreenMenuBar();
    }

    public void setLayout(jadt.layouts.@NotNull FlowLayout flowLayout)
    {
        jPanel.setLayout(flowLayout.getLayout());
    }
    public void setLayout(@NotNull FreeFormLayout freeFormLayout)
    {
        jPanel.setLayout((LayoutManager) freeFormLayout.getLayout());
    }
    public void setLayout(@NotNull BoxLayout boxLayout, @NotNull Window pane,@NotNull int AXIS)
    {
        jPanel.setLayout(boxLayout.getBoxLayout(pane.getComponent(), AXIS));
        if(AXIS != BoxLayout.X_AXIS &&AXIS != BoxLayout.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter is Invalid. Try To use 'BoxLayout.Y_AXIS' or 'BoxLayout.X_AXIS'");
    }
    public void setLayout(@NotNull BoxLayout boxLayout, @NotNull Panel pane, @NotNull int AXIS)
    {
        jPanel.setLayout(boxLayout.getBoxLayout(pane.getComponent(), AXIS));
        if(AXIS != BoxLayout.X_AXIS &&AXIS != BoxLayout.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter is Invalid. Try To use 'BoxLayout.Y_AXIS' or 'BoxLayout.X_AXIS'");
    }
    public void setLayout(jadt.layouts.@NotNull CardLayout cardLayout)
    {
        jPanel.setLayout(cardLayout.cardLayout);
    }
    public void setLayout(@NotNull GridBagLayout gridBagLayouts)
    {
        jPanel.setLayout(gridBagLayouts.getLayout());
    }
    public void setLayout(jadt.layouts.@NotNull GridLayout gridLayouts)
    {
        jPanel.setLayout(gridLayouts.getLayout());
    }
    public void setLayout(jadt.layouts.@NotNull SpringLayout springLayouts) {jPanel.setLayout(springLayouts.getLayout());}
    public void setLayout(jadt.layouts.@NotNull BorderLayout borderLayouts) {jPanel.setLayout(borderLayouts.getLayout());}

}
