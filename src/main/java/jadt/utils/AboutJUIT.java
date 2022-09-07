package jadt.utils;

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.util.Objects;
import java.awt.Font;

public class AboutJUIT {
    public void ShowJUIDetails(int x, int y) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("About");
        String pathOfFile = "juit/resources/Unknown.jpeg";
        Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
        frame.setIconImage(icon);

        if(x<200) throw new IllegalArgumentException("The Value Of Integer X Is Less Than 200.");
        if(y<200) throw new IllegalArgumentException("The Value Of Integer Y Is Less Than 200.");

        JLabel IconImage = new JLabel("");
        IconImage.setBounds(165, 6, 115, 133);
        IconImage.setIcon(new ImageIcon(Objects.requireNonNull(AboutJUIT.class.getResource("/jui/img/db877c2e-4f32-43bf-8454-7d34afd48786 (1).png"))));
        frame.getContentPane().add(IconImage);

        JLabel VersionNumber = new JLabel("Version 1.0_rc1");
        VersionNumber.setBounds(162, 194, 106, 16);
        frame.getContentPane().add(VersionNumber);

        JLabel Author = new JLabel("Author: Rishon Jonathan");
        Author.setBounds(126, 222, 184, 16);
        frame.getContentPane().add(Author);

        JLabel Copyright = new JLabel("@Copyright Opensoftshop.in 2020-2021. All Rights Preserved");
        Copyright.setFont(new Font("SansSerif", Font.PLAIN, 13));
        Copyright.setBounds(26, 250, 396, 16);
        frame.getContentPane().add(Copyright);
    }
    private AboutJUIT(int x, int y) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("About");
        String pathOfFile = "jui/img/Unknown.jpeg";
        Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
        frame.setIconImage(icon);

        if(x<200) throw new IllegalArgumentException("The Value Of Integer X Is Less Than 200.");
        if(y<200) throw new IllegalArgumentException("The Value Of Integer Y Is Less Than 200.");

        JLabel IconImage = new JLabel("");
        IconImage.setBounds(165, 6, 115, 133);
        IconImage.setIcon(new ImageIcon(Objects.requireNonNull(AboutJUIT.class.getResource("/jui/img/db877c2e-4f32-43bf-8454-7d34afd48786 (1).png"))));
        frame.getContentPane().add(IconImage);

        JLabel VersionNumber = new JLabel("Version 0.6 Beta");
        VersionNumber.setBounds(162, 194, 106, 16);
        frame.getContentPane().add(VersionNumber);

        JLabel Author = new JLabel("Author: Rishon Jonathan");
        Author.setBounds(126, 222, 184, 16);
        frame.getContentPane().add(Author);

        JLabel Copyright = new JLabel("@Copyright Opensoftshop.in 2020-2021. All Rights Preserved");
        Copyright.setFont(new Font("SansSerif", Font.PLAIN, 13));
        Copyright.setBounds(26, 250, 396, 16);
        frame.getContentPane().add(Copyright);
    }
}
