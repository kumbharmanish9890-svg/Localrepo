//package Manish.LocalRepo;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
class myPanel1 extends JPanel
{
    JLabel lblMsg;

    myPanel1()
    {
        setLayout(new BorderLayout());

        lblMsg = new JLabel("MY PROGRAM",JLabel.CENTER);
        add(lblMsg,BorderLayout.EAST);

        JButton btnEast = new JButton("East-Bhushan");
        add(btnEast,BorderLayout.EAST);
        btnEast.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                lblMsg.setText("Mahesh pravin mali,shahada");
            }
            
        });
        JButton btnWest = new JButton("West-Mohan");
        add(btnWest,BorderLayout.WEST);
        btnWest.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                lblMsg.setText("Mohan kumbhar,Shahada");
            }
        });
    }
}
class SF1 extends JFrame
{
    SF1()
    {
        setSize(500,400);
        setTitle("Star of Manish");
        myPanel1 panel = new myPanel1();
        Container cp = getContentPane();
        cp.add(panel);
    }
}
class javaBorder
{
    public static void main(String[] args)
    {
            SF1 obj = new SF1();
            
            obj.show();
            obj.setDefaultCloseOperation(3);
    }
}