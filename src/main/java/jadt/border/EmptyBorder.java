package jadt.border;

import java.awt.*;

public class EmptyBorder extends javax.swing.border.EmptyBorder {
    public EmptyBorder(int top, int left, int bottom, int right) {
        super(top, left, bottom, right);
    }

    public EmptyBorder(Insets borderInsets) {
        super(borderInsets);
    }
}
