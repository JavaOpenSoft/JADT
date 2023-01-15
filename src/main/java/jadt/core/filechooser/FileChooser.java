package jadt.core.filechooser;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileView;
import java.io.File;

@SuppressWarnings("FieldMayBeFinal")
public class FileChooser {
    public static final int OPEN_DIALOG = 0;
    public static final int SAVE_DIALOG = 1;
    public static final int CUSTOM_DIALOG = 2;
    public static final int CANCEL_OPTION = 1;
    public static final int APPROVE_OPTION = 0;
    public static final int ERROR_OPTION = -1;

    @SuppressWarnings("FieldMayBeFinal")
    private JFileChooser jFileChooser = new JFileChooser();
    public JFileChooser getFileChooser() {
        return jFileChooser;
    }
    public int showSaveFileDialog(){
        return jFileChooser.showSaveDialog(null);
    }
    public int showOpenFileDialog(){return jFileChooser.showOpenDialog(null);}
    public JFileChooser getComponent() {return jFileChooser;}
    public void addFileFilter(jadt.core.filechooser.FileFilter fileFilter) {
        jFileChooser.addChoosableFileFilter(fileFilter);
    }
    public void removeFileFilter(jadt.core.filechooser.FileFilter fileFilter) {
        jFileChooser.removeChoosableFileFilter(fileFilter);
    }
    public void setFileViewToSystemView(){
        jFileChooser.setFileView(new FileView(){
            @Override
            public Icon getIcon(File f)
            {
                return FileSystemView.getFileSystemView().getSystemIcon(f);
            }
        });
    }
    public void canSelectOnlyDirectories(){
        jFileChooser.setFileSelectionMode(1);
    }
    public void canSelectOnlyFiles(){
        jFileChooser.setFileSelectionMode(0);
    }
    public void canSelectBothFilesAndDirectories() {
        jFileChooser.setFileSelectionMode(2);
    }
}
