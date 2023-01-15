package jadt.core;

import com.formdev.flatlaf.util.SystemInfo;

public class MacOSScreenMenuBar {
    private MenuBar menuBar;
    private Window window;
    private String applicationName;
    private boolean stackTrace = true;
    public void addQuitHandler(){}
    public void removeQuitHandler(){}
    public void addAboutHandler(){}
    public void removeAboutHandler(){}

    public void add(Menu menu){
        menuBar.add(menu);
        enableScreenMenuBar();
    }
    public void remove(Menu menu)
    {
        menuBar.remove(menu);
    }
    public void setMenuBar(MenuBar menuBar) {
        this.menuBar = menuBar;
    }
    public void setWindow(Window window) {
        this.window = window;
    }
    public MacOSScreenMenuBar(MenuBar menuBar, Window mainWindow) {
        this.menuBar = menuBar;
        this.window = mainWindow;
    }
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    public void enableScreenMenuBar() {
        window.setMenuBar(this.menuBar);
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("apple.awt.application.name", this.applicationName);
        System.setProperty("apple.awt.application.appearance", "system");
        if (SystemInfo.isMacFullWindowContentSupported) {
            this.window.getComponent().getRootPane().putClientProperty("apple.awt.fullWindowContent", true);
            this.window.getComponent().getRootPane().putClientProperty("apple.awt.transparentTitleBar", true);
        }
    }
    public void disableScreenMenuBar(){
        if(System.getProperty("os.name").equals("Mac OS X")) {
            System.setProperty("apple.laf.useScreenMenuBar", "true");
            if (SystemInfo.isMacFullWindowContentSupported) {
                this.window.getComponent().getRootPane().putClientProperty("apple.awt.fullWindowContent", false);
                this.window.getComponent().getRootPane().putClientProperty("apple.awt.transparentTitleBar", false);
            }
        }
        else{
            if(stackTrace)System.err.println("The host operating system is not macOS");
        }
    }
    public void disableStackTrace(){
        this.stackTrace = false;
    }
    public void enableStackTrace(){
        this.stackTrace = true;
    }
    public MenuBar getMenuBarComponent(){
        return menuBar;
    }
    public Window getWindowComponent(){
        return window;
    }
    public String getApplicationName(){
        return applicationName;
    }

}
