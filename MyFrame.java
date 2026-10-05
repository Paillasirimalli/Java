import java .awt.Frame;
public class MyFrame extends Frame{
MyFrame(String str)
{
super(str)
}
public static void main(String[] args){
Frame f = new Frame("MY SECOND FRAME");
f.setSize(300,300);
f.setVisible(true)
}
}