package juit.Layouts;
import javax.swing.BoxLayout;
import java.awt.*;

public class BoxLayouts {
    public static final int X_AXIS = BoxLayout.X_AXIS;
    public static final int Y_AXIS = BoxLayout.Y_AXIS;
    public Container getAndSetBoxLayout(Container pane,int AXIS)
    {
        pane.setLayout(new BoxLayout(pane, AXIS));
        return pane;
    }
    public BoxLayout getBoxLayout(Container pane, int AXIS)
    {
        return new BoxLayout(pane, AXIS);
    }
    public void setBoxLayout(Container pane,int AXIS)
    {
        pane.setLayout(new BoxLayout(pane, AXIS));
    }
}
