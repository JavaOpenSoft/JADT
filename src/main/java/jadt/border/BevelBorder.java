package jadt.border;

import java.awt.*;

public class BevelBorder extends javax.swing.border.BevelBorder {

    public BevelBorder(int bevelType) {
        super(bevelType);
    }

    public BevelBorder(int bevelType, Color highlight, Color shadow) {
        super(bevelType, highlight, shadow);
    }

    public BevelBorder(int bevelType, Color highlightOuterColor, Color highlightInnerColor, Color shadowOuterColor, Color shadowInnerColor) {
        super(bevelType, highlightOuterColor, highlightInnerColor, shadowOuterColor, shadowInnerColor);
    }
}
