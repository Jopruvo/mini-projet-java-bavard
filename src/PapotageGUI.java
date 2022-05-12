import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.*;

public class PapotageGUI extends JFrame implements ActionListener{

    private Container pan = getContentPane();
    private JButton adminButton;
    private JButton userButton;
	
    public PapotageGUI(){
        this.adminButton = new JButton("Admin");
        this.userButton = new JButton("User");
        this.adminButton.setBounds(40,10,120,40);
		this.adminButton.addActionListener(this);
        this.userButton.setBounds(200,10,120,40);
		this.userButton.addActionListener(this);
        this.pan.add(this.adminButton, BorderLayout.CENTER);
        this.pan.add(this.userButton, BorderLayout.CENTER);
        this.setSize(500,400);
		this.setLayout(null);
		this.setVisible(true);
    }

    
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.adminButton){
            new PapotageGUIAdmin();
        }
        if (e.getSource() == this.userButton){
            new PapotageGUIUser();
        }
	}
}