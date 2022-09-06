package juit.utils.CLI;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

public class RemoteFile {
    private String URL;
    public void DownloadFile(String URL){
        this.URL = URL;
    }
    public String getCurrentlyDownloadedFileURL(){
        return this.URL;
    }
}
