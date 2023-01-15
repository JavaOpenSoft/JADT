package jadt.layouts;
import java.awt.Container;

public class BoxLayout {
    public static final int X_AXIS = javax.swing.BoxLayout.X_AXIS;
    public static final int Y_AXIS = javax.swing.BoxLayout.Y_AXIS;

    public javax.swing.BoxLayout getBoxLayout(Container pane, int AXIS)
    {
        return new javax.swing.BoxLayout(pane, AXIS);
    }

}
