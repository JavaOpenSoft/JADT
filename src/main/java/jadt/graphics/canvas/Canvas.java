package jadt.graphics.canvas;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.ImageObserver;
@SuppressWarnings("all")
public class Canvas{
    private java.awt.Canvas canvas = new java.awt.Canvas();
    private Graphics g = canvas.getGraphics();
    private jadt.graphics.Color color = new jadt.graphics.Color(255,255,255);
    private Brush brush;
    private boolean isBrushShown = false;
    private Graphics2D graphics2d;
    public Canvas() {

    }
    public Graphics2D getGraphics2D() {
        return graphics2d;
    }

    
    public Canvas(int[] colorIndex) {
        setBackgroundColor(colorIndex);
    }

    public void PaintImage(Image image,int x,int y,int width,int height,ImageObserver imageObserver)
    {
        g.drawImage(image, x, y, width, height, imageObserver);
    }
    public void paintArch(int x,int y,int width,int height,int startAngle,int ArchAngle)
    {
        g.drawArc(x, y, width, height, startAngle, ArchAngle);
    }
    public void addBrush(Brush brush){
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });
        this.brush = brush;
    }
    public Brush getBrush(){
        return brush;
    }
    public void removeBrush(){
        brush = null;
    }
    public void setGraphicsColor(int[] colorIndex)
    {
        g.setColor(new java.awt.Color(colorIndex[0],colorIndex[1],colorIndex[2]));
    }

    public void setColor(jadt.graphics.Color color) {
        brush.setColor(color);
    }

    public void setFont(jadt.graphics.Font font)
    {
        g.setFont(font);
    }
    public java.awt.Canvas getCanvas() {
        return canvas;
    }
    public void drawRect(int x,int y,int height,int width)
    {
        g.drawRect(x,y,width,height);
    }
    public Graphics getGraphics() {
        return g;
    }
    public void drawRoundedRectangle(int x,int y,int width,int height,int ArchWidth,int ArchHeight)
    {
        g.drawRoundRect(x,y,width, height,ArchWidth,ArchHeight);
    }
    public void setBackgroundColor(int[] colorIndex)
    {
        java.awt.Color color = new java.awt.Color(colorIndex[0],colorIndex[1],colorIndex[2]);
        canvas.setBackground(color);
        this.color = new jadt.graphics.Color(colorIndex[0],colorIndex[1],colorIndex[2]);
    }
    public jadt.graphics.Color getBackgroundColor()
    {
        return color;
    }
    public void setBrushSize(int brushSizeX, int brushSizeY) {
        brush.setBrushSize(brushSizeX, brushSizeY);
    }
    public int getBrushSizeY(){
        return brush.getBrushX();
    }
    public int getBrushX(){
        return brush.getBrushX();
    }
    public void drawPixel(int positionX, int positionY){
        g.drawLine(positionX, positionY,positionX, positionY);
    }
    public boolean isBrushShown(){
        return isBrushShown();
    }

    public void show(){
        isBrushShown = true;
    }
    public void hide(){
        isBrushShown = false;
    }
}
