import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.*;

public class PapotageGUIAdmin  extends JFrame implements ActionListener{
    
	private JTextField text;
	private JTextField text2;
    private JTextField mainText;
    private Container pan = getContentPane();
	private JButton button;
	private Concierge admin;
	private Compte compte;

    public PapotageGUIAdmin() {
        this.mainText = new JTextField("Bienvenue Administrateur69 !");
		this.text = new JTextField("Enter a name");
		this.text2 = new JTextField();
        this.mainText.setEditable(false);
        this.mainText.setBounds(40, 50, 280, 30);
		this.text.setEditable(true);
		this.text.setBounds(40,90,280,30);
		this.text2.setBounds(40,140,280,30);
		this.text2.setEditable(false);
		this.button = new JButton("Cliquez pour ajouter un nouveau Bavard");
        // add admin Buttons
		this.button.setBounds(30,180,300,40);
		this.button.addActionListener(this);
        this.pan.add(this.mainText, BorderLayout.NORTH);
		this.pan.add(this.text, BorderLayout.NORTH);
		this.pan.add(this.text2, BorderLayout.NORTH);
		this.pan.add(this.button, BorderLayout.CENTER);
		this.setSize(500,400);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent e) {
		String name = this.text.getText();
		String result = "";
        if (e.getSource() == this.button && admin.verifyNameIntegrity(name)) {
            result = name + " a été ajouté comme nouveau Bavard";
            admin.createBavard(compte);
        }
		this.text2.setText(result);		
	}
}
