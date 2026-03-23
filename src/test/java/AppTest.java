import jadt.app.App;

import javax.swing.SwingUtilities;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class AppTest {
    public static void main(String[] args) throws Exception {
        testSetApplicationName();
        testRunAsyncRunsTask();
        testRunOnUiThreadUsesEdt();
    }

    private static void testSetApplicationName() {
        App.setApplicationName("JADT Test App");
        TestSupport.assertEquals("JADT Test App", System.getProperty("apple.awt.application.name"),
                "App should set the macOS application name property");
    }

    private static void testRunAsyncRunsTask() throws Exception {
        CountDownLatch latch = new CountDownLatch(1);
        AtomicReference<String> threadName = new AtomicReference<>();

        Thread worker = App.runAsync(() -> {
            threadName.set(Thread.currentThread().getName());
            latch.countDown();
        });

        TestSupport.assertTrue(worker.isDaemon(), "Async worker should be daemonized");
        TestSupport.assertTrue(latch.await(2, TimeUnit.SECONDS), "Async task should complete");
        TestSupport.assertEquals("jadt-worker", threadName.get(), "Async worker should use the expected thread name");
    }

    private static void testRunOnUiThreadUsesEdt() throws Exception {
        CountDownLatch latch = new CountDownLatch(1);
        AtomicBoolean ranOnEdt = new AtomicBoolean(false);

        App.runOnUiThread(() -> {
            ranOnEdt.set(SwingUtilities.isEventDispatchThread());
            latch.countDown();
        });

        TestSupport.assertTrue(latch.await(2, TimeUnit.SECONDS), "UI task should run");
        TestSupport.assertTrue(ranOnEdt.get(), "UI task should execute on the EDT");
    }
}
