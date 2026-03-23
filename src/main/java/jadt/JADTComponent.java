package jadt;

import jadt.core.misc.DraggableComponent;
import jadt.events.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Component;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.util.Objects;

public class JADTComponent {
    private DraggableComponent draggableComponent;

    public void setSize(int sizeX, int sizeY) {
        Component component = requireComponent();
        component.setSize(sizeX, sizeY);
    }

    public void setPosition(int positionX, int positionY) {
        Component component = requireComponent();
        component.setLocation(positionX, positionY);
    }

    public void setBounds(int sizeX, int sizeY, int positionX, int positionY) {
        Component component = requireComponent();
        component.setBounds(positionX, positionY, sizeX, sizeY);
    }

    public void setDraggable(boolean draggable) {
        if (draggable) {
            draggableComponent = new DraggableComponent(getJComponent());
            return;
        }
        if (draggableComponent != null) {
            draggableComponent.removeDraggingAbilities();
            draggableComponent = null;
        }
    }

    public void setFocusable(boolean focusable) {
        requireComponent().setFocusable(focusable);
    }

    public boolean isFocusable() {
        return requireComponent().isFocusable();
    }

    public Component getComponent() {
        return null;
    }

    public <T extends Component> T getSwingComponent(@NotNull Class<T> type) {
        return type.cast(requireComponent());
    }

    protected final Component requireComponent() {
        return Objects.requireNonNull(getComponent(), getClass().getSimpleName() + " does not wrap a Swing component");
    }

    protected final JComponent getJComponent() {
        return (JComponent) requireComponent();
    }

    protected final Container getContainer() {
        return (Container) requireComponent();
    }

    public void setVisible(boolean visible) {
        requireComponent().setVisible(visible);
    }

    public void showComponent() {
        setVisible(true);
    }

    public void hideComponent() {
        setVisible(false);
    }

    public boolean isVisible() {
        return requireComponent().isVisible();
    }

    public void setEnabled(boolean enabled) {
        requireComponent().setEnabled(enabled);
    }

    public boolean isEnabled() {
        return requireComponent().isEnabled();
    }

    public void requestFocus() {
        requireComponent().requestFocus();
    }

    public boolean requestFocusInWindow() {
        return requireComponent().requestFocusInWindow();
    }

    public void repaint() {
        requireComponent().repaint();
    }

    public void revalidate() {
        Component component = requireComponent();
        if (component instanceof JComponent jComponent) {
            jComponent.revalidate();
        }
    }

    public int getX() {
        return requireComponent().getX();
    }

    public int getY() {
        return requireComponent().getY();
    }

    public int getWidth() {
        return requireComponent().getWidth();
    }

    public int getHeight() {
        return requireComponent().getHeight();
    }

    public Point getLocation() {
        return requireComponent().getLocation();
    }

    public Dimension getSize() {
        return requireComponent().getSize();
    }

    public Rectangle getBounds() {
        return requireComponent().getBounds();
    }

    public void setPreferredSize(int sizeX, int sizeY) {
        setPreferredSize(new Dimension(sizeX, sizeY));
    }

    public void setPreferredSize(Dimension size) {
        requireComponent().setPreferredSize(size);
    }

    public Dimension getPreferredSize() {
        return requireComponent().getPreferredSize();
    }

    public void setMaximumSize(int sizeX, int sizeY) {
        setMaximumSize(new Dimension(sizeX, sizeY));
    }

    public void setMaximumSize(Dimension size) {
        requireComponent().setMaximumSize(size);
    }

    public Dimension getMaximumSize() {
        return requireComponent().getMaximumSize();
    }

    public void setMinimumSize(int sizeX, int sizeY) {
        setMinimumSize(new Dimension(sizeX, sizeY));
    }

    public void setMinimumSize(Dimension size) {
        requireComponent().setMinimumSize(size);
    }

    public Dimension getMinimumSize() {
        return requireComponent().getMinimumSize();
    }

    public void setForeground(Color color) {
        requireComponent().setForeground(color);
    }

