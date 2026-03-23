package jadt.app;

import jadt.core.MenuBar;
import jadt.core.Window;
import jadt.graphics.NativeImage;

public final class WindowBuilder {
    private String title = "";
    private int width = 400;
    private int height = 300;
    private Integer x;
    private Integer y;
    private Integer closeOperation;
    private boolean visible = true;
    private MenuBar menuBar;
    private NativeImage titleBarIcon;

    private WindowBuilder() {
    }

    public static WindowBuilder create() {
        return new WindowBuilder();
    }

    public WindowBuilder title(String title) {
        this.title = title;
        return this;
    }

    public WindowBuilder size(int width, int height) {
        this.width = width;
        this.height = height;
        return this;
    }

    public WindowBuilder position(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public WindowBuilder closeOperation(int closeOperation) {
        this.closeOperation = closeOperation;
        return this;
    }

    public WindowBuilder menuBar(MenuBar menuBar) {
        this.menuBar = menuBar;
        return this;
    }

    public WindowBuilder titleBarIcon(NativeImage titleBarIcon) {
        this.titleBarIcon = titleBarIcon;
        return this;
    }

    public WindowBuilder visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public Window build() {
        Window window;
        if (x != null && y != null) {
            window = new Window(title, width, height, x, y);
        } else {
            window = new Window(title, width, height);
        }

        if (closeOperation != null) {
            window.setDefaultCloseOperation(closeOperation);
        }
        if (menuBar != null) {
            window.setMenuBar(menuBar);
        }
        if (titleBarIcon != null) {
            window.setTitleBarIcon(titleBarIcon);
        }
        if (!visible) {
            window.hide();
        }
        return window;
    }
}
