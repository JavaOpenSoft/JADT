package jadt.laf;

import javax.swing.*;

public class UI {
    public static Object getCrossPlatformLAF() {
        return UIManager.getSystemLookAndFeelClassName();
    }
    public static void setLAF(LookAndFeel laf){
        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }
    public static void installLAF(String name, String className){
        UIManager.installLookAndFeel(name, className);
    }

}
