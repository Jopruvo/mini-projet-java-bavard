public class Bavard implements PapotageListener{
    
    private String pseudonyme = "Whatsup";
    private Concierge concierge;
    private Compte compte;

    public void listen(PapotageEvent e){

    }

    public Bavard(String pseudonyme, Concierge concierge, Compte compte){
        this.pseudonyme = pseudonyme;
        this.concierge = concierge;
        this.compte = compte;
    }

<<<<<<< HEAD
=======
    public String getPseudo(){
        return this.pseudonyme;
    }

>>>>>>> a9885e2 (Changement GUI avec vérification compte)
    public Concierge getConcierge(){
        return this.concierge;
    }

    public void setConcierge(Concierge c){
        this.concierge = c;
    }

    public String getPseudo(){
        return this.pseudonyme;
    }
}
