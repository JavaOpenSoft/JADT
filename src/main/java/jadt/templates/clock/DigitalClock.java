package jadt.templates.clock;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.Color;
@SuppressWarnings("SpellCheckingInspection")
public class DigitalClock extends JFrame {

    private Calendar calendar;
    private SimpleDateFormat timeFormat;
    private SimpleDateFormat dayFormat;
    private SimpleDateFormat dateFormat;
    private JLabel timeLabel;
    private JLabel dayLabel;
    private JLabel dateLabel;
    private String time;
    private String day;
    private String date;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public SimpleDateFormat getTimeFormat() {
        return timeFormat;
    }

    public SimpleDateFormat getDayFormat() {
        return dayFormat;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public JLabel getTimeLabel() {
        return timeLabel;
    }

    public JLabel getDayLabel() {
        return dayLabel;
    }

    public JLabel getDateLabel() {
        return dateLabel;
    }

    private boolean isRunning = true;

    DigitalClock() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        //noinspection SpellCheckingInspection
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));


        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }
    DigitalClock(String title) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        //noinspection SpellCheckingInspection
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));


        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }
    public void stopClock() {
        isRunning = false;
    }
    public void startClock() {
        isRunning = true;
    }

    private void setTime() {
        //noinspection InfiniteLoopStatement
        while (isRunning) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
