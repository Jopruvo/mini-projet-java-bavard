public class Compte {
    
    private String eMail = "prenom.nom@super-messagerie.fr";
    private String password = "password";
    private String pseudo = "NomPrenom";
    private String type = "User";

    public Compte(String eMail, String password, String pseudo, String type){
        this.eMail = eMail;
        this.password = password;
        this.pseudo = pseudo;
        this.type = type;
    }

    public String getEMail(){
        return this.eMail;
    }

    public String getPassword(){
        return this.password;
    }

    public String getPseudo(){
        return this.pseudo;
    }

    public String getType(){
        return this.type;
    }
}
