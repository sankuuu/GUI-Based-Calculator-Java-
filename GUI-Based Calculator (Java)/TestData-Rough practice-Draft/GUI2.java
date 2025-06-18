import java.awt.*;
import java.awt.event.*;

class GUI2
{
    public static void main(String A[])
    {
        Frame fobj = new Frame("FrameTest 2");
        fobj.setSize(400,400);
        fobj.setVisible(true);
        fobj.addWindowListener(new TestingCode());
    }
}

class TestingCode implements WindowListener
{
    public void windowDeactivated(WindowEvent obj)  
    {}
    public void windowActivated(WindowEvent obj)  
    {}
    public void windowDeiconified(WindowEvent obj)  
    {}
    public void windowIconified(WindowEvent obj)  
    {}
    public void windowClosed(WindowEvent obj)  
    {}
    public void windowClosing(WindowEvent obj)  
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent obj)  
    {}
}