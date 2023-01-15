package jadt.border;

import javax.swing.border.Border;
import java.awt.*;

public class TitledBorder extends javax.swing.border.TitledBorder {
    public TitledBorder(String title) {
        super(title);
    }

    public TitledBorder(Border border) {
        super(border);
    }

    public TitledBorder(Border border, String title) {
        super(border, title);
    }

    public TitledBorder(Border border, String title, int titleJustification, int titlePosition) {
        super(border, title, titleJustification, titlePosition);
    }

    public TitledBorder(Border border, String title, int titleJustification, int titlePosition, Font titleFont) {
        super(border, title, titleJustification, titlePosition, titleFont);
    }

    public TitledBorder(Border border, String title, int titleJustification, int titlePosition, Font titleFont, Color titleColor) {
        super(border, title, titleJustification, titlePosition, titleFont, titleColor);
    }
}
