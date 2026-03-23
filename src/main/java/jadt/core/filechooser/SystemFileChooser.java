package jadt.core.filechooser;

import javax.swing.*;
import java.awt.*;

public class SystemFileChooser {
    private static FileDialog dialog = new FileDialog((Frame) null);

    public FileDialog getComponent(){
        return dialog;
    }

    public static void main(String[] args) {
        dialog.getFile();
    }
}
