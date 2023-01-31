//Julia Cable
//10/27/21

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;


public class ReesesPieces extends JFrame
{
    JLabel yellow;
    JLabel orange;
    JLabel brown;
    
    JPanel yPlusMinus;
    JPanel oPlusMinus;
    JPanel bPlusMinus;
    
    JButton yellowPlus;
    JButton orangePlus;
    JButton brownPlus;
    
    JButton yellowMinus;
    JButton orangeMinus;
    JButton brownMinus;
    
    JButton reset;
    
    int totalY = 0;
    int totalO = 0;
    int totalB = 0;
    
    
    public ReesesPieces()
    {
        super("Reese's Pieces Color Counter");
        setLayout(new GridLayout(4,2,0,10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
       
        
     // yellow 
        yellow = new JLabel("yellow: 0");
        yellow.setFont(new Font("DialogInput", Font.BOLD, 25));
        yellow.setForeground(new Color(250,230,0));
        yellow.setHorizontalAlignment(JLabel.CENTER);
        add(yellow);
       
        yPlusMinus = new JPanel();
        yPlusMinus.setLayout(new GridLayout(1,2,5,5));
    
        yellowPlus = new JButton("+");
        yellowMinus = new JButton("-");
        yPlusMinus.add(yellowPlus);
        yPlusMinus.add(yellowMinus);
        
        YellowHandler y = new YellowHandler();
        yellowPlus.addActionListener(y);
        yellowMinus.addActionListener(y);
        
        add(yPlusMinus);
        

        
        
    // orange
        
        orange = new JLabel("orange: 0");
        orange.setFont(new Font("DialogInput", Font.BOLD, 25));
        orange.setForeground(new Color(250,120,30));
        orange.setHorizontalAlignment(JLabel.CENTER);
        add(orange);
        
        oPlusMinus = new JPanel();
        oPlusMinus.setLayout(new GridLayout(1,2,5,5));
        
        orangePlus = new JButton("+");
        orangeMinus = new JButton("-");
        oPlusMinus.add(orangePlus);
        oPlusMinus.add(orangeMinus);
        
        OrangeHandler o = new OrangeHandler();
        orangePlus.addActionListener(o);
        orangeMinus.addActionListener(o);
        
        add(oPlusMinus);
        
        
        
    // brown
        brown = new JLabel("brown: 0");
        brown.setFont(new Font("DialogInput", Font.BOLD, 25));
        brown.setForeground(new Color(100,40,0));
        brown.setHorizontalAlignment(JLabel.CENTER);
        add(brown);
        
        bPlusMinus = new JPanel();
        bPlusMinus.setLayout(new GridLayout(1,2,5,5));
        
        brownPlus = new JButton("+");
        brownMinus = new JButton("-");
        bPlusMinus.add(brownPlus);
        bPlusMinus.add(brownMinus);
        
        BrownHandler b = new BrownHandler();
        brownPlus.addActionListener(b);
        brownMinus.addActionListener(b);
        
        add(bPlusMinus);
        
        
        
     //reset button
        reset = new JButton("Reset Counts");
        ResetHandler h = new ResetHandler();
        reset.addActionListener(h);
        add(reset);
    }
    
    private class YellowHandler implements ActionListener
    {
       @Override
       public void actionPerformed(ActionEvent e)
        {
           if(e.getActionCommand().equals("+"))
            {
                totalY++;
            }
           else if(e.getActionCommand().equals("-"))
            {
                if(totalY>0)
                    totalY--;
            }
           yellow.setText("yellow: " + totalY);
        }
    }
    
    private class OrangeHandler implements ActionListener
    {
       @Override
       public void actionPerformed(ActionEvent e)
        {
           if(e.getActionCommand().equals("+"))
            {
                totalO++;
            }
           else if(e.getActionCommand().equals("-"))
            {
                if(totalO>0)
                    totalO--;
            }
           orange.setText("orange: " + totalO);
        }
    }
    
    private class BrownHandler implements ActionListener
    {
       @Override
       public void actionPerformed(ActionEvent e)
        {
           if(e.getActionCommand().equals("+"))
            {
                totalB++;
            }
           else if(e.getActionCommand().equals("-"))
            {
                if(totalB>0)
                    totalB--;
            }
           brown.setText("brown: " + totalB);
        }
    }
    
    private class ResetHandler implements ActionListener
    {
       @Override
       public void actionPerformed(ActionEvent e)
        {
           totalY = 0;
           totalO = 0;
           totalB = 0;
           
           yellow.setText("yellow: " + totalY);
           orange.setText("orange: " + totalO);
           brown.setText("brown: " + totalB);
           
        }
    }
    
    public static void main(String[]args)
    {
        ReesesPieces count = new ReesesPieces();
        count.setVisible(true);
    }
}