package jadt.Core;
import javax.swing.*;
import java.awt.*;

import static java.util.Objects.*;

@SuppressWarnings({"ALL", "SpellCheckingInspection"})
public class WarningNotification {


    private short x = 600;
    private short y = 175;
    @SuppressWarnings("unused")
    final public int IMAGE_SIZEY =  92;
    @SuppressWarnings("unused")
    final public int IMAGE_SIZEX =  84;

    JLabel IconImage = new JLabel("");
    JFrame frame = new JFrame("Warning!");
    JButton ok = new JButton("Ok");
    @SuppressWarnings("unused")
    String temp = ok.getText();
    JButton cancel = new JButton();
    @SuppressWarnings("unused")
    JLabel WarningText;
    @SuppressWarnings("unused")
    public void SetWarningText(String displayText)
    {
        var WarningText = new JLabel(displayText);
        WarningText.setBounds(102, 17, 492, 113);
        frame.getContentPane().add(WarningText);
    }
    @SuppressWarnings("unused")
    public void SetIcon(String filePathWithName) {
        IconImage.setIcon(new ImageIcon(requireNonNull(WarningNotification.class.getResource(filePathWithName))));
    }
    @SuppressWarnings({"SuspiciousNameCombination", "unused"})
    public void setSizeOfText(short x, short y) {
        WarningText.setSize(y, x);
    }
    @SuppressWarnings("unused")
    public void setTitle(String Title)
    {
        WarningText.setName(Title);
    }
    @SuppressWarnings("unused")
    public void setDefaults()
    {
        frame.setBounds(100, 100, 600, 175);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String pathOfFile = "juit/resources/warning.png";
        Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
        frame.setIconImage(icon);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(null);
        IconImage.setIcon(new ImageIcon(requireNonNull(WarningNotification.class.getResource(pathOfFile))));
        IconImage.setBounds(6, 23, 84, 92);
        frame.getContentPane().add(IconImage);
        ok.setBounds(0,0,580,165);
        frame.getContentPane().add(ok);
    }
    @SuppressWarnings("unused")
    public void setBackgroundColor(Color color)
    {
        frame.setBackground(color);
    }
    @SuppressWarnings("unused")
    public void setFont(String FontName, String FontType, short size)
    {
        if(FontType.equals("Plain"))WarningText.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))WarningText.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))WarningText.setFont(new Font(FontName, Font.ITALIC, size));

    }
    @SuppressWarnings("unused")
    public void setTitleIcon(String pathOfFile)
    {
        Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
        frame.setIconImage(icon);
    }
    @SuppressWarnings("unused")
    public void setButtonMessage(String buttonMessage)
    {
        ok.setText(buttonMessage);
    }
    @SuppressWarnings("unused")
    public void setButtonSize(Dimension dim)
    {
        ok.setPreferredSize(dim);
    }
    @SuppressWarnings("unused")
    public void setPositionOfOkButton(short x, short y)
    {
        ok.setLocation(x,y);
    }
    @SuppressWarnings("unused")
    public void setPositionOfCancelButton(short x, short y)
    {
        cancel.setLocation(x,y);
    }
    @SuppressWarnings("unused")
    public void setSizeOfWindow(short x, short y)
    {
        this.x = x;
        this.y = y;
        frame.setSize(this.x,this.y);
    }
    @SuppressWarnings("unused")
    public short getXOfWindow()
    {
        return x;
    }
    @SuppressWarnings("unused")
    public short getYOfWindow()
    {
        return y;
    }
    @SuppressWarnings("unused")
    public short getYOfOkButton()
    {
        return (short) 175;
    }
    @SuppressWarnings("unused")
    public short getXOfOkButton()
    {
        return (short) 600;
    }
    @SuppressWarnings("unused")
    public short getYOfCancelOkButton()
    {
        return (short) 175;
    }
    @SuppressWarnings("unused")
    public short getXOfCancelButton()
    {
        return (short) 600;
    }
    @SuppressWarnings("unused")
    public void AddCancelButton()
    {
        cancel.setBounds(100, 100, 590, 175);
        frame.add(cancel);

    }
    @SuppressWarnings("unused")
    public void setButtonOkFont(String FontName, String FontType, short size)
    {
        if(FontType.equals("Plain"))ok.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))ok.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))ok.setFont(new Font(FontName, Font.ITALIC, size));
    }
    @SuppressWarnings("unused")
    public void setButtonCancelFont(String FontName, String FontType, short size)
    {
        if(FontType.equals("Plain"))cancel.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))cancel.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))cancel.setFont(new Font(FontName, Font.ITALIC, size));
    }

    @SuppressWarnings("unused")
    public void trimTextOfCancelButton()
    {
        String temp =cancel.getText().trim();
        cancel.setText(temp);
    }
    public void trimTextOfOkButton()
    {
        String temp =ok.getText().trim();
        ok.setText(temp);
    }
}
