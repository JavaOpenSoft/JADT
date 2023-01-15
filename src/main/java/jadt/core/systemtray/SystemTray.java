package jadt.core.systemtray;

import jadt.events.PropertyChangeEvent;

import java.awt.*;
import java.awt.TrayIcon;
import java.util.Objects;

public class SystemTray {
    private java.awt.SystemTray systemTray = java.awt.SystemTray.getSystemTray();
    private java.awt.TrayIcon tray;

    public java.awt.SystemTray Component() {
        return systemTray;
    }
    public void displaySystemNotification(String notificationTitle, String notificationText, TrayIcon.MessageType type){
        tray.displayMessage(notificationTitle, notificationText, type);
    }
    public void enableSystemTray(){
        systemTray = java.awt.SystemTray.getSystemTray();
    }
    public void disableSystemTray(){
        systemTray = null;
    }
    public void addPropertyEvent(PropertyChangeEvent event, String propertyName){
        systemTray.addPropertyChangeListener(propertyName,event);
    }
    public void removePropertyEvent(PropertyChangeEvent event, String propertyName){
        systemTray.removePropertyChangeListener(propertyName,event);
    }
    public void add(jadt.core.systemtray.TrayIcon icon) throws AWTException {
        systemTray.add(icon.getComponent());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SystemTray that)) return false;
        return Objects.equals(systemTray, that.systemTray) && Objects.equals(tray, that.tray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemTray, tray);
    }

    @Override
    public String toString() {
        return "SystemTray{" +
                "systemTray=" + systemTray +
                ", tray=" + tray +
                '}';
    }
}
