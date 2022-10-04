package jadt.core;

import javax.swing.*;

@SuppressWarnings({"deprecated", "DuplicateCondition"})

public class PasswordField {
    public final char DEFAULT_DISPLAY_CHARACTER = '\u25CF';
    private boolean isPasswordRevealed = false;
    private final JPasswordField jPasswordField = new JPasswordField();
    private final JTextField revealedPasswordField = new JTextField();
    private int positionX;
    private int positionY;
    private int sizeX;
    private int sizeY;
    private boolean highSecurityMode = false;

    public PasswordField(){

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
            jPasswordField.setText(revealedPasswordField.getText());
            revealedPasswordField.setText("");
            jPasswordField.setBounds(getSizeX(),getSizeY(), getPositionX(),getPositionY());
            jPasswordField.setVisible(true);
            revealedPasswordField.setVisible(false);
            this.isPasswordRevealed = isPasswordRevealed;
        }
        else //noinspection DuplicateCondition,ConstantConditions
            if(isPasswordRevealed){
            revealedPasswordField.setText(new String(jPasswordField.getPassword()));
            revealedPasswordField.setBounds(getSizeX(),getSizeY(), getPositionX(), getPositionX());
            jPasswordField.setText("");
            jPasswordField.setVisible(false);
            revealedPasswordField.setVisible(true);
                this.isPasswordRevealed = isPasswordRevealed;
        }
    }
    public void setSize(int SizeX, int sizeY)
    {
        jPasswordField.setSize(SizeX,sizeY);
        this.sizeX = SizeX;
        this.sizeY = sizeY;
    }
    public void setPosition(int positionX, int positionY)
    {
        jPasswordField.setBounds(positionX,positionY,sizeX,sizeY);
    }
    public void setText(String Text)
    {
        jPasswordField.setText(Text);
    }
    public void copy(){
        if(!highSecurityMode)jPasswordField.copy();
    }
    public void paste(){
        if(!highSecurityMode)jPasswordField.paste();
    }
    public void cut(){
        if(!highSecurityMode) {
            jPasswordField.cut();
            System.err.print("""
                    High Security mode for the password field is enabled, means that you cannot
                    1. copy
                    2. cut
                    3. paste
                    4. get Password as an String5. view passwords.""");
        }
        else throw new RuntimeException("");
    }
    public void editable(boolean isEditable){
        jPasswordField.setEditable(isEditable);
    }
    public void setHighSecurityMode(boolean highSecurityMode){
        this.highSecurityMode = highSecurityMode;
    }
    public void changeHiddenCharacter(char DisplayCharacter){
        jPasswordField.setEchoChar(DisplayCharacter);
    }
    public Object getText()
    {
        if(!new String(jPasswordField.getPassword()).isEmpty()){
            if(!isPasswordRevealed && highSecurityMode) return jPasswordField.getPassword();
            //noinspection DuplicateCondition
            if(!isPasswordRevealed)return new String(jPasswordField.getPassword());
            //noinspection ConstantConditions
            if(isPasswordRevealed)return revealedPasswordField.getText();
        }
        else if(new String(jPasswordField.getPassword()).isEmpty() && revealedPasswordField.getText().isEmpty())return "";
        return null;
    }
    public JPasswordField getComponent(){
        return jPasswordField;
    }
    public JTextField getRevealedComponent(){
        return revealedPasswordField;
    }
    public boolean isPasswordRevealed(){
        return isPasswordRevealed;
    }


}
