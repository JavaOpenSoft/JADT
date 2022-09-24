package jadt.core;

import javax.swing.*;

public class ToggleSwitch extends AppComponent{
    private JToggleButton jToggleButton = new JToggleButton();
    public JToggleButton getComponent(){
        return jToggleButton;
    }
    public void setState(boolean state){
        jToggleButton.setEnabled(state);
    }
}
