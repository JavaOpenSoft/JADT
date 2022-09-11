package jadt.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileLister {
    public static void listFiles(String path){
        File file = new File(path);
        String[] paths;
        paths = file.list();

        // for each name in the path array
        assert paths != null;
        for(String pathway:paths) {
            // prints filename and directory name
            System.out.println(path);
        }
    }
    public void getListInArray(String[] array ,int amountOfFiles,String path)
    {

        String[] paths;
        File file = new File(path);
        paths = file.list();
        if (amountOfFiles>= 0) {
            assert paths != null;
            System.arraycopy(paths, 0, array, 0, amountOfFiles - 1);
        }

    }
    public void getFileListInArrayList(ArrayList<String> arrayList,int amountOfFiles,String path)
    {
        String[] paths;
        File file = new File(path);
        paths = file.list();
        if (amountOfFiles >= 0) {
            assert paths != null;
            arrayList.addAll(Arrays.asList(paths).subList(0, amountOfFiles - 1));
        }
    }
    public  boolean isFilePresent(String path)
    {
        File f = new File(path);
        return f.exists();
    }
}
