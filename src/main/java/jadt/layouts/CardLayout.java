package jadt.layouts;
import java.awt.*;

public class CardLayout {
    public java.awt.CardLayout cardLayout = new java.awt.CardLayout();
    public java.awt.CardLayout getCardLayout() {
        return cardLayout;
    }
    public void show(Container parent,String name){
        cardLayout.show(parent,name);
    }
    public void first(Container container){
        cardLayout.first(container);
    }
    public void next(Container container){
        cardLayout.next(container);
    }
    public float getAlignmentX(Container container){
        return cardLayout.getLayoutAlignmentX(container);
    }
    public float getAlignmentY(Container container){
        return cardLayout.getLayoutAlignmentY(container);
    }
}
