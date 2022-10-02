package jadt.core.filechooser;

import java.io.File;

public class FileFilter extends javax.swing.filechooser.FileFilter{
    @Override
    public boolean accept(File f) {
        return false;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
