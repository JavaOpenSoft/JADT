package jadt.Core;

import javax.swing.*;

public class FileChooser {
    JFileChooser jFileChooser = new JFileChooser();
    public JFileChooser getFileChooser() {
        return jFileChooser;
    }
    public int showSaveFileDialog(){
        return jFileChooser.showSaveDialog(null);
    }
}
