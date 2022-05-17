import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.*;

public class PapotageGUILogUser extends JFrame implements ActionListener{
    
    private JTextField mainText2;
    private JTextField login;
    private JTextField login2;
    private JTextField login3;
    private JButton buttonUser;
    private Container pan = getContentPane();
    
    public PapotageGUILogUser(){
        this.mainText2 = new JTextField("Bienvenue Utilisateur inconnu !");
		this.login = new JTextField("Enter a name");
		this.login2 = new JTextField("Entrez un mot de passe");
        this.login3 = new JTextField();
        this.mainText2.setEditable(false);
        this.mainText2.setBounds(40, 50, 280, 30);
		this.login.setEditable(true);
		this.login.setBounds(40,90,280,30);
		this.login2.setBounds(40,140,280,30);
		this.login2.setEditable(true);
		this.login3.setBounds(100,240,280,30);
        this.login3.setEditable(false);
        // add User buttons
        this.buttonUser = new JButton("Connexion");
        this.buttonUser.setBounds(60,180,150,40);
		this.buttonUser.addActionListener(this);
        this.pan.add(this.mainText2, BorderLayout.CENTER);
		this.pan.add(this.login, BorderLayout.CENTER);
		this.pan.add(this.login2, BorderLayout.CENTER);
        this.pan.add(this.login3, BorderLayout.CENTER);
        this.pan.add(this.buttonUser, BorderLayout.CENTER);
		this.setSize(600,400);
		this.setLayout(null);
		this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
    public void actionPerformed(ActionEvent e) {
        String log = this.login.getText();
        String pw = this.login2.getText();
        if (e.getSource() == this.buttonUser) {
            this.dispose();
            new PapotageGUIUser();
        }
    }
}
