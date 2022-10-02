package jadt.core;
import javax.swing.JTabbedPane;
public class TabbedPane extends AppComponent{
    private JTabbedPane tabbedPane = new JTabbedPane();
    public JTabbedPane getComponent() {
        return tabbedPane;
    }
}
