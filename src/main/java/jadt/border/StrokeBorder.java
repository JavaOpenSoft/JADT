package jadt.border;

import java.awt.*;

public class StrokeBorder extends javax.swing.border.StrokeBorder{
    public StrokeBorder(BasicStroke stroke) {
        super(stroke);
    }

    public StrokeBorder(BasicStroke stroke, Paint paint) {
        super(stroke, paint);
    }
}
