package jadt.templates;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class AboutApp {
    int versionNumber;
    private String Author;
    private String Copyright;
    private final JLabel IconImage = new JLabel();
    private final JLabel AuthorLabel = new JLabel();
    private final JLabel CopyrightLabel = new JLabel();
    private final JLabel VersionNumber = new JLabel();
    private String FontName;
    private String FontType;
    private short size;
    public AboutApp()
    {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("About");
        String pathOfFile = "jui/img/Unknown.jpeg";
        Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
        frame.setIconImage(icon);

        IconImage.setBounds(165, 6, 115, 133);
        IconImage.setIcon(new ImageIcon(Objects.requireNonNull(AboutApp.class.getResource("/jui/img/db877c2e-4f32-43bf-8454-7d34afd48786 (1).png"))));
        frame.add(IconImage);
        VersionNumber.setBounds(162, 194, 106, 16);
        frame.add(VersionNumber);


        AuthorLabel.setBounds(126, 222, 184, 16);
        frame.add(AuthorLabel);
        CopyrightLabel.setFont(new Font("SansSerif", Font.PLAIN, 13));
        CopyrightLabel.setBounds(26, 250, 396, 16);
        frame.add(CopyrightLabel);
    }
    public void setAuthorText(String Text)
    {
        AuthorLabel.setText(Text);
    }
    public void setCopyrightLabel(String Text)
    {
        CopyrightLabel.setText(Text);
    }

    public void setCopyrightFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))CopyrightLabel.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))CopyrightLabel.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))CopyrightLabel.setFont(new Font(FontName, Font.ITALIC, size));
        this.FontType = FontType;
        this.FontName = FontName;
        this.size = size;
    }
    public void setAuthorFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))AuthorLabel.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))AuthorLabel.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))AuthorLabel.setFont(new Font(FontName, Font.ITALIC, size));
        this.FontType = FontType;
        this.FontName = FontName;
        this.size = size;
    }
    public void setVersionFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))VersionNumber.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))VersionNumber.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))VersionNumber.setFont(new Font(FontName, Font.ITALIC, size));
        this.FontType = FontType;
        this.FontName = FontName;
        this.size = size;
    }
    public void SetIconImage(String pathOfFile) {
        IconImage.setIcon(new ImageIcon(Objects.requireNonNull(AboutApp.class.getResource(pathOfFile))));
    }
    public String getFontName()
    {
        return IconImage.getFont().getFamily();
    }
    public String getFontType()
    {
        return this.FontType;
    }
    public short getFontSize()
    {
        return this.size;
    }
}
