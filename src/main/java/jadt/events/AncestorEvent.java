package jadt.events;

import javax.swing.event.AncestorListener;

public abstract class AncestorEvent implements AncestorListener {
    @Override
    public String toString() {
        return "AncestorEvent{javax.swing.AncestorListener}";
    }
}
