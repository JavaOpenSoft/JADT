package jadt.core;

import jadt.JADTComponent;
import jadt.core.misc.DraggableComponent;
import org.jetbrains.annotations.NotNull;
import jadt.events.*;
import javax.swing.*;

@SuppressWarnings("FieldMayBeFinal")
public class FormattedTextField extends JADTComponent {
    @SuppressWarnings("FieldMayBeFinal")
    private DraggableComponent draggableComponent;
    private JFormattedTextField formattedTextField = new JFormattedTextField();
    public JFormattedTextField getComponent() {
        return formattedTextField;
    }
    public void setText(String text) {
        formattedTextField.setText(text);
    }
    public void append(String text) {formattedTextField.setText(formattedTextField.getText() + text);}
    public void replace(char oldChar, char newChar) {formattedTextField.setText(formattedTextField.getText().replace(oldChar, newChar));}
    public void addActionEvent(@NotNull ActionEvent event)
    {
        formattedTextField.addActionListener(event);
    }
    public void removeActionEvent(@NotNull ActionEvent event){formattedTextField.removeActionListener(event);}

    public void addAncestorEvent(@NotNull AncestorEvent event){formattedTextField.addAncestorListener(event);}
    public void removeAncestorEvent(@NotNull AncestorEvent event){formattedTextField.removeAncestorListener(event);}

    public void addComponentEvent(@NotNull ComponentEvent event){formattedTextField.addComponentListener(event);}
    public void removeComponentEvent(@NotNull ComponentEvent event){formattedTextField.removeComponentListener(event);}

    public void addContainerEvent(@NotNull ContainerEvent event){formattedTextField.addContainerListener(event);}
    public void removeContainerEvent(@NotNull ContainerEvent event){formattedTextField.removeContainerListener(event);}

    public void addFocusEvent(@NotNull FocusEvent event){formattedTextField.addFocusListener(event);}
    public void removeFocusEvent(@NotNull FocusEvent event){formattedTextField.removeFocusListener(event);}

    public void addHierarchyEvent(@NotNull HierarchyEvent event){formattedTextField.addHierarchyListener(event);}
    public void removeHierarchyEvent(@NotNull HierarchyEvent event){formattedTextField.removeHierarchyListener(event);}

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){formattedTextField.addHierarchyBoundsListener(event);}
    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event){formattedTextField.addHierarchyBoundsListener(event);}

    public void addInputMethodEvent(@NotNull InputMethodEvent event){formattedTextField.addInputMethodListener(event);}
    public void removeInputMethodEvent(@NotNull InputMethodEvent event){formattedTextField.removeInputMethodListener(event);}

    public void addKeyEvent(@NotNull KeyEvent event){formattedTextField.addKeyListener(event);}
    public void removeKeyEvent(@NotNull KeyEvent event){formattedTextField.removeKeyListener(event);}

    public void addMouseEvent(@NotNull MouseEvent event){formattedTextField.addMouseListener(event);}
    public void removeMouseEvent(@NotNull MouseEvent event){formattedTextField.removeMouseListener(event);}

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event){formattedTextField.addMouseMotionListener(event);}
    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event){formattedTextField.removeMouseMotionListener(event);}

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event){formattedTextField.addMouseWheelListener(event);}
    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event){formattedTextField.removeMouseWheelListener(event);}

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event){formattedTextField.addVetoableChangeListener(event);}
    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event){formattedTextField.removeVetoableChangeListener(event);}

    public void setDraggable(boolean isDraggable){
        if(isDraggable) {
            draggableComponent = new DraggableComponent(formattedTextField);
        }
        else if(!isDraggable){
            draggableComponent.removeDraggingAbilities();
        }
    }
}
