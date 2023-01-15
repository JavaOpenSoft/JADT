package jadt.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileUtils {
    private static File file;
    private static BufferedWriter bufferedWriter;
    private static BufferedReader bufferedReader;
    private static String inPath,outPath;
    private static String URL = "";
    private static URL url;
    public FileUtils() {
        url = null;
        file = null;
    }
    public FileUtils(URL Url) {
        this.url = Url;
    }
    public FileUtils(String File) {}
    public void downloadFile(String Url,String outputFileName) throws IOException {
        URL = Url;
        url = new URL(URL);
        try (InputStream in = url.openStream();
             ReadableByteChannel readableByteChannel = Channels.newChannel(in);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFileName)) {
            fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
        }

    }
    public String getCurrentURL(){
        return URL;
    }
    public URL getURLClass(){
        return url;
    }
    public int getFileSize(String URL) throws MalformedURLException {
        url = new URL(URL);
        URLConnection conn = null;
        try {
            conn = url.openConnection();
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
    public void listFiles(File file){
        String[] paths;
        paths = file.list();

        // for each name in the path array
        assert paths != null;
        for(String pathway:paths) {
            // prints filename and directory name
            System.out.println(pathway);
        }
    }
    public void listFiles(String path){
        File file = new File(path);
        String[] paths;
        paths = file.list();

        // for each name in the path array
        assert paths != null;
        for(String pathway:paths) {
            // prints filename and directory name
            System.out.println(pathway);
        }
    }

    public ArrayList<String> getFileListInArrayList(int amountOfFiles, String path)
    {
        ArrayList<String> result = new ArrayList<String>();
        String[] paths;
        File file = new File(path);
        paths = file.list();
        if (amountOfFiles >= 0) {
            assert paths != null;
            result.addAll(Arrays.asList(paths).subList(0, amountOfFiles - 1));
        }
        return result;
    }
    public  boolean isFilePresent(String path)
    {
        File f = new File(path);
        return f.exists();
    }
    public void copyContentsOfFileTo(File out) throws IOException {
        Files.copy(file.toPath(), out.toPath());
    }
    public void setFile(File file){
        this.file = file;
    }
    public String[] getContentsOfFile() throws IOException {
        bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<String> contents = new ArrayList<>();
        Scanner sc = new Scanner(file);
        int count = 0;
        while(sc.hasNextLine()) {
            sc.nextLine();
            count++;
        }
        String[] str = new String[count];
        while(bufferedReader.readLine() != null){
            contents.add(bufferedReader.readLine());
        }
        return contents.toArray(str);
    }
    public void deleteFile(File file){
        boolean temp = file.delete();
    }
    public boolean doesExist(File file){
        return file.exists();
    }
    public void renameFile(File file, String name){
        boolean temp = file.renameTo(new File(name));
    }

    public void createFolder(String FolderName,String path)
    {
        File theDir;
        if(SoftwareInfo.getOS().equals("Windows"))theDir = new File(path+"\\"+FolderName);
        else theDir = new File(path+"/"+FolderName);
        if (!theDir.exists()){
            boolean temp = theDir.mkdir();
        }
    }
    public void writeln(String input)
    {
        if(bufferedReader == null) {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {

            bufferedWriter.write(input+"\n");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void write(String input){
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(input+"\n");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public String read()
    {
        String ln = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            ln = bufferedReader.readLine();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ln;
    }
    public String getTextFromLine(String pathOfFile, int lineNumber) throws IOException {
        String[] lines = getContentsOfFile();
        return lines[lineNumber-1];
    }
    public  void setInPath(String path)
    {
        inPath = path;
    }
    public void setOutPath(String path)
    {
        outPath = path;
    }
    public String getInPath()
    {
        return inPath;
    }
    public String getOutPath()
    {
        return outPath;
    }
    public long getFileSizeInBits() {
        return file.length() * 8;
    }

    public long getFileSizeInBytes() {
        return file.length();
    }

    public long getFileSizeInKilobytes() {
        return file.length() / 1024;
    }
    public long getFileSizeInMegabytes() {
        return (long) (file.length() / Math.pow(1024, 2));
    }

    public long getFileSizeInGigabytes() {
        return (long) (file.length() / Math.pow(1024, 3));
    }
}
