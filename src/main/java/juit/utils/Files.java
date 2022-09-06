package juit.utils;
import java.io.File;

public class Files {
    File file;
    public Files(String pathOfFile,String NameOfFile)
    {
        pathOfFile = pathOfFile+"//"+NameOfFile;
        file = new File(pathOfFile);
    }
    public boolean doesFileExist(String path)
    {
        File file = new File(path);
        return file.exists();
    }
}
