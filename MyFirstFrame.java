
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class MyFirstFrame extends JFrame 
{
    private JPanel namePn;
    private JPanel surnamePn;
    private JPanel nameAndSurnamePn;
    private JPanel greetingAreaPn;
    private JPanel btnPn;
    private JPanel mainPn;
    private JPanel headingPn;
    
    private JLabel headingLb;
    private JLabel nameLb;
    private JLabel surnameLb;
    
    private JTextField nameTxt;
    private JTextField surnameTxt;
    
    private JTextArea greetingTxtArea;
    
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public MyFirstFrame()
    {
        setLayout(new BorderLayout());
        setTitle("Greeting GUI");
        setSize(700, 750);
        setBackground(Color.YELLOW);
        
        //create panels
        namePn = new JPanel(new FlowLayout());
        surnamePn = new JPanel(new FlowLayout());
        
        nameAndSurnamePn = new JPanel(new GridLayout(2,1));
        
        greetingAreaPn = new JPanel(new FlowLayout());
        greetingAreaPn.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Greetings"));
        
        btnPn = new JPanel(new FlowLayout());
        mainPn = new JPanel(new BorderLayout());
        
        headingPn = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPn.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        headingLb = new JLabel("Greeting App");
        nameLb = new JLabel("Name: ");       
        surnameLb = new JLabel("Surname: ");       
                
        nameTxt = new JTextField(20);
        surnameTxt = new JTextField(20);
        
        greetingTxtArea = new JTextArea(40, 50);
        greetingTxtArea.setEditable(false);
        greetingTxtArea.setText("Hello [name] [surname]");
        
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        
        //add label to their panels
        namePn.add(nameLb);
        namePn.add(nameTxt);
        
        surnamePn.add(surnameLb);
        surnamePn.add(surnameTxt);
        
        nameAndSurnamePn.add(namePn);
        nameAndSurnamePn.add(surnamePn);
        
        greetingAreaPn.add(greetingTxtArea);
        
        btnPn.add(greetBtn);
        btnPn.add(clearBtn);
        btnPn.add(exitBtn);
        
        mainPn.add(nameAndSurnamePn, BorderLayout.NORTH);
        mainPn.add(greetingAreaPn, BorderLayout.CENTER);
        mainPn.add(btnPn, BorderLayout.SOUTH);
        
        add(headingPn, BorderLayout.NORTH);
        add(mainPn,BorderLayout.CENTER);
        setVisible(true);
    }   
    
  
    
}
