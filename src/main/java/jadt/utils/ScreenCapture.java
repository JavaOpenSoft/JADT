package jadt.utils;

import jadt.utils.thread.MultiThreader;
import jadt.utils.thread.ThreadTask;

import javax.imageio.ImageIO;
import java.awt.Rectangle;
import java.awt.Image;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ScreenCapture {
    private Rectangle screenshotSize;
    private Image image;
    private MultiThreader multiThreader = new MultiThreader();
    private ArrayList<Image> videoFrames = new ArrayList<Image >();
    private boolean isRecording = false;
    private ThreadTask recorder = new ThreadTask() {
        @Override
        public void run() {
            isRecording = true;
            while(isRecording){
                videoFrames.add(getScreenShot());
            }
        }
    };
    public void captureScreenshot(int x, int y) throws AWTException {
        screenshotSize = new Rectangle(x, y);
        image = new Robot().createScreenCapture(screenshotSize);

    }
    public void captureFullScreen() throws AWTException {
        screenshotSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        image = new Robot().createScreenCapture(screenshotSize);
    }
    public void startScreenRecordings(){
        multiThreader.addTask(recorder);
        multiThreader.startAllTasks();
    }
    public void stopScreenRecordings(){
        isRecording = false;
        multiThreader.removeTask(0);
    }
    public ArrayList<Image> getCapturedVideo(){
        return videoFrames;
    }
    public Image getScreenShot(){
        return image;
    }
    public void saveScreenshot(String saveLocation,String fileFormat) throws IOException {
        ImageIO.write((BufferedImage)image, fileFormat, new File(saveLocation));
    }
    public void writeVideo(String saveLocation,String fileFormat){

    }
    public void writeVideoAsImage(String saveLocation,String fileFormat) throws IOException {
        for(Image image : videoFrames) ImageIO.write((BufferedImage)image, fileFormat, new File(saveLocation));
    }
}
