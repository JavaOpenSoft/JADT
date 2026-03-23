package jadt.laf;

import javax.swing.*;

public class UI {
    private static volatile boolean defaultsInitialized = false;

    public static String getCrossPlatformLAF() {
        return UIManager.getCrossPlatformLookAndFeelClassName();
    }

    public static String getSystemLAF() {
        return UIManager.getSystemLookAndFeelClassName();
    }

    public static synchronized void bootstrapDefaults() {
        if (defaultsInitialized) {
            return;
        }

        if (isMacOS()) {
            System.setProperty("apple.laf.useScreenMenuBar", "true");
            System.setProperty("apple.awt.application.appearance", "system");
        }

        String systemLookAndFeel = getSystemLAF();
        String currentLookAndFeel = UIManager.getLookAndFeel() == null ? null : UIManager.getLookAndFeel().getClass().getName();
        if (systemLookAndFeel != null && !systemLookAndFeel.equals(currentLookAndFeel)) {
            try {
                UIManager.setLookAndFeel(systemLookAndFeel);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                throw new RuntimeException(e);
            }
        }

        defaultsInitialized = true;
    }

    public static boolean isMacOS() {
        String osName = System.getProperty("os.name", "");
        return osName.startsWith("Mac");
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
    public static void createLAF(String name){
        try {
            UIManager.createLookAndFeel(name);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }

}
