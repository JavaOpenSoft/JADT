package jadt.core;

import javax.swing.*;

@SuppressWarnings("FieldMayBeFinal")
public class Slider {
    @SuppressWarnings("FieldMayBeFinal")
    private JSlider jSlider = new JSlider();
    public JSlider getComponent(){
        return jSlider;
    }
}
