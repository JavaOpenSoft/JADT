package jadt.layouts;
import javax.swing.BoxLayout;
import java.awt.*;

public class BoxLayouts {
    public static final int X_AXIS = BoxLayout.X_AXIS;
    public static final int Y_AXIS = BoxLayout.Y_AXIS;

    public BoxLayout getBoxLayout(Container pane,int AXIS)
    {
        return new BoxLayout(pane, AXIS);
    }

}
