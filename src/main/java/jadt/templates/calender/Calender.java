package jadt.templates.calender;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serial;
import java.util.Calendar;
import jadt.core.Window;

@SuppressWarnings("all")
public class Calender {
    private Window window;
    private Subclass sc = new Subclass(10,2022);
    public jadt.core.Window
    getWindowComponent(){
        return window;
    }
    public Calender(Window window) {
        this.window = window;
        // Month is zero based

        Subclass panel = new Subclass(10, 2022);
        window.setTitle("Calendar");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getComponent().addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                removeCalendar(window.getComponent());
            }
        });
        window.setLayout(new jadt.layouts.FlowLayout());
        window.getComponent().add(panel);
        window.getComponent().pack();
        // frame.setBounds(100, 100, 400, 200);
        window.show();
    }


    public void removeCalendar(JFrame frame) {
        frame.dispose();
        System.exit(0);
    }
    public Subclass getCalender()
    {
        return sc;
    }

}
class Subclass extends JPanel {
    @Serial
    private static final long   serialVersionUID    = 1L;
    protected int month;
    protected int year;
    protected String[] monthNames = { "January", "February",
            "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    protected String[] dayNames = { "S", "M", "T", "W", "T", "F", "S"};

    public Subclass(int month, int year) {
        this.month = month;
        this.year = year;

        this.add(init());
    }

    protected JPanel init() {
        JPanel monthPanel = new JPanel(true);
        monthPanel.setBorder(BorderFactory
                .createLineBorder(SystemColor.activeCaption));
        monthPanel.setLayout(new BorderLayout());
        monthPanel.setBackground(Color.WHITE);
        monthPanel.setForeground(Color.BLACK);
        monthPanel.add(getCalendarTitle(), BorderLayout.NORTH);
        monthPanel.add(getCalender(), BorderLayout.SOUTH);

        return monthPanel;
    }

    protected JPanel getCalendarTitle() {
        JPanel titlePanel = new JPanel(true);
        titlePanel.setBorder(BorderFactory
                .createLineBorder(SystemColor.activeCaption));
        titlePanel.setLayout(new FlowLayout());
        titlePanel.setBackground(Color.WHITE);

        JLabel label = new JLabel(monthNames[month] + " " + year);
        label.setForeground(SystemColor.activeCaption);

        titlePanel.add(label, BorderLayout.CENTER);

        return titlePanel;
    }

    protected JPanel getCalender() {
        JPanel dayPanel = new JPanel(true);
        dayPanel.setLayout(new GridLayout(0, dayNames.length));

        Calendar today = Calendar.getInstance();
        int tMonth = today.get(Calendar.MONTH);
        int tYear = today.get(Calendar.YEAR);
        int tDay = today.get(Calendar.DAY_OF_MONTH);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        Calendar iterator = (Calendar) calendar.clone();
        iterator.add(Calendar.DAY_OF_MONTH,
                -(iterator.get(Calendar.DAY_OF_WEEK) - 1));

        Calendar maximum = (Calendar) calendar.clone();
        maximum.add(Calendar.MONTH, +1);

        for (String dayName : dayNames) {
            JPanel dPanel = new JPanel(true);
            dPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JLabel dLabel = new JLabel(dayName);
            dPanel.add(dLabel);
            dayPanel.add(dPanel);
        }

        int count = 0;
        int limit = dayNames.length * 6;

        while (iterator.getTimeInMillis() < maximum.getTimeInMillis()) {
            int lMonth = iterator.get(Calendar.MONTH);
            int lYear = iterator.get(Calendar.YEAR);

            JPanel dPanel = new JPanel(true);
            dPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JLabel dayLabel = new JLabel();

            if ((lMonth == month) && (lYear == year)) {
                int lDay = iterator.get(Calendar.DAY_OF_MONTH);
                dayLabel.setText(Integer.toString(lDay));
                if ((tMonth == month) && (tYear == year) && (tDay == lDay)) {
                    dPanel.setBackground(Color.ORANGE);
                } else {
                    dPanel.setBackground(Color.WHITE);
                }
            } else {
                dayLabel.setText(" ");
                dPanel.setBackground(Color.WHITE);
            }
            dPanel.add(dayLabel);
            dayPanel.add(dPanel);
            iterator.add(Calendar.DAY_OF_YEAR, +1);
            count++;
        }

        for (int i = count; i < limit; i++) {
            JPanel dPanel = new JPanel(true);
            dPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JLabel dayLabel = new JLabel();
            dayLabel.setText(" ");
            dPanel.setBackground(Color.WHITE);
            dPanel.add(dayLabel);
            dayPanel.add(dPanel);
        }

        return dayPanel;
    }

}