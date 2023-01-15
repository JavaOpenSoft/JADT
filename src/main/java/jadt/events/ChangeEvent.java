package jadt.events;

import javax.swing.event.ChangeListener;

public abstract class ChangeEvent implements ChangeListener{
    @Override
    public String toString() {
        return "ChangeEvent{}";
    }
}
