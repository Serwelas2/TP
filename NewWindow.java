import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class NewWindow {

	NewWindow(){
		ImageIcon image = new ImageIcon("logo.png");
   	    ImageIcon img = new ImageIcon("logos.png");
        Border border = BorderFactory.createLineBorder(Color.yellow,2); 
        
        JTextField textField = new JTextField();
        
        JLabel label = new JLabel("WELCOME TO");
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0,0,0));
        label.setFont(new Font(null,Font.PLAIN,50));
        label.setIconTextGap(-65);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        JFrame frame = new JFrame();
        frame.setTitle("STI ACADEMY");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.add(label);
        frame.setLocationRelativeTo(null);
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(255,255,255));
       
	}
}
