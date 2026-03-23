package jadt.core;

import jadt.core.misc.DraggableComponent;
import jadt.events.*;
import jadt.graphics.Font;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("FieldMayBeFinal")
public class TextArea {
    @SuppressWarnings("FieldMayBeFinal")
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private DraggableComponent draggable;
    private JTextArea textArea = new JTextArea();
    private int positionX;
    private int positionY;
    private int sizeX;
    private int sizeY;
    public TextArea(){
        textArea.getInputMap().put(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, tk.getMenuShortcutKeyMaskEx()), "del2EoL");
        textArea.getActionMap().put("del2EoL", new Delete2EOL());
    }
    public JTextArea getComponent() {
        return textArea;
    }
    public void setText(String Text){
        this.textArea.setText(Text);
    }
    public void setSize(int sizeX, int sizeY) {
        this.textArea.setSize(sizeX, sizeY);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX, int positionY) {
        textArea.setBounds(positionX, positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void getCaretPosition(){

    }
    public void setBounds(int sizeX, int sizeY,int positionX, int positionY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.positionX = positionX;
        this.positionY = positionY;
        textArea.setBounds(positionX, positionY,sizeX,sizeY);
    }
    public void writeContentsToFile(File file) throws IOException {
        textArea.write(new FileWriter(file));
    }
    public void clear(){
        textArea.setText("");
    }
    public void enableLineWrap(){
        textArea.setLineWrap(true);
    }
    public void disableLineWrap() {
        textArea.setLineWrap(false);
    }
    public int getPositionX() {
        return positionX;
    }


    public int getPositionY() {
        return positionY;
    }


    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void addAncestorEvent(@NotNull  AncestorEvent event){textArea.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){textArea.removeAncestorListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){textArea.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){textArea.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){textArea.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){textArea.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){textArea.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){textArea.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){textArea.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){textArea.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){textArea.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){textArea.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){textArea.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){textArea.removeInputMethodListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){textArea.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){textArea.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){textArea.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){textArea.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){textArea.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){textArea.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){textArea.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){textArea.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){textArea.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){textArea.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggable = new DraggableComponent(textArea);
        }
        else if(!isDraggable){
            draggable.removeDraggingAbilities();
        }
    }

    public void setPreferredSize(int sizeX, int sizeY) { textArea.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { textArea.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { textArea.setMinimumSize(new Dimension(sizeX, sizeY)); }
    public void setFont(String FontName,String FontType,int size)
    {
        if(FontType.equals("Plain"))textArea.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))textArea.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))textArea.setFont(new Font(FontName, Font.ITALIC, size));
    }
    public String getFontName()
    {
        return textArea.getFont().getFamily();
    }
    public String getFontType()
    {
        return textArea.getFont().getFamily();
    }
    public int getFontSize()
    {
        return textArea.getFont().getSize();
    }
    public Font getFont() {
        return (Font) textArea.getFont();
    }
    private class Delete2EOL extends AbstractAction {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            int caretOffset = textArea.getCaretPosition();
            int lineNumber = 0;
            try {
                lineNumber = textArea.getLineOfOffset(caretOffset);
                int startOffset = textArea.getLineStartOffset(lineNumber);
                int endOffset = textArea.getLineEndOffset(lineNumber);
                textArea.replaceRange("", startOffset, endOffset);
            } catch (BadLocationException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
