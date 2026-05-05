package jadt.core;

import com.formdev.flatlaf.util.SystemInfo;

import javax.swing.*;
import java.awt.Desktop;
import java.awt.desktop.*;

public class MacOSMenuBar {
    private MenuBar menuBar;
    private Window window;
    private String applicationName;
    private boolean stackTrace = true;

    private QuitHandler quitHandler;
    private AboutHandler aboutHandler;

    public void addQuitHandler(QuitHandler quitHandler) {
        if (!SystemInfo.isMacOS || !Desktop.isDesktopSupported()) return;

        this.quitHandler = quitHandler;
        Desktop.getDesktop().setQuitHandler(this.quitHandler);
    }

    public void removeQuitHandler() {
        if (!SystemInfo.isMacOS || !Desktop.isDesktopSupported()) return;

        Desktop.getDesktop().setQuitHandler(null);
        this.quitHandler = null;
    }

    public void addAboutHandler(AboutHandler aboutHandler) {
        if (!SystemInfo.isMacOS || !Desktop.isDesktopSupported()) return;

        this.aboutHandler = aboutHandler;
        Desktop.getDesktop().setAboutHandler(this.aboutHandler);
    }

    public void removeAboutHandler() {
        if (!SystemInfo.isMacOS || !Desktop.isDesktopSupported()) return;

        Desktop.getDesktop().setAboutHandler(null);
        this.aboutHandler = null;
    }

    public void add(Menu menu) {
        menuBar.add(menu);
        enableScreenMenuBar();
    }

    public void remove(Menu menu) {
        menuBar.remove(menu);
    }

    public void setMenuBar(MenuBar menuBar) {
        this.menuBar = menuBar;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public MacOSMenuBar(MenuBar menuBar, Window mainWindow) {
        this.menuBar = menuBar;
        this.window = mainWindow;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public void enableScreenMenuBar() {
        if (!SystemInfo.isMacOS) {
            if (stackTrace) System.err.println("The host operating system is not macOS");
            return;
        }

        System.setProperty("apple.laf.useScreenMenuBar", "true");

        if (applicationName != null) {
            System.setProperty("apple.awt.application.name", applicationName);
        }

        System.setProperty("apple.awt.application.appearance", "system");

        window.setMenuBar(menuBar);

        if (SystemInfo.isMacFullWindowContentSupported) {
            window.getComponent().getRootPane().putClientProperty("apple.awt.fullWindowContent", true);
            window.getComponent().getRootPane().putClientProperty("apple.awt.transparentTitleBar", true);
        }
    }

    public void disableScreenMenuBar() {
        if (!SystemInfo.isMacOS) {
            if (stackTrace) System.err.println("The host operating system is not macOS");
            return;
        }

        System.setProperty("apple.laf.useScreenMenuBar", "false");
        window.getComponent().setJMenuBar(null);

        if (SystemInfo.isMacFullWindowContentSupported) {
            window.getComponent().getRootPane().putClientProperty("apple.awt.fullWindowContent", false);
            window.getComponent().getRootPane().putClientProperty("apple.awt.transparentTitleBar", false);
        }
    }

    public void disableStackTrace() {
        this.stackTrace = false;
    }

    public void enableStackTrace() {
        this.stackTrace = true;
    }

    public MenuBar getMenuBarComponent() {
        return menuBar;
    }

    public Window getWindowComponent() {
        return window;
    }

    public String getApplicationName() {
        return applicationName;
    }
}