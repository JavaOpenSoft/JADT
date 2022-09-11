package jadt.core;

import javax.swing.*;

@SuppressWarnings("deprecated")

public class PasswordField {
    public final char DEFAULT_DISPLAY_CHARACTER = '\u25CF';
    private boolean isPasswordRevealed = false;
    private final JPasswordField jPasswordField = new JPasswordField();
    private final JTextField revealedPasswordField = new JTextField();
    private int PositionX,PositionY,SizeX,SizeY;
    private String Text;
    private boolean highSecurityMode = false;
    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public int getSizeX() {
        return SizeX;
    }

    public int getSizeY() {
        return SizeY;
    }
    public void setRevealed(boolean isPasswordRevealed){
        if (!isPasswordRevealed){
            jPasswordField.setText(revealedPasswordField.getText());
            revealedPasswordField.setText("");
            jPasswordField.setBounds(getSizeX(),getSizeY(),getPositionX(),getPositionY());
            jPasswordField.setVisible(true);
            revealedPasswordField.setVisible(false);
            this.isPasswordRevealed = isPasswordRevealed;
        }
        else if(isPasswordRevealed){
            revealedPasswordField.setText(jPasswordField.getText());
            revealedPasswordField.setBounds(getSizeX(),getSizeY(),getPositionX(),getPositionX());
            jPasswordField.setText("");
            jPasswordField.setVisible(false);
            revealedPasswordField.setVisible(true);
            this.isPasswordRevealed = isPasswordRevealed;
        }
    }
    public void setSize(int SizeX, int SizeY)
    {
        jPasswordField.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY)
    {
        jPasswordField.setBounds(PositionX,PositionY,SizeX,SizeY);
    }
    public void setText(String Text)
    {
        jPasswordField.setText(Text);
        this.Text = Text;
    }
    public void copy(){
        if(!highSecurityMode)jPasswordField.copy();
    }
    public void paste(){
        if(!highSecurityMode)jPasswordField.paste();
    }
    public void cut(){
        if(!highSecurityMode)jPasswordField.cut();
        else throw new RuntimeException("High Security mode for the password field is enabled, means that you cannot copy,cut,paste or view passwords.");
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
    public String getText()
    {
        String txt = null;
        if(Text.isEmpty()){

            if(!isPasswordRevealed)txt = jPasswordField.getText();
            if(isPasswordRevealed)txt = revealedPasswordField.getText();
        }
        else if(!Text.isEmpty())txt = Text;
        return txt;
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
