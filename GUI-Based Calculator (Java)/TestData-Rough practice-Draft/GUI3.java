import java.awt.*;
import java.awt.event.*;

class GUI3
{
    public static void main(String A[])
    {
        Frame fobj = new Frame("Testing Code 3");
        fobj.setSize(400,400);
        fobj.setVisible(true);
        fobj.addWindowListener(new TestCode3());
    }
}

class TestCode3 extends WindowAdapter
{
    public void windowClosing(WindowEvent obj)  
    {
        System.exit(0);
    }
}