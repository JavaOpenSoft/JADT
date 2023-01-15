package jadt.graphics;

import java.awt.Color;
import java.awt.geom.Point2D;

public class GradientPaint extends java.awt.GradientPaint{
    public GradientPaint(float x1, float y1, Color color1, float x2, float y2, Color color2) {
        super(x1, y1, color1, x2, y2, color2);
    }

    public GradientPaint(Point2D pt1, Color color1, Point2D pt2, Color color2) {
        super(pt1, color1, pt2, color2);
    }

    public GradientPaint(float x1, float y1, Color color1, float x2, float y2, Color color2, boolean cyclic) {
        super(x1, y1, color1, x2, y2, color2, cyclic);
    }
    public GradientPaint(Point2D pt1, Color color1, Point2D pt2, Color color2, boolean cyclic) {
        super(pt1, color1, pt2, color2, cyclic);
    }
}
