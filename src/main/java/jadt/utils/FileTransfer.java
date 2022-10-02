package jadt.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.net.URL;
public class FileTransfer {
    private String URL = "";
    private URL url = new URL(this.URL);

    public FileTransfer() throws MalformedURLException {
    }

    public void downloadFile(String URL,String outputFileName) throws IOException {
        this.URL = URL;
        url = new URL(this.URL);
        try (InputStream in = url.openStream();
             ReadableByteChannel readableByteChannel = Channels.newChannel(in);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFileName)) {
            fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
        }
    }
    public String getCurrentURL(){
        return this.URL;
    }
    public URL getURLClass(){
        return this.url;
    }
    public int getFileSize(String url) throws MalformedURLException {
        this.url = new URL(url);
        URLConnection conn = null;
        try {
            conn = this.url.openConnection();
            if (conn instanceof HttpURLConnection) {
                ((HttpURLConnection) conn).setRequestMethod("HEAD");
            }
            conn.getInputStream();
            return conn.getContentLength();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn instanceof HttpURLConnection) {
                ((HttpURLConnection) conn).disconnect();
            }
        }
    }
}
