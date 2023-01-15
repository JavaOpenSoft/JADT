package jadt.events;

import java.beans.VetoableChangeListener;

public abstract class VetoableChangeEvent implements VetoableChangeListener {
    @Override
    public String toString() {
        return "VetoableChangeEvent{java.beans.VetoableChangeListener}";
    }
}
