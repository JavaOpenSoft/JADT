package jadt.templates.terminal;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Terminal implements KeyListener {
    String commands;
    JFrame frame = new JFrame("Terminal");
    JScrollPane scrollPane = new JScrollPane();
    TextArea textArea = new TextArea();
    CommandProcessor processor = CommandProcessor.getInstance();
    String username = System. getProperty("user.name");
    String SystemName = InetAddress.getLocalHost().getHostName();
    public Terminal() throws UnknownHostException {
        textArea.append(username+"@"+username +"-" +SystemName);

        scrollPane.add(textArea);
        frame.add(scrollPane);
        frame.setVisible(true);

    }
    public void run(String commands) throws IOException {
        processor.run(commands);
        this.commands = commands;
    }
    public String getPreviousCommand(){
        return commands;
    }
    public CommandProcessor getInstance()
    {
        return CommandProcessor.getInstance();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
class CommandProcessor {
    private CommandProcessor() {
    }

    public void run(String command) throws IOException {
        Runtime.getRuntime().exec(command);
    }

    public static CommandProcessor getInstance() {
        return CommandProcessorHolder.INSTANCE;
    }

    private static final class CommandProcessorHolder {
        static final CommandProcessor INSTANCE = new CommandProcessor();
    }
}