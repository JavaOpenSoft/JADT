package jadt.core;

import jadt.layouts.*;
import jadt.layouts.GridBagLayout;
import jadt.templates.clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.security.InvalidParameterException;

public class Panel {
    private JPanel jPanel = new JPanel();
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
        jPanel.add(spinner.jSpinner);
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
        jPanel.add(slider.jSlider);
    }

    public void add(TextField textField) {
        jPanel.add(textField.jTextField);
    }

    public void add(ToggleSwitch toggleSwitch) {
        jPanel.add(toggleSwitch.jToggleButton);
    }

    public void add(Panel panel) {
        jPanel.add(panel.jPanel);
    }

    public void setLayout(jadt.layouts.FlowLayout flowLayout) {
        jPanel.setLayout(flowLayout.flowLayout);
    }

    public void setLayout(FreeFormLayout freeFormLayout) {
        jPanel.setLayout((LayoutManager) freeFormLayout.getLayout());
    }

    public void setLayout(BoxLayouts boxLayouts, Container pane, int AXIS) {
        jPanel.setLayout(boxLayouts.getBoxLayout(pane, AXIS));
        if (AXIS != BoxLayouts.X_AXIS && AXIS != BoxLayouts.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter Which is Invalid. Try To use'BoxLayouts.Y_AXIS' or 'BoxLayouts.X_AXIS'");
    }

    public void setLayout(jadt.layouts.CardLayout cardLayout) {
        jPanel.setLayout(cardLayout.cardLayout);
    }

    public void setLayout(GridBagLayout gridBagLayouts) {
        jPanel.setLayout(gridBagLayouts.getLayout());
    }

    public void setLayout(jadt.layouts.GridLayout gridLayouts) {
        jPanel.setLayout(gridLayouts.getLayout());
    }

    public void setLayout(jadt.layouts.SpringLayout springLayouts) {
        jPanel.setLayout(springLayouts.getLayout());
    }

}