    public Color getForeground() {
        return requireComponent().getForeground();
    }

    public void setBackground(Color color) {
        requireComponent().setBackground(color);
    }

    public Color getBackground() {
        return requireComponent().getBackground();
    }

    public void setFont(Font font) {
        requireComponent().setFont(font);
    }

    public Font getFont() {
        return requireComponent().getFont();
    }

    public void setCursor(Cursor cursor) {
        requireComponent().setCursor(cursor);
    }

    public Cursor getCursor() {
        return requireComponent().getCursor();
    }

    public void setName(String name) {
        requireComponent().setName(name);
    }

    public String getName() {
        return requireComponent().getName();
    }

    public Container getParent() {
        return requireComponent().getParent();
    }

    public void setOpaque(boolean opaque) {
        getJComponent().setOpaque(opaque);
    }

    public boolean isOpaque() {
        return getJComponent().isOpaque();
    }

    public void setToolTipText(String text) {
        getJComponent().setToolTipText(text);
    }

    public String getToolTipText() {
        return getJComponent().getToolTipText();
    }

    public void setBorder(Border border) {
        getJComponent().setBorder(border);
    }

    public Border getBorder() {
        return getJComponent().getBorder();
    }

    public void add(JADTComponent component) {
        getContainer().add(component.requireComponent());
    }

    public void add(Component component) {
        getContainer().add(component);
    }

    public void remove(JADTComponent component) {
        getContainer().remove(component.requireComponent());
    }

    public void remove(Component component) {
        getContainer().remove(component);
    }

    public void removeAll() {
        getContainer().removeAll();
    }

    public void setLayout(LayoutManager layoutManager) {
        getContainer().setLayout(layoutManager);
    }

    public LayoutManager getLayout() {
        return getContainer().getLayout();
    }

    public int getComponentCount() {
        return getContainer().getComponentCount();
    }

    public Component[] getComponents() {
        return getContainer().getComponents();
    }

    public void addPropertyChangeEvent(@NotNull PropertyChangeEvent event) {
        requireComponent().addPropertyChangeListener(event);
    }

    public void removePropertyChangeEvent(@NotNull PropertyChangeEvent event) {
        requireComponent().removePropertyChangeListener(event);
    }

    public void addPropertyChangeListener(@NotNull PropertyChangeListener listener) {
        requireComponent().addPropertyChangeListener(listener);
    }

