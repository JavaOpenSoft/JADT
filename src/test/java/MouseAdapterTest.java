import javax.swing.*;

public class MouseAdapterTest {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        JFrame frame = new JFrame();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        frame.add(new JButton("Hello"));
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
