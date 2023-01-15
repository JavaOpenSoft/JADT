package jadt.templates;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
@SuppressWarnings("all")
public class AboutJUIT {
    private JFrame frame = new JFrame();
    private String pathOfFile = "jadt/resources/JUITIMG.jpeg";
    private Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
    private JLabel IconImage = new JLabel("");
    private JLabel Author = new JLabel("Author: Rishon Jonathan");
    private JLabel VersionNumber = new JLabel("Version 1.0_rc6");
    public void ShowJADTDetails(int x, int y) {
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("About");
        frame.setIconImage(icon);
        if(x<200) throw new IllegalArgumentException("The Value Of Integer X Is Less Than 200.");
        if(y<200) throw new IllegalArgumentException("The Value Of Integer Y Is Less Than 200.");
        IconImage.setBounds(165, 6, 115, 133);
        IconImage.setIcon(new ImageIcon(Objects.requireNonNull(AboutJUIT.class.getResource("/jui/img/db877c2e-4f32-43bf-8454-7d34afd48786 (1).png"))));
        frame.add(IconImage);
        VersionNumber.setBounds(162, 194, 106, 16);
        frame.add(VersionNumber);
        Author.setBounds(126, 222, 184, 16);
        frame.add(Author);
    }
    public AboutJUIT(int x, int y) {
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("About");
        frame.setIconImage(icon);

        if(x<200) throw new IllegalArgumentException("The Value Of Integer X Is Less Than 200.");
        if(y<200) throw new IllegalArgumentException("The Value Of Integer Y Is Less Than 200.");
        IconImage.setBounds(165, 6, 115, 133);
        IconImage.setIcon(new ImageIcon(Objects.requireNonNull(AboutJUIT.class.getResource("/jui/img/db877c2e-4f32-43bf-8454-7d34afd48786 (1).png"))));
        frame.add(IconImage);
        VersionNumber.setBounds(162, 194, 106, 16);
        frame.add(VersionNumber);
        Author.setBounds(126, 222, 184, 16);
        frame.add(Author);

    }
}
