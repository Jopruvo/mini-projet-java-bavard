import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class PapotageGUINewUser extends JFrame implements ActionListener{
    
    private JTextField mainText2;
    private JTextField login;
    private JTextField login2;
    private JTextField login2b;
    private JTextField login3;
    private JButton buttonUser;
    private Container pan = getContentPane();
    private List<Compte> listCompteUser = new ArrayList<>();
    //private Concierge admin;
    
    public PapotageGUINewUser(){
        this.mainText2 = new JTextField("Bienvenue nouvel Utilisateur !");
		this.login = new JTextField("Entrez un eMail");
		this.login2 = new JTextField("Entrez un nom");
        this.login2b = new JTextField("Entrez un mot de passe");
        this.login3 = new JTextField();
        this.mainText2.setEditable(false);
        this.mainText2.setBounds(40, 50, 280, 30);
		this.login.setEditable(true);
		this.login.setBounds(40,90,280,30);
		this.login2.setBounds(40,140,280,30);
		this.login2.setEditable(true);
        this.login2b.setBounds(40,190,280,30);
        this.login2b.setEditable(true);
		this.login3.setBounds(100,290,280,30);
        this.login3.setEditable(false);
        // add User buttons
        this.buttonUser = new JButton("Inscription");
        this.buttonUser.setBounds(60,240,150,40);
		this.buttonUser.addActionListener(this);
        this.pan.add(this.mainText2, BorderLayout.CENTER);
		this.pan.add(this.login, BorderLayout.CENTER);
		this.pan.add(this.login2, BorderLayout.CENTER);
        this.pan.add(this.login2b, BorderLayout.CENTER);
        this.pan.add(this.login3, BorderLayout.CENTER);
        this.pan.add(this.buttonUser, BorderLayout.CENTER);
		this.setSize(600,400);
		this.setLayout(null);
		this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
    public void actionPerformed(ActionEvent e) {
        String log = this.login2.getText();
        String logMail = this.login.getText();
        String pw = this.login2b.getText();
        String result = "";
        if (e.getSource() == this.buttonUser) {
            result = "Vous êtes inscrit " + log;
            this.dispose();
            new PapotageGUIUser();
        }
        listCompteUser.add(new Compte(logMail, pw, log, "User"));
        //new Bavard(log, admin, new Compte(logMail, pw, log, "User"));
        this.login3.setText(result);
    }

    public List<Compte> getComptes(){
        return listCompteUser;
        }
            
}

