package juit.Layouts;
import java.awt.*;

public class CardLayouts {
    public CardLayout cardLayout = new CardLayout();
    public CardLayout getCardLayout() {
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
