package jadt.core.systemtray;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;

public class TrayIcon {
    private java.awt.TrayIcon trayIcon;
    private SystemTrayIcon icon = new SystemTrayIcon();
    public void add(TrayMenu trayMenu){}
    public static final java.awt.TrayIcon.MessageType error = java.awt.TrayIcon.MessageType.ERROR;
    public static final java.awt.TrayIcon.MessageType warning = java.awt.TrayIcon.MessageType.WARNING;
    public static final java.awt.TrayIcon.MessageType info = java.awt.TrayIcon.MessageType.INFO;
    public static final java.awt.TrayIcon.MessageType none = java.awt.TrayIcon.MessageType.NONE;
    private int imageSizeX =  32;
    private int imageSizeY = 32;
    public int getImageSizeX() {
        return imageSizeX;
    }

    public int getImageSizeY() {
        return imageSizeY;
    }
    private void setImageSize(int imageSizeX, int imageSizeY) {
        this.imageSizeX = imageSizeX;
        this.imageSizeY = imageSizeY;
    }
    public TrayIcon(String fileName, String name){
        icon.createImage(fileName, name, imageSizeX, imageSizeY);
    }

    public java.awt.TrayIcon getComponent() {
        return trayIcon;
    }

    public SystemTrayIcon getIcon(){
        return icon;
    }
}
class SystemTrayIcon{
    private Image image;
    private int sizeX;
    private int sizeY;
    private String file;
    private String name;
    public void createImage(String file, String name , int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.file = file;
        this.name = name;
        image = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return getSizeX();
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return getSizeY();
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        };
    }
    public File getFileClass(){
        return new File(file);
    }
    public String getFile() {
        return file;
    }

    public String getName() {
        return name;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public Image getImage(){
        return image;
    }
}