package jadt.core.filechooser;

import javax.swing.*;
import java.awt.*;

public class SystemFileChooser {
    private FileDialog dialog = new FileDialog((Frame) null);

    public FileDialog getComponent(){
        return dialog;
    }

}
