package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import jadt.core.misc.Shape;
import org.jetbrains.annotations.NotNull;
import jadt.events.*;

import javax.swing.*;
import java.awt.Dimension;

@SuppressWarnings({"deprecated", "DuplicateCondition"})

public class PasswordField extends JADTComponent {
    public final char DEFAULT_DISPLAY_CHARACTER = '\u25CF';
    private boolean isPasswordRevealed = false;
    private final JPasswordField passwordField = new JPasswordField();
    private final JTextField revealedPasswordField = new JTextField();
    private int positionX = 0;
    private int positionY = 0;
    private int sizeX = 100;
    private int sizeY = 30;
    private boolean highSecurityMode = false;
    private DraggableComponent draggable;
    public PasswordField(){
        passwordField.setBounds(positionX, positionY, sizeX, sizeY);
        show();
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
    public void setRevealed(boolean isPasswordRevealed){
        //noinspection DuplicateCondition
        if (!isPasswordRevealed){
            passwordField.setText(revealedPasswordField.getText());
            revealedPasswordField.setText("");
            passwordField.setBounds(getSizeX(),getSizeY(), getPositionX(),getPositionY());
            passwordField.setVisible(true);
            revealedPasswordField.setVisible(false);
            this.isPasswordRevealed = isPasswordRevealed;
        }
        else //noinspection DuplicateCondition,ConstantConditions
            if(isPasswordRevealed){
            revealedPasswordField.setText(new String(passwordField.getPassword()));
            revealedPasswordField.setBounds(getSizeX(),getSizeY(), getPositionX(), getPositionX());
            passwordField.setText("");
            passwordField.setVisible(false);
            revealedPasswordField.setVisible(true);
                this.isPasswordRevealed = isPasswordRevealed;
        }
    }
    public void setSize(int SizeX, int sizeY)
    {
        passwordField.setSize(SizeX,sizeY);
        this.sizeX = SizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX, int positionY)
    {
        passwordField.setBounds(positionX,positionY,sizeX,sizeY);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setText(String Text)
    {
        passwordField.setText(Text);
    }
    public void copy(){
        if(!highSecurityMode) passwordField.copy();
        else{
            System.err.print("""
                        High Security mode for the password field is enabled, means that you cannot 
                        1. copy 
                        2. cut 
                        3. paste 
                        4. get Password as an String5. view passwords.""");
        }
    }
    public void paste(){
        if(!highSecurityMode) passwordField.paste();
        else{
            System.err.print("""
                        High Security mode for the password field is enabled, means that you cannot 
                        1. copy 
                        2. cut 
                        3. paste 
                        4. get Password as an String5. view passwords.""");
        }
    }
    public void cut(){
        if(!highSecurityMode)
            passwordField.cut();
        else{
            System.err.print("""
                        High Security mode for the password field is enabled, means that you cannot 
                        1. copy 
                        2. cut 
                        3. paste 
                        4. get Password as an String5. view passwords.""");
        }
    }
    public void editable(boolean isEditable){
        passwordField.setEditable(isEditable);
    }
    public void setHighSecurityMode(boolean highSecurityMode){
        this.highSecurityMode = highSecurityMode;
    }
    public void changeHiddenCharacter(char DisplayCharacter){
        passwordField.setEchoChar(DisplayCharacter);
    }
    public Object getText()
    {
        if(!new String(passwordField.getPassword()).isEmpty()){
            if(!isPasswordRevealed)return new String(passwordField.getPassword());
            if(isPasswordRevealed)return revealedPasswordField.getText();
        }
        else if(new String(passwordField.getPassword()).isEmpty() && revealedPasswordField.getText().isEmpty())return "";
        return null;
    }
    public JComponent getComponent(){
        if(!isPasswordRevealed)return passwordField;
        else return revealedPasswordField;
    }
    public JTextField getRevealedComponent(){
        return revealedPasswordField;
    }
    public boolean isPasswordRevealed(){
        return isPasswordRevealed;
    }
    public void addActionEvent(@NotNull ActionEvent event)
    {
        passwordField.addActionListener(event);
    }
    public void removeActionEvent(@NotNull ActionEvent event){passwordField.removeActionListener(event);}

    public void addAncestorEvent(@NotNull AncestorEvent event){passwordField.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){passwordField.removeAncestorListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){passwordField.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){passwordField.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){passwordField.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){passwordField.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){passwordField.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){passwordField.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){passwordField.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){passwordField.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){passwordField.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){passwordField.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){passwordField.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){passwordField.removeInputMethodListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){passwordField.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){passwordField.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){passwordField.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){passwordField.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){passwordField.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){passwordField.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){passwordField.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){passwordField.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){passwordField.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){passwordField.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggable = new DraggableComponent(passwordField);
        }
        else if(!isDraggable){
            draggable.removeDraggingAbilities();
        }
    }
    public void setPreferredSize(int sizeX, int sizeY) { passwordField.setPreferredSize(new Dimension(sizeX,sizeY)); }
    public void setMaximumSize(int sizeX, int sizeY) { passwordField.setMaximumSize(new Dimension(sizeX, sizeY)); }
    public void setMinimumSize(int sizeX, int sizeY) { passwordField.setMinimumSize(new Dimension(sizeX, sizeY)); }
    public void setShape(Shape shape){
        passwordField.setMixingCutoutShape(shape);
    }
    public void show(){passwordField.setVisible(true);}
    public void hide(){passwordField.setVisible(false);}
}
