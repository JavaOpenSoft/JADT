package jadt.utils;

import jadt.utils.cli.Console;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
public class Decompressor {
    private File archiveFile;
    public File getArchiveFile() {
        return archiveFile;
    }
    public void decompressZIP(String zipFilePath, String destDir){
        boolean temp;
        File dir = new File(destDir);
        // create output directory if it doesn't exist
        if(!dir.exists()) temp = dir.mkdirs();
        FileInputStream fis;
        //buffer for read and write data to file
        byte[] buffer = new byte[1024];
        try {
            fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while(ze != null){
                String fileName = ze.getName();
                File newFile = new File(destDir + File.separator + fileName);
                System.out.println("Unzipping to "+newFile.getAbsolutePath());
                //create directories for sub directories in zip
                temp = new File(newFile.getParent()).mkdirs();
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
                //close this ZipEntry
                zis.closeEntry();
                ze = zis.getNextEntry();
            }
            //close last ZipEntry
            zis.closeEntry();
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void decompressJAR(String jarFilePath, String destDir) throws IOException {
        Console.run("jar -xf "+ jarFilePath + " " + destDir);
    }
    public void decompressTAR(){

    }
    public void decompressRAR(){

    }
    public void decompressXZ(){

    }
    public void decompressGZ(){

    }
    public void decompressBZIP2(){

    }
    public void decompressLZOP(){}
    public void decompressDEB(){}
    public void decompressRPM(){}
    public void decompressPKG(){}
    public void decompressEXE(){}
    public void decompressISO(){}
    public void decompressDMG(){}
}
