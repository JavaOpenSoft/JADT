package jadt.resources;

import jadt.graphics.NativeImage;

import java.awt.Image;

public class DefaultImages {
    public Image ErrorImage = NativeImage.fromPath("/jadt/resources/error.png").getImage();
    public Image SuccessImage = NativeImage.fromPath("/jadt/resources/success.png").getImage();
    public Image WarningImage = NativeImage.fromPath("/jadt/resources/error.png").getImage();
    public Image AboutImage = NativeImage.fromPath("/jadt/resources/About.png").getImage();
}
