import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.*;

public class PapotageGUILogAdmin extends JFrame implements ActionListener{
    
    private Container pan = getContentPane();
    private JTextField mainLogText;
    private JTextField login;
    private JTextField login2;
    private JTextField login3;
    private JButton buttonAdmin;
    private Compte admin1 = new Compte("admin1@super-messagerie.fr", "SigmaM4l3!", "Admin1", "Admin");
    private Compte admin2 = new Compte("admin2@super-messagerie.fr", "SigmaM4l3!", "Admin2", "Admin");

    public PapotageGUILogAdmin(){
        this.mainLogText = new JTextField("Bienvenue Administrateur inconnu !");
		this.login = new JTextField("Enter a name");
		this.login2 = new JTextField("Entrez un mot de passe");
        this.login3 = new JTextField();
        this.mainLogText.setEditable(false);
        this.mainLogText.setBounds(40, 50, 280, 30);
		this.login.setEditable(true);
		this.login.setBounds(40,90,280,30);
		this.login2.setBounds(40,140,280,30);
		this.login2.setEditable(true);
		this.login3.setBounds(50,240,320,30);
        this.login3.setEditable(false);
        // add User buttons
        this.buttonAdmin = new JButton("Connexion");
        this.buttonAdmin.setBounds(60,180,150,40);
		this.buttonAdmin.addActionListener(this);
        this.pan.add(this.mainLogText, BorderLayout.CENTER);
		this.pan.add(this.login, BorderLayout.CENTER);
		this.pan.add(this.login2, BorderLayout.CENTER);
        this.pan.add(this.login3, BorderLayout.CENTER);
        this.pan.add(this.buttonAdmin, BorderLayout.CENTER);
		this.setSize(600,400);
		this.setLayout(null);
		this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        String log = this.login.getText();
        String pw = this.login2.getText();
        if (log == admin1.getPseudo() && pw == admin1.getPassword() || log == admin2.getPseudo() && pw == admin2.getPassword()){
            if (e.getSource() == this.buttonAdmin) {
                this.dispose();
                new PapotageGUIAdmin();
            }
        }
    }
}