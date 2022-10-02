package jadt.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenCapture {
    private Rectangle screenshotSize;
    private BufferedImage image;

    public void captureScreenshot(int x, int y) throws AWTException {
        screenshotSize = new Rectangle(x, y);
        image = new Robot().createScreenCapture(screenshotSize);

    }
    public void captureFullScreen() throws AWTException {
        screenshotSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        image = new Robot().createScreenCapture(screenshotSize);

    }
    public void captureScreenRecordings(){}
    public void getCapturedVideo(){}
    public void getScreenShot(){}
    public void saveScreenshot(String saveLocation,String fileFormat) throws IOException {
        ImageIO.write(image, fileFormat, new File(saveLocation));
    }
}
