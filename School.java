import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.Border;
public class School extends JFrame implements ActionListener{
	JButton button;
	JButton add;
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JTextArea outputArea = new JTextArea(8, 22);
    
    JTextField ln = new JTextField();
    JTextField fn = new JTextField();
    JTextField mi = new JTextField();
    JTextField cn = new JTextField();
    JTextField fa = new JTextField();
    JTextField sn = new JTextField();
    JTextField ea = new JTextField();

    Font titleFont = new Font("Arial", Font.BOLD, 20);
    Font labelFont = new Font("Arial", Font.BOLD, 15);
    
    public void GUISchool(){
	
        setTitle("STI Academy");
        setSize(480, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        
        JLabel label = new JLabel("Create a STI Account");
        label.setBounds(130, 10, 200, 30);
        label.setFont(titleFont);
        add(label);
        
        JLabel FN = new JLabel("First Name");
        FN.setBounds(195, 50, 165, 30);
        FN.setFont(labelFont);
        add(FN);
        fn.setBounds(150, 80, 165, 30);
        add(fn);

        JLabel MI = new JLabel("Middle Initial");
        MI.setBounds(195, 110, 165, 30);
        MI.setFont(labelFont);
        add(MI);
        mi.setBounds(150, 140, 165, 30);
        add(mi);

        JLabel LN = new JLabel("Last Name");
        LN.setBounds(195, 170, 165, 30);
        LN.setFont(labelFont);
        add(LN);
        ln.setBounds(150, 200, 165, 30);
        add(ln);

        JLabel CN = new JLabel("Contact Number");
        CN.setBounds(180, 230, 165, 30);
        CN.setFont(labelFont);
        add(CN);
        cn.setBounds(150, 260, 165, 30);
        add(cn);

        JLabel FA = new JLabel("Full Address");
        FA.setBounds(185, 290, 165, 30);
        FA.setFont(labelFont);
        add(FA);
        fa.setBounds(150, 320, 165, 30);
        add(fa);

        JLabel SN = new JLabel("Student Number");
        SN.setBounds(180, 350, 165, 30);
        SN.setFont(labelFont);
        add(SN);
        sn.setBounds(150, 380, 165, 30);
        add(sn);

        JLabel EA = new JLabel("Email Address");
        EA.setBounds(180, 410, 165, 30);
        EA.setFont(labelFont);
        add(EA);
        ea.setBounds(150, 440, 165, 30);
        add(ea);

        button = new JButton("Register");
        button.setBounds(157, 500, 150, 40);
        button.addActionListener(new addButton());
        add(button);
        button.setFocusable(false);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        JLabel space = new JLabel(" ");
        space.setBounds(150, 400, 100, 30);
        add(space);

        setVisible(true);
        
        ImageIcon image = new ImageIcon("logo.png");
    	this.setIconImage(image.getImage());   	
    }

    public class addButton implements ActionListener{
        public void actionPerformed(ActionEvent a){
        	
        	String firstnameText = fn.getText();
            String middleInitialText = mi.getText();
        	String lastnameText = ln.getText();
            String contactNumberText = cn.getText();
            String fullAddressText = fa.getText();
            String studentNumberText = sn.getText();
            String emailAddressText = ea.getText();
          
            if(firstnameText.isEmpty() || middleInitialText.isEmpty() || lastnameText.isEmpty() || contactNumberText.isEmpty() || fullAddressText.isEmpty() || studentNumberText.isEmpty() || emailAddressText.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill up all the fields.");
                button.setEnabled(true);		
                
            }else{
                try{
                    FileWriter writer = new FileWriter("student.txt", true);
                    writer.write(firstnameText + " " + middleInitialText + " " + lastnameText + " " + contactNumberText + " " + fullAddressText + " " + studentNumberText + " " + emailAddressText + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(null, "REGISTRATION SUCCESS");	
                	
                    NewWindow myWindow = new NewWindow();
   	    	
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        }
}
    public static void main(String[] args) {
        School school = new School();
        school.GUISchool();
    }
	@Override
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==button) {
			this.dispose();
			System.out.println("You just sign in.");
			NewWindow myWindow = new NewWindow();
		}
	}
}