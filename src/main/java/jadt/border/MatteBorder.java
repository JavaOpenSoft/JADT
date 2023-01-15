package jadt.border;

import javax.swing.*;
import java.awt.*;

public class MatteBorder extends javax.swing.border.MatteBorder {
    public MatteBorder(int top, int left, int bottom, int right, Color matteColor) {
        super(top, left, bottom, right, matteColor);
    }

    public MatteBorder(Insets borderInsets, Color matteColor) {
        super(borderInsets, matteColor);
    }

    public MatteBorder(int top, int left, int bottom, int right, Icon tileIcon) {
        super(top, left, bottom, right, tileIcon);
    }

    public MatteBorder(Insets borderInsets, Icon tileIcon) {
        super(borderInsets, tileIcon);
    }

    public MatteBorder(Icon tileIcon) {
        super(tileIcon);
    }
}