    public void addPropertyChangeListener(String propertyName, @NotNull PropertyChangeListener listener) {
        requireComponent().addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(@NotNull PropertyChangeListener listener) {
        requireComponent().removePropertyChangeListener(listener);
    }

    public void addVetoableChangeEvent(@NotNull VetoableChangeEvent event) {
        getJComponent().addVetoableChangeListener(event);
    }

    public void removeVetoableChangeEvent(@NotNull VetoableChangeEvent event) {
        getJComponent().removeVetoableChangeListener(event);
    }

    public void addVetoableChangeListener(@NotNull VetoableChangeListener listener) {
        getJComponent().addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(@NotNull VetoableChangeListener listener) {
        getJComponent().removeVetoableChangeListener(listener);
    }

    public void addAncestorEvent(@NotNull AncestorEvent event) {
        getJComponent().addAncestorListener(event);
    }

    public void removeAncestorEvent(@NotNull AncestorEvent event) {
        getJComponent().removeAncestorListener(event);
    }

    public void addComponentEvent(@NotNull ComponentEvent event) {
        requireComponent().addComponentListener(event);
    }

    public void removeComponentEvent(@NotNull ComponentEvent event) {
        requireComponent().removeComponentListener(event);
    }

    public void addContainerEvent(@NotNull ContainerEvent event) {
        getContainer().addContainerListener(event);
    }

    public void removeContainerEvent(@NotNull ContainerEvent event) {
        getContainer().removeContainerListener(event);
    }

    public void addFocusEvent(@NotNull FocusEvent event) {
        requireComponent().addFocusListener(event);
    }

    public void removeFocusEvent(@NotNull FocusEvent event) {
        requireComponent().removeFocusListener(event);
    }

    public void addHierarchyEvent(@NotNull HierarchyEvent event) {
        requireComponent().addHierarchyListener(event);
    }

    public void removeHierarchyEvent(@NotNull HierarchyEvent event) {
        requireComponent().removeHierarchyListener(event);
    }

    public void addHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event) {
        requireComponent().addHierarchyBoundsListener(event);
    }

    public void removeHierarchyBoundsEvent(@NotNull HierarchyBoundsEvent event) {
        requireComponent().removeHierarchyBoundsListener(event);
    }

    public void addInputMethodEvent(@NotNull InputMethodEvent event) {
        requireComponent().addInputMethodListener(event);
    }

    public void removeInputMethodEvent(@NotNull InputMethodEvent event) {
        requireComponent().removeInputMethodListener(event);
    }

    public void addKeyEvent(@NotNull KeyEvent event) {
        requireComponent().addKeyListener(event);
    }

    public void removeKeyEvent(@NotNull KeyEvent event) {
        requireComponent().removeKeyListener(event);
    }

    public void addMouseEvent(@NotNull MouseEvent event) {
        requireComponent().addMouseListener(event);
    }

    public void removeMouseEvent(@NotNull MouseEvent event) {
        requireComponent().removeMouseListener(event);
    }

    public void addMouseMotionEvent(@NotNull MouseMotionEvent event) {
        requireComponent().addMouseMotionListener(event);
    }

    public void removeMouseMotionEvent(@NotNull MouseMotionEvent event) {
        requireComponent().removeMouseMotionListener(event);
    }

    public void addMouseWheelEvent(@NotNull MouseWheelEvent event) {
        requireComponent().addMouseWheelListener(event);
    }

    public void removeMouseWheelEvent(@NotNull MouseWheelEvent event) {
        requireComponent().removeMouseWheelListener(event);
    }

    public void addActionEvent(@NotNull ActionEvent event) {
        Object component = requireComponent();
        if (component instanceof AbstractButton abstractButton) {
            abstractButton.addActionListener(event);
        } else if (component instanceof JTextField textField) {
            textField.addActionListener(event);
        }
    }

    public void removeActionEvent(@NotNull ActionEvent event) {
        Object component = requireComponent();
        if (component instanceof AbstractButton abstractButton) {
            abstractButton.removeActionListener(event);
        } else if (component instanceof JTextField textField) {
            textField.removeActionListener(event);
        }
    }

    public void addChangeEvent(@NotNull ChangeEvent event) {
        Object component = requireComponent();
        if (component instanceof AbstractButton abstractButton) {
            abstractButton.addChangeListener(event);
        } else if (component instanceof JSpinner spinner) {
            spinner.addChangeListener(event);
        } else if (component instanceof JSlider slider) {
            slider.addChangeListener(event);
        } else if (component instanceof JProgressBar progressBar) {
            progressBar.addChangeListener(event);
        }
    }

    public void removeChangeEvent(@NotNull ChangeEvent event) {
        Object component = requireComponent();
        if (component instanceof AbstractButton abstractButton) {
            abstractButton.removeChangeListener(event);
        } else if (component instanceof JSpinner spinner) {
            spinner.removeChangeListener(event);
        } else if (component instanceof JSlider slider) {
            slider.removeChangeListener(event);
        } else if (component instanceof JProgressBar progressBar) {
            progressBar.removeChangeListener(event);
        }
    }

    public void addItemEvent(@NotNull ItemEvent event) {
        Object component = requireComponent();
        if (component instanceof ItemSelectable itemSelectable) {
            itemSelectable.addItemListener(event);
        }
    }

    public void removeItemEvent(@NotNull ItemEvent event) {
        Object component = requireComponent();
        if (component instanceof ItemSelectable itemSelectable) {
            itemSelectable.removeItemListener(event);
        }
    }
}
