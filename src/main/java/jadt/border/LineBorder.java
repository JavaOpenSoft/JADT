package jadt.border;

import jadt.graphics.Color;

public class LineBorder extends javax.swing.border.LineBorder {
    public LineBorder(Color color) {
        super(color);
    }

    public LineBorder(Color color, int thickness) {
        super(color, thickness);
    }

    public LineBorder(Color color, int thickness, boolean roundedCorners) {
        super(color, thickness, roundedCorners);
    }
}
