package jadt.border;

import java.awt.*;

public class SoftBevelBorder extends javax.swing.border.SoftBevelBorder {
    public SoftBevelBorder(int bevelType) {
        super(bevelType);
    }

    public SoftBevelBorder(int bevelType, Color highlight, Color shadow) {
        super(bevelType, highlight, shadow);
    }

    public SoftBevelBorder(int bevelType, Color highlightOuterColor, Color highlightInnerColor, Color shadowOuterColor, Color shadowInnerColor) {
        super(bevelType, highlightOuterColor, highlightInnerColor, shadowOuterColor, shadowInnerColor);
    }
}
