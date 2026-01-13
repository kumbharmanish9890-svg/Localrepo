package Manish.LocalRepo;
import java.awt.*;
import javax.swing.*;

class myPanel extends JPanel{
    myPanel()
    {
        for(int i =1;i<=5;i++)
            add(new JButton("Press"+1));
    }
}
class SF extends JFrame
{
    SF()
    {
        setSize(300,200);

        myPanel panel = new myPanel();
        Container cp = getContentPane();
        cp.add(panel);
    }
}
public class javaFlow {
    public static void main(String args[])
    {
        SF frame = new SF();
        frame.show();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
