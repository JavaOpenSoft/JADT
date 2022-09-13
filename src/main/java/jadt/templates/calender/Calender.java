package jadt.templates.calender;
import jadt.layouts.FlowLayout;
import jadt.core.Window;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Calender {
    Window window;
    Subclass ssc = new Subclass(11,2021);
    public Calender(Window window) {
        this.window = window;
        // Month is zero based

        Subclass panel = new Subclass(11, 2021);

        window.setTitle("Calendar");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getComponent().addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                removeCalendar(window.getComponent());
            }
        });

        window.setLayout(new FlowLayout());
        window.getComponent().add(panel);
        window.getComponent().pack();
        // frame.setBounds(100, 100, 400, 200);
        window.showWindow();
    }


    public void removeCalendar(JFrame frame) {
        frame.dispose();
        System.exit(0);
    }
    public Subclass getCalender()
    {
        return ssc;
    }

}
