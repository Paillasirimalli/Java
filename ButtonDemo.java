impoert java.awt.*;
public class ButtonDemo extends panel
{
public ButtonDemo()
{
Button b1 = new Button("RED!!");
Button b2 = new Button("GREEN!!");
Button b3 = new Button("WHITE!!");
b3.setLabel("WHITE!!");
b1.setFont(new Font("SansSerif",Font.PLAIN,18));
add(b1);
add(b2);
add(b3);
}
public static void main(String[] args)
{
	ButtonDemo bobj=new ButtonDemo()
	Frame f=new Frame("Buttons");
	f.add(bobj);
	f.pack();
	f.setVisible(true);
}
}