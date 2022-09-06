package juit.utils;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;
    String inPath,outPath;
    public void copyContentsOfFile(File in,File out)
    {
        try {
            bufferedReader = new BufferedReader(new FileReader(in.getPath()));
            bufferedWriter = new BufferedWriter(new FileWriter(out.getPath()));
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
    
    public String[] getContentsOfFile(juit.utils.Files file) throws IOException {
        bufferedReader = new BufferedReader(new FileReader(file.file));
        ArrayList<String> contents = new ArrayList<String>();
        Scanner sc = new Scanner(file.file);
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
    public void deleteFile(juit.utils.Files file) throws IOException{
        file.file.delete();
    }
    public void doesExist(juit.utils.Files file) throws IOException{
        file.file.exists();
    }
    public void renameFile(juit.utils.Files file, String name) throws IOException{
        file.file.renameTo(new File(name));
    }

    public void createFolder(String FolderName,String path)
    {
        String temp = path+"\\"+FolderName;
        File theDir = new File(temp);
        if (!theDir.exists()){
            theDir.mkdirs();
        }
    }
    public void write(String input,String pathOfFile)
    {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(pathOfFile));
            bufferedWriter.write(input+"\n");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void read(String pathOfFile)
    {
        try {
            bufferedReader = new BufferedReader(new FileReader(pathOfFile));
            String ln = bufferedReader.readLine(); 
        }
        catch (Exception e){
            e.printStackTrace();
        }
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

}
