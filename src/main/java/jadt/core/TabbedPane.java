package jadt.core;
import javax.swing.JTabbedPane;
@SuppressWarnings("FieldMayBeFinal")
public class TabbedPane {
    @SuppressWarnings("FieldMayBeFinal")
    private JTabbedPane tabbedPane = new JTabbedPane();
    public JTabbedPane getComponent() {
        return tabbedPane;
    }
}
