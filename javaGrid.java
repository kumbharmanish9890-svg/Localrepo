
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;


class frm1 extends JFrame implements ActionListener
{
    JLabel lbMsg;
    JButton btn1,btn2;
    JPanel panel;

    frm1()
    {
        setSize(500,300);
        setTitle("welcome");
        setLayout(null);

        panel = new JPanel();
        panel.setBounds(0,0,500,300);
        add(panel);
        panel.setLayout(new GridLayout(3,4,50,90));

        btn1 =  new JButton("RITA");
        panel.add(btn1);
        btn1.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                lbMsg.setText("KUMBHAR GALLI");
            }
        });


    }
}
class javaGrid
{
    public static void main(String args[])
    {
        frm1 obj = new frm1();
        obj.show();
        
        obj.setDefaultCloseOperation(3);
        
    }  
}