package jadt.core;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

@SuppressWarnings("ALL")
public class QuestionNotification {


    private short x = 600;
    private short y = 175;
    final public int IMAGE_sizeY =  92;
    final public int IMAGE_sizeX =  84;

    JLabel IconImage = new JLabel("");
    JFrame frame = new JFrame("Question!");
    JButton yes = new JButton("yes");
    JButton no = new JButton();
    String temp = yes.getText();
    JLabel QuestionText;
    public void SetQuestionText(String displayText)
    {
        var QuestionText = new JLabel(displayText);
        QuestionText.setBounds(102, 17, 492, 113);
        frame.add(QuestionText);
    }
    public void SetIcon(String filePathWithName) {
        IconImage.setIcon(new ImageIcon(Objects.requireNonNull(QuestionNotification.class.getResource(filePathWithName))));
    }
    @SuppressWarnings("SuspiciousNameCombination")
    public void setSizeOfText(short x, short y) {
        QuestionText.setSize(y, x);
    }
    public void setTitle(String Title)
    {
        QuestionText.setName(Title);
    }
    public void setDefaults()
    {
        frame.setBounds(100, 100, 600, 175);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String pathOfFile = "juit/resources/warning.png";
        Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
        frame.setIconImage(icon);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        IconImage.setIcon(new ImageIcon(Objects.requireNonNull(QuestionNotification.class.getResource(pathOfFile))));
        IconImage.setBounds(6, 23, 84, 92);
        frame.add(IconImage);
        yes.setBounds(0,0,580,165);
        frame.add(yes);
    }
    public void setBackgroundColor(Color color)
    {
        frame.setBackground(color);
    }
    public void setFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))QuestionText.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))QuestionText.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))QuestionText.setFont(new Font(FontName, Font.ITALIC, size));

    }
    public void setTitleIcon(String pathOfFile)
    {
        Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
        frame.setIconImage(icon);
    }
    public void setButtonMessage(String buttonMessage)
    {
        yes.setText(buttonMessage);
    }
    public void setButtonSize(Dimension dim)
    {
        yes.setPreferredSize(dim);
    }
    public void setPositionOfYesButton(short x,short y)
    {
        yes.setLocation(x,y);
    }
    public void setPositionOfNoButton(short x,short y)
    {
        no.setLocation(x,y);
    }
    public void setSizeOfWindow(short x, short y)
    {
        this.x = x;
        this.y = y;
        frame.setSize(this.x,this.y);
    }
    public short getXOfWindow()
    {
        return x;
    }
    public short getYOfWindow()
    {
        return y;
    }
    public short getYOfYesButton()
    {
        return (short) 175;
    }
    public short getXOfYesButton()
    {
        return (short) 600;
    }
    public short getYOfNokButton()
    {
        return (short) 175;
    }
    public short getXOfNoButton()
    {
        return (short) 600;
    }
    public void AddNoButton()
    {
        no.setBounds(100, 100, 590, 175);
        frame.add(no);

    }
    public void setButtonYesFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))yes.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))yes.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))yes.setFont(new Font(FontName, Font.ITALIC, size));
    }
    public void setButtonNoFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))no.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))no.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))no.setFont(new Font(FontName, Font.ITALIC, size));
    }

    public void trimTextOfNoButton()
    {
        String temp =no.getText().trim();
        no.setText(temp);
    }
    public void trimTextOfYesButton()
    {
        String temp =yes.getText().trim();
        yes.setText(temp);
    }
}
