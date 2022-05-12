import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.*;

public class PapotageGUI extends JFrame implements ActionListener{
    private JTextField text;
	private JTextField text2;
    private JTextField mainText;
	private Container pan = getContentPane();
	private JButton button;
    private JButton adminPanel;
    private JButton userPanel;
	
	public PapotageGUI() {
        this.mainText = new JTextField("Bienvenue Administrateur0690 !");
		this.text = new JTextField("Enter a name");
		this.text2 = new JTextField();
        this.mainText.setEditable(false);
        this.mainText.setBounds(40, 50, 280, 30);
		this.text.setEditable(true);
		this.text.setBounds(40,90,280,30);
		this.text2.setBounds(40,140,280,30);
		this.text2.setEditable(false);
		this.button = new JButton("Cliquez pour ajouter un nouveau Bavard");
        this.adminPanel = new JButton("A");
        this.userPanel = new JButton("U");

		this.button.setBounds(30,180,300,40);
		this.button.addActionListener(this);
        this.adminPanel.setBounds(40, 10, 40, 40);
        this.adminPanel.addActionListener(this);
        this.userPanel.setBounds(280, 10, 40, 40);
        this.userPanel.addActionListener(this);
        this.pan.add(this.mainText, BorderLayout.NORTH);
		this.pan.add(this.text, BorderLayout.NORTH);
		this.pan.add(this.text2, BorderLayout.NORTH);
		this.pan.add(this.button, BorderLayout.CENTER);
        this.pan.add(this.adminPanel, BorderLayout.CENTER);
        this.pan.add(this.userPanel, BorderLayout.CENTER);
		this.setSize(500,400);
		this.setLayout(null);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e, int id, Concierge admin, Bavard nom) {
		String name = this.text.getText();
		String result = "";
        admin = new Concierge(id);
        nom = new Bavard(name, admin);
		if (e.getSource() == this.button) {
			result = name + " a été ajouté comme nouveau Bavard";
            admin.createBavard(nom);
		}
		this.text2.setText(result);

	}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}