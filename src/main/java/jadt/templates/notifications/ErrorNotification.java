package jadt.templates.notifications;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

@SuppressWarnings("ALL")
public class ErrorNotification {

	private short x = 600;
	private short y = 175;
	final public int imageSizeY =  92;
	final public int imageSizeX =  84;

	JLabel IconImage = new JLabel("");
	JFrame frame;
	JButton ok = new JButton("Ok");
	String temp = ok.getText();
	JButton cancel = new JButton();
	String temp2 = cancel.getText();
	JLabel ErrorText;
	public ErrorNotification(String Title,int x,int y)
	{
		frame =  new JFrame(Title);
		frame.setSize(x,y);
	}
	public void SetErrorText(String displayText)
	{
		var ErrorText = new JLabel(displayText);
		ErrorText.setBounds(102, 17, 492, 113);
		frame.add(ErrorText);
	}
	public void SetIcon(String filePathWithName) {
		IconImage.setIcon(new ImageIcon(ErrorNotification.class.getResource(filePathWithName)));
	}
	public void setSizeOfText(short x,short y) {
		ErrorText.setSize(y, x);
	}
	public void setTitle(String Title)
	{
		ErrorText.setName(Title);
	}
	public void setDefaults()
	{
		String pathOfFile = "jadt/resources/error.png";
		frame.setBounds(100, 100, 600, 175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
		frame.setIconImage(icon);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		IconImage.setIcon(new ImageIcon(Objects.requireNonNull(ErrorNotification.class.getResource(pathOfFile))));
		IconImage.setBounds(6, 23, 84, 92);
		frame.add(IconImage);
		ok.setBounds(0,0,580,165);
		frame.add(ok);
	}
	public void setBackgroundColor(Color color)
	{
		frame.setBackground(color);
	}
	public void setFont(String FontName,String FontType,short size)
	{
		if(FontType.equals("Plain"))ErrorText.setFont(new Font(FontName, Font.PLAIN, size));
		if(FontType.equals("Bold"))ErrorText.setFont(new Font(FontName, Font.BOLD, size));
		if(FontType.equals("Italic"))ErrorText.setFont(new Font(FontName, Font.ITALIC, size));

	}
	public void setTitleIcon(String pathOfFile)
	{
		Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
		frame.setIconImage(icon);
	}
	public void setButtonMessage(String buttonMessage)
	{
		ok.setText(buttonMessage);
	}
	public void setButtonSize(Dimension dim)
	{
		ok.setPreferredSize(dim);
	}
	public void setPositionOfOkButton(short x,short y)
	{
		ok.setLocation(x,y);
	}
	public void setPositionOfCancelButton(short x,short y)
	{
		cancel.setLocation(x,y);
	}
	public void setSizeOfWindow(short x, short y)
	{
		this.x = x;
		this.y = y;
		frame.setSize(this.x,this.y);
	}
	public short getXOfWindow()
	{
		return x;
	}
	public short getYOfWindow()
	{
		return y;
	}
	public short getYOfOkButton()
	{
		short buttony = 175;
		return buttony;
	}
	public short getXOfOkButton()
	{
		short buttonx = 600;
		return buttonx;
	}
	public short getYOfCancelkButton()
	{
		short cancelButtony = 175;
		return cancelButtony;
	}
	public short getXOfCancelButton()
	{
		short cancelButtonx = 600;
		return cancelButtonx;
	}
	public void AddCancelButton()
	{
		cancel.setBounds(100, 100, 590, 175);
		frame.add(cancel);

	}
	public void setButtonOkFont(String FontName,String FontType,short size)
	{
		if(FontType.equals("Plain"))ok.setFont(new Font(FontName, Font.PLAIN, size));
		if(FontType.equals("Bold"))ok.setFont(new Font(FontName, Font.BOLD, size));
		if(FontType.equals("Italic"))ok.setFont(new Font(FontName, Font.ITALIC, size));
	}
	public void setButtonCancelFont(String FontName,String FontType,short size)
	{
		if(FontType.equals("Plain"))cancel.setFont(new Font(FontName, Font.PLAIN, size));
		if(FontType.equals("Bold"))cancel.setFont(new Font(FontName, Font.BOLD, size));
		if(FontType.equals("Italic"))cancel.setFont(new Font(FontName, Font.ITALIC, size));
	}

	public void trimTextOfCancelButton()
	{
		String temp =cancel.getText().trim();
		cancel.setText(temp);
	}
	public void trimTextOfOkButton()
	{
		String temp =ok.getText().trim();
		ok.setText(temp);
	}
}
