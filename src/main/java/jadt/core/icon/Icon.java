package jadt.core.icon;

import jadt.graphics.NativeImage;

import javax.swing.*;
import java.awt.*;

public class Icon extends ImageIcon {
    private int height = -1;
    private int width = -1;
    private String iconPath;
    private NativeImage nativeImage;

    public Icon(int width, int height){
        this.width = width;
        this.height = height;
    }
    public Icon(String iconPath, int width, int height){
        this.iconPath = iconPath;
        this.width = width;
        this.height = height;
        reloadFromPath();
    }
    public Icon(String iconPath)
    {
        this.iconPath = iconPath;
        reloadFromPath();
    }

    public Icon(Image image) {
        setNativeImage(NativeImage.fromImage(image));
    }

    public Icon(NativeImage nativeImage) {
        setNativeImage(nativeImage);
    }
    public int getHeight() {
        return height > 0 ? height : getIconHeight();
    }

    public void setHeight(int height) {
        this.height = height;
        refreshScaledImage();
    }

    public String getIconPath() {
        return iconPath;
    }
    public ImageIcon getIcon(){
        return this;
    }

    public void setIcon(String iconPath) {
        this.iconPath = iconPath;
        reloadFromPath();
    }

    public int getWidth() {
        return width > 0 ? width : getIconWidth();
    }

    public void setWidth(int width) {
        this.width = width;
        refreshScaledImage();
    }

    public NativeImage getNativeImage() {
        if (nativeImage == null && iconPath != null && !iconPath.isBlank()) {
            reloadFromPath();
        }
        return nativeImage;
    }

    public void setNativeImage(NativeImage nativeImage) {
        this.nativeImage = nativeImage;
        this.iconPath = nativeImage.getSource();
        refreshScaledImage();
    }

    private void reloadFromPath() {
        if (iconPath == null || iconPath.isBlank()) {
            nativeImage = null;
            setImage(null);
            return;
        }
        nativeImage = NativeImage.fromPath(iconPath);
        refreshScaledImage();
    }

    private void refreshScaledImage() {
        if (nativeImage == null) {
            setImage(null);
            return;
        }
        NativeImage imageToUse = nativeImage;
        if (width > 0 && height > 0) {
            imageToUse = nativeImage.scaled(width, height);
        }
        super.setImage(imageToUse.getImage());
    }
}
