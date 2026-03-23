package jadt.core;

import jadt.core.icon.Icon;

import javax.swing.JOptionPane;
import java.awt.SystemTray;
import java.awt.TrayIcon;

public class Notification {
    public static int YES_OPTION = JOptionPane.YES_OPTION;
    public static int NO_OPTION = JOptionPane.NO_OPTION;
    public static int YES_NO_OPTION = JOptionPane.YES_NO_OPTION;
    public static int YES_NO_CANCEL_OPTION = JOptionPane.YES_NO_OPTION;
    public static int ERROR_NOTIFICATION = JOptionPane.ERROR_MESSAGE;
    public static int WARNING_NOTIFICATION = JOptionPane.WARNING_MESSAGE;
    public static int INFORMATION_NOTIFICATION = JOptionPane.INFORMATION_MESSAGE;
    public static int QUESTION_NOTIFICATION = JOptionPane.QUESTION_MESSAGE;
    private int messageType;
    private boolean isTrayNotification = false;
    private String title = "Message";
    private Icon icon = new Icon("");
    private SystemTray tray;
    private TrayIcon trayIcon = new TrayIcon(icon.getImage(),"");
    public void setTitle(String title) {
        this.title = title;
    }
    public void setIcon(String icon) {
        this.icon = new Icon(icon);
    }
    public void showErrorNotification(String message){
        if(isTrayNotification){
            tray = SystemTray.getSystemTray();
            trayIcon = new TrayIcon(icon.getImage(),"");
            trayIcon.setImageAutoSize(true);
        }
        else {
            JOptionPane.showMessageDialog(null, message, title, messageType, icon);
        }
    }
    public void shouldBeTrayNotification(boolean isTrayNotification){
        if(isTrayNotification){
            tray = SystemTray.getSystemTray();
        }
        this.isTrayNotification = isTrayNotification;
    }
    public void showWarningNotification(String message){}
    public void showInformationMessage(String message){}
    public void setMessageType(int messageType){}
    public String getTitle(){
        return title;
    }
    public void setHoverText(String hoverText){
        if(isTrayNotification){
            trayIcon.setToolTip(hoverText);
        }
    }
}
