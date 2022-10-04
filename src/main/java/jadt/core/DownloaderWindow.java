package jadt.core;

import jadt.utils.FileTransfer;
import jadt.utils.thread.MultiThreader;
import jadt.utils.thread.ThreadTask;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

@SuppressWarnings("FieldMayBeFinal")
public class DownloaderWindow extends Window{
    @SuppressWarnings("FieldMayBeFinal")
    private JProgressBar progressBar = new JProgressBar();
    @SuppressWarnings("FieldMayBeFinal")
    private FileTransfer fileTransfer = new FileTransfer();
    @SuppressWarnings("FieldMayBeFinal")
    private MultiThreader multiThreader = new MultiThreader();
    private String urlString;
    /**
     * @param minimum The minimum value of the download progress bar
     * @param maximum The maximum value of the download progress bar**/
    public DownloaderWindow(int minimum,int maximum) throws MalformedURLException {
        progressBar.setMaximum(maximum);
        progressBar.setMinimum(minimum);
    }
    public JProgressBar getProgressBarComponent(){
        return progressBar;
    }
    public FileTransfer getFileTransferComponent(){
        return fileTransfer;
    }
    public int getMaximum() {
        return progressBar.getMaximum();
    }
    public int getMinimum() {
        return progressBar.getMinimum();
    }
    public void setMaximum(int maximum) {
        progressBar.setMaximum(maximum);
    }
    public void setMinimum(int minimum) {
        progressBar.setMinimum(minimum);
    }
    public void setURL(String URL) throws MalformedURLException {
        this.urlString = URL;
    }
    public String getURL() {
        return urlString;
    }
    public void startDownload(String outputFileName) throws IOException {
        multiThreader.addTask(new ThreadTask() {
            @Override
            public void run() {
                try {
                    fileTransfer.downloadFile(urlString,outputFileName);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        multiThreader.addTask(new ThreadTask() {
            @Override
            public void run() {
                File file = new File(outputFileName);
                while(true){
                    try {
                        if (fileTransfer.getFileSize(urlString) == file.length()) break;
                        progressBar.setValue((int)file.length());
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        multiThreader.startAllTasks();
    }

}
