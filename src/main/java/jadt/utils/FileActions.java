package jadt.utils;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileActions {
    private File file;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;
    private String inPath,outPath;
    public FileActions(File file) throws IOException {
        this.file = file;
        this.bufferedReader = new BufferedReader(new FileReader(this.file));
        this.bufferedWriter = new BufferedWriter(new FileWriter(this.file));
    }
    public void copyContentsOfFileTo(File out)
    {
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            bufferedWriter = new BufferedWriter(new FileWriter(out));
            String data;
            while((data = bufferedReader.readLine()) != null)
            {
                bufferedWriter.write(data+"\n");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
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
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(this.file));
            bufferedWriter.write(input+"\n");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void write(){

    }
    public String read()
    {
        String ln = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(this.file));
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
    public  void setInPath(String inPath)
    {
        this.inPath = inPath;
    }
    public void setOutPath(String outPath)
    {
        this.outPath = outPath;
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
