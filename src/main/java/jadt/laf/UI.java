package jadt.laf;

import javax.swing.*;

public class UI {
    public static Object getCrossPlatformLAF() {
        return UIManager.getSystemLookAndFeelClassName();
    }
    public void setLAF(){}
}
