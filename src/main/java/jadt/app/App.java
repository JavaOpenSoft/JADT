package jadt.app;

import jadt.laf.UI;

import javax.swing.SwingUtilities;

public final class App {
    private App() {
    }

    public static void launch(Runnable app) {
        UI.bootstrapDefaults();
        SwingUtilities.invokeLater(app);
    }

    public static void runOnUiThread(Runnable task) {
        if (SwingUtilities.isEventDispatchThread()) {
            task.run();
            return;
        }
        SwingUtilities.invokeLater(task);
    }

    public static void runLater(Runnable task) {
        SwingUtilities.invokeLater(task);
    }

    public static Thread runAsync(Runnable task) {
        Thread thread = new Thread(task, "jadt-worker");
        thread.setDaemon(true);
        thread.start();
        return thread;
    }

    public static void setApplicationName(String applicationName) {
        System.setProperty("apple.awt.application.name", applicationName);
    }

    public static void useNativeDefaults() {
        UI.bootstrapDefaults();
    }
}
